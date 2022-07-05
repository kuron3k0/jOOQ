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
import org.jooq.impl.*;
import org.jooq.impl.QOM.*;
import org.jooq.tools.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


/**
 * The <code>EXCLUDED</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class Excluded<T>
extends
    AbstractField<T>
implements
    QOM.Excluded<T>
{

    final Field<T> field;

    Excluded(
        Field<T> field
    ) {
        super(
            N_EXCLUDED,
            allNotNull((DataType) dataType(field), field)
        );

        this.field = nullSafeNotNull(field, (DataType) OTHER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {








            case MARIADB: {
                ctx.visit(K_VALUES).sql('(').qualify(false, c -> c.visit(field)).sql(')');
                break;
            }

            case MYSQL: {





                ctx.visit(name("t")).sql('.').qualify(false, c -> c.visit(field));
                break;
            }

            default:
                // [#7552] When emulating INSERT .. ON DUPLICATE KEY UPDATE using
                //         MERGE, the EXCLUDED pseudo table is called "t", instead
                ctx.visit(ctx.data(ExtendedDataKey.DATA_INSERT_ON_DUPLICATE_KEY_UPDATE) != null
                        ? name("t")
                        : N_EXCLUDED)
                   .sql('.')
                   .qualify(false, c -> c.visit(field));
                break;
        }
    }












    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<T> $field() {
        return field;
    }

    @Override
    public final QOM.Excluded<T> $field(Field<T> newValue) {
        return $constructor().apply(newValue);
    }

    public final Function1<? super Field<T>, ? extends QOM.Excluded<T>> $constructor() {
        return (a1) -> new Excluded<>(a1);
    }






















    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Excluded<?> o) {
            return
                StringUtils.equals($field(), o.$field())
            ;
        }
        else
            return super.equals(that);
    }
}
