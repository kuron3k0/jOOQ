/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.econcom)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.keyword;
import static org.jooq.impl.DSL.sql;

import java.sql.Date;

import org.jooq.Configuration;
import org.jooq.DatePart;
import org.jooq.Field;
import org.jooq.QueryPart;
import org.jooq.exception.SQLDialectNotSupportedException;

/**
 * @author Lukas Eder
 */
class DateAdd<T extends java.util.Date> extends AbstractFunction<T> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -19593015886723235L;

    private final Field<T>                date;
    private final Field<? extends Number> interval;
    private final DatePart                datePart;

    DateAdd(Field<T> date, Field<? extends Number> interval, DatePart datePart) {
        super("dateadd", date.getDataType());

        this.date = date;
        this.interval = interval;
        this.datePart = datePart;
    }

    @Override
    final QueryPart getFunction0(Configuration configuration) {
        String keyword = null;

        switch (configuration.family()) {
            case CUBRID:
            case MARIADB:
            case MYSQL: {
                switch (datePart) {
                    case YEAR:   keyword = "year";   break;
                    case MONTH:  keyword = "month";  break;
                    case DAY:    keyword = "day";    break;
                    case HOUR:   keyword = "hour";   break;
                    case MINUTE: keyword = "minute"; break;
                    case SECOND: keyword = "second"; break;
                    default: throwUnsupported();
                }

                return field("{date_add}({0}, {interval} {1} {2})", getDataType(), date, interval, keyword(keyword));
            }

            case DERBY:
            case HSQLDB: {
                switch (datePart) {
                    case YEAR:   keyword = "sql_tsi_year";   break;
                    case MONTH:  keyword = "sql_tsi_month";  break;
                    case DAY:    keyword = "sql_tsi_day";    break;
                    case HOUR:   keyword = "sql_tsi_hour";   break;
                    case MINUTE: keyword = "sql_tsi_minute"; break;
                    case SECOND: keyword = "sql_tsi_second"; break;
                    default: throwUnsupported();
                }

                return field("{fn {timestampadd}({0}, {1}, {2}) }", getDataType(), keyword(keyword), interval, date);
            }

            case FIREBIRD: {
                switch (datePart) {
                    case YEAR:   keyword = "year";   break;
                    case MONTH:  keyword = "month";  break;
                    case DAY:    keyword = "day";    break;
                    case HOUR:   keyword = "hour";   break;
                    case MINUTE: keyword = "minute"; break;
                    case SECOND: keyword = "second"; break;
                    default: throwUnsupported();
                }

                return field("{dateadd}({0}, {1}, {2})", getDataType(), keyword(keyword), interval, date);
            }

            case H2: {
                switch (datePart) {
                    case YEAR:   keyword = "year";   break;
                    case MONTH:  keyword = "month";  break;
                    case DAY:    keyword = "day";    break;
                    case HOUR:   keyword = "hour";   break;
                    case MINUTE: keyword = "minute"; break;
                    case SECOND: keyword = "second"; break;
                    default: throwUnsupported();
                }

                return field("{dateadd}({0}, {1}, {2})", getDataType(), inline(keyword), interval, date);
            }

            /* [pro] */
            // It appears that using interval arithmetic is preferrable over
            // using dateadd in Redshift in edge-cases. E.g.:
            // - dateadd('year', 1, date '2012-02-29') = 2013-03-01
            // - date '2012-02-29' + '1 year'::interval = 2013-02-28 (expected)
            case REDSHIFT:
            /* [/pro] */
            case POSTGRES: {
                switch (datePart) {
                    case YEAR:   keyword = " year";   break;
                    case MONTH:  keyword = " month";  break;
                    case DAY:    keyword = " day";    break;
                    case HOUR:   keyword = " hour";   break;
                    case MINUTE: keyword = " minute"; break;
                    case SECOND: keyword = " second"; break;
                    default: throwUnsupported();
                }

                // [#3824] Ensure that the output for DATE arithmetic will also
                // be of type DATE, not TIMESTAMP
                if (getDataType().getType() == Date.class)
                    return field("({0} + ({1} || {2})::interval)::date", getDataType(), date, interval, inline(keyword));
                else
                    return field("({0} + ({1} || {2})::interval)", getDataType(), date, interval, inline(keyword));
            }

            case SQLITE: {
                switch (datePart) {
                    case YEAR:   keyword = " year";   break;
                    case MONTH:  keyword = " month";  break;
                    case DAY:    keyword = " day";    break;
                    case HOUR:   keyword = " hour";   break;
                    case MINUTE: keyword = " minute"; break;
                    case SECOND: keyword = " second"; break;
                    default: throwUnsupported();
                }

                return field("{datetime}({0}, '+' || {1} || {2})", getDataType(), date, interval, inline(keyword));
            }

            /* [pro] */
            case ACCESS: {
                switch (datePart) {
                    case YEAR:   keyword = "yyyy"; break;
                    case MONTH:  keyword = "m";    break;
                    case DAY:    keyword = "d";    break;
                    case HOUR:   keyword = "h";    break;
                    case MINUTE: keyword = "n";    break;
                    case SECOND: keyword = "s";    break;
                    default: throwUnsupported();
                }

                return field("{dateadd}({0}, {1}, {2})", getDataType(), inline(keyword), interval, date);
            }

            case ASE:
            case SYBASE:
            case SQLSERVER: {
                switch (datePart) {
                    case YEAR:   keyword = "yy"; break;
                    case MONTH:  keyword = "mm"; break;
                    case DAY:    keyword = "dd"; break;
                    case HOUR:   keyword = "hh"; break;
                    case MINUTE: keyword = "mi"; break;
                    case SECOND: keyword = "ss"; break;
                    default: throwUnsupported();
                }

                return field("{dateadd}({0}, {1}, {2})", getDataType(), keyword(keyword), interval, date);
            }

            case HANA: {
                String multiplier = null;

                switch (datePart) {
                    case YEAR:   keyword = "add_years";                        break;
                    case MONTH:  keyword = "add_months";                       break;
                    case DAY:    keyword = "add_days";                         break;
                    case HOUR:   keyword = "add_seconds"; multiplier = "3600"; break;
                    case MINUTE: keyword = "add_seconds"; multiplier = "60";   break;
                    case SECOND: keyword = "add_seconds";                      break;
                    default: throwUnsupported();
                }

                if (multiplier == null)
                    return field("{0}({1}, {2})", getDataType(), keyword(keyword), date, interval);
                else
                    return field("{0}({1}, {2} * {3})", getDataType(), keyword(keyword), date, interval, sql(multiplier));
            }

            case INFORMIX: {
                switch (datePart) {
                    case YEAR:   keyword = "year";   break;
                    case MONTH:  keyword = "month";  break;
                    case DAY:    keyword = "day";    break;
                    case HOUR:   keyword = "hour";   break;
                    case MINUTE: keyword = "minute"; break;
                    case SECOND: keyword = "second"; break;
                    default: throwUnsupported();
                }

                return date.add(field("{0} {units} {1}", interval, keyword(keyword)));
            }

            case DB2: {
                switch (datePart) {
                    case YEAR:   keyword = "year";   break;
                    case MONTH:  keyword = "month";  break;
                    case DAY:    keyword = "day";    break;
                    case HOUR:   keyword = "hour";   break;
                    case MINUTE: keyword = "minute"; break;
                    case SECOND: keyword = "second"; break;
                    default: throwUnsupported();
                }

                return date.add(field("{0} {1}", interval, keyword(keyword)));
            }

            case ORACLE: {
                switch (datePart) {

                    // [#4160] We cannot use NUMTOYMINTERVAL addition as Oracle
                    // will raise ORA-01839 in case this produces invalid dates
                    case YEAR:   return field("{add_months}({0}, {1})", date, interval.mul(inline(12)));
                    case MONTH:  return field("{add_months}({0}, {1})", date, interval);
                    case DAY:    return date.add(field("{numtodsinterval}({0}, {1})", interval, inline("day")));
                    case HOUR:   return date.add(field("{numtodsinterval}({0}, {1})", interval, inline("hour")));
                    case MINUTE: return date.add(field("{numtodsinterval}({0}, {1})", interval, inline("minute")));
                    case SECOND: return date.add(field("{numtodsinterval}({0}, {1})", interval, inline("second")));
                    default: throwUnsupported();
                }
            }

            case INGRES: {
                throw new SQLDialectNotSupportedException("The Ingres integration is not yet implemented");
            }
            /* [/pro] */
        }

        return null;
    }

    private final void throwUnsupported() {
        throw new UnsupportedOperationException("Unknown date part : " + datePart);
    }
}
