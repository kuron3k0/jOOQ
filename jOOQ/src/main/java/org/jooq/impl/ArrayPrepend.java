/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
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
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
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
import org.jooq.conf.ParamType;
import org.jooq.tools.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



/**
 * The <code>ARRAY PREPEND</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class ArrayPrepend<T>
extends
    AbstractField<T[]>
implements
    QOM.ArrayPrepend<T>
{

    final Field<T>   prepend;
    final Field<T[]> array;

    ArrayPrepend(
        Field<T> prepend,
        Field<T[]> array
    ) {
        super(
            N_ARRAY_PREPEND,
            allNotNull((DataType) dataType(((DataType) OTHER).array(), array, false), prepend, array)
        );

        this.prepend = nullSafeNotNull(prepend, (DataType) OTHER);
        this.array = nullSafeNotNull(array, ((DataType) OTHER).array());
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    final boolean parenthesised(Context<?> ctx) {
        switch (ctx.family()) {

            case H2:
            case HSQLDB:
            case TRINO:
                return false;






            case CLICKHOUSE:
                return false;

            default:
                return true;
        }
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {







            case H2:
            case HSQLDB:
            case TRINO:
                ctx.visit(arrayConcat(array(prepend), array));
                break;







            case CLICKHOUSE:
                ctx.visit(function(N_arrayPushFront, getDataType(), array, prepend));
                break;

            default:
                ctx.visit(function(N_ARRAY_PREPEND, getDataType(), prepend, array));
                break;
        }
    }














    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<T> $arg1() {
        return prepend;
    }

    @Override
    public final Field<T[]> $arg2() {
        return array;
    }

    @Override
    public final QOM.ArrayPrepend<T> $arg1(Field<T> newValue) {
        return $constructor().apply(newValue, $arg2());
    }

    @Override
    public final QOM.ArrayPrepend<T> $arg2(Field<T[]> newValue) {
        return $constructor().apply($arg1(), newValue);
    }

    @Override
    public final Function2<? super Field<T>, ? super Field<T[]>, ? extends QOM.ArrayPrepend<T>> $constructor() {
        return (a1, a2) -> new ArrayPrepend<>(a1, a2);
    }

    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.ArrayPrepend<?> o) {
            return
                StringUtils.equals($prepend(), o.$prepend()) &&
                StringUtils.equals($array(), o.$array())
            ;
        }
        else
            return super.equals(that);
    }
}
