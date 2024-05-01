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
 * The <code>DROP SEQUENCE</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unused" })
final class DropSequenceImpl
extends
    AbstractDDLQuery
implements
    QOM.DropSequence,
    DropSequenceFinalStep
{

    final Sequence<?> sequence;
    final boolean     ifExists;

    DropSequenceImpl(
        Configuration configuration,
        Sequence<?> sequence,
        boolean ifExists
    ) {
        super(configuration);

        this.sequence = sequence;
        this.ifExists = ifExists;
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    private static final Clause[]        CLAUSES              = { Clause.DROP_SEQUENCE };
    private static final Set<SQLDialect> NO_SUPPORT_IF_EXISTS = SQLDialect.supportedBy(DERBY, FIREBIRD);

    private final boolean supportsIfExists(Context<?> ctx) {
        return !NO_SUPPORT_IF_EXISTS.contains(ctx.dialect());
    }

    @Override
    public final void accept(Context<?> ctx) {
        if (ifExists && !supportsIfExists(ctx))
            tryCatch(ctx, DDLStatementType.DROP_SEQUENCE, c -> accept0(c));
        else
            accept0(ctx);
    }

    private void accept0(Context<?> ctx) {
        ctx.start(Clause.DROP_SEQUENCE_SEQUENCE)
           .visit(K_DROP)
           .sql(' ')
           .visit(ctx.family() == CUBRID ? K_SERIAL : K_SEQUENCE)
           .sql(' ');

        if (ifExists && supportsIfExists(ctx))
            ctx.visit(K_IF_EXISTS).sql(' ');






        ctx.sql(' ').visit(sequence);

        if (ctx.family() == DERBY)
            ctx.sql(' ').visit(K_RESTRICT);

        ctx.end(Clause.DROP_SEQUENCE_SEQUENCE);
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }



    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Sequence<?> $sequence() {
        return sequence;
    }

    @Override
    public final boolean $ifExists() {
        return ifExists;
    }

    @Override
    public final QOM.DropSequence $sequence(Sequence<?> newValue) {
        return $constructor().apply(newValue, $ifExists());
    }

    @Override
    public final QOM.DropSequence $ifExists(boolean newValue) {
        return $constructor().apply($sequence(), newValue);
    }

    public final Function2<? super Sequence<?>, ? super Boolean, ? extends QOM.DropSequence> $constructor() {
        return (a1, a2) -> new DropSequenceImpl(configuration(), a1, a2);
    }






















}
