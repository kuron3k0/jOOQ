/*
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
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.impl.Tools.ExtendedDataKey.*;
import static org.jooq.impl.Tools.SimpleDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.Function1;
import org.jooq.Record;
import org.jooq.conf.*;
import org.jooq.tools.*;

import java.util.*;
import java.util.function.*;


/**
 * The <code>CEIL</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class Ceil<T extends Number>
extends
    AbstractField<T>
implements
    QOM.Ceil<T>
{

    final Field<T> value;

    Ceil(
        Field<T> value
    ) {
        super(
            N_CEIL,
            allNotNull((DataType) dataType(INTEGER, value, false), value)
        );

        this.value = nullSafeNotNull(value, INTEGER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    final boolean parenthesised(Context<?> ctx) {
        switch (ctx.family()) {





            case SQLITE:
                return false;




            case H2:
                return true;

            default:
                return true;
        }
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {












            case SQLITE: {






                ctx.visit(function(N_CEIL, getDataType(), value));
                break;
            }




            case H2:
                ctx.visit(function(N_CEILING, getDataType(), value));
                break;

            default:
                ctx.visit(function(N_CEIL, getDataType(), value));
                break;
        }
    }












    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<T> $value() {
        return value;
    }

    @Override
    public final QOM.Ceil<T> $value(Field<T> newValue) {
        return $constructor().apply(newValue);
    }

    public final Function1<? super Field<T>, ? extends QOM.Ceil<T>> $constructor() {
        return (a1) -> new Ceil<>(a1);
    }






















    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Ceil<?> o) {
            return
                StringUtils.equals($value(), o.$value())
            ;
        }
        else
            return super.equals(that);
    }
}
