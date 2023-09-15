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
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
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
package org.jooq;

import static org.jooq.SQLDialect.*;
import static org.jooq.impl.DSL.*;

import java.util.*;

import org.jooq.impl.DSL;

import org.jetbrains.annotations.*;

/**
 * A step in the construction of the <code>CREATE INDEX</code> statement.
 * <p>
 * <h3>Referencing <code>XYZ*Step</code> types directly from client code</h3>
 * <p>
 * It is usually not recommended to reference any <code>XYZ*Step</code> types
 * directly from client code, or assign them to local variables. When writing
 * dynamic SQL, creating a statement's components dynamically, and passing them
 * to the DSL API statically is usually a better choice. See the manual's
 * section about dynamic SQL for details: <a href=
 * "https://www.jooq.org/doc/latest/manual/sql-building/dynamic-sql">https://www.jooq.org/doc/latest/manual/sql-building/dynamic-sql</a>.
 * <p>
 * Drawbacks of referencing the <code>XYZ*Step</code> types directly:
 * <ul>
 * <li>They're operating on mutable implementations (as of jOOQ 3.x)</li>
 * <li>They're less composable and not easy to get right when dynamic SQL gets
 * complex</li>
 * <li>They're less readable</li>
 * <li>They might have binary incompatible changes between minor releases</li>
 * </ul>
 */
@SuppressWarnings({ "unused" })
public interface CreateIndexWhereStep extends CreateIndexFinalStep {

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(Field<Boolean> where);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(Condition... where);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(Collection<? extends Condition> where);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(Condition where);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see SQL
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @PlainSQL
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(@Stringly.SQL String where, QueryPart... parts);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see SQL
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @PlainSQL
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(@Stringly.SQL String where, Object... bindings);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see SQL
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @PlainSQL
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(@Stringly.SQL String where);

    /**
     * Add the <code>WHERE</code> clause to the <code>CREATE INDEX</code> statement.
     * <p>
     * <b>NOTE</b>: When inserting plain SQL into jOOQ objects, you must
     * guarantee syntax integrity. You may also create the possibility of
     * malicious SQL injection. Be sure to properly use bind variables and/or
     * escape literals when concatenated into SQL clauses!
     *
     * @see SQL
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @PlainSQL
    @NotNull @CheckReturnValue
    CreateIndexFinalStep where(SQL where);

    /**
     * Add the <code>EXCLUDE NULL KEYS</code> clause to the <code>CREATE INDEX</code> statement.
     */
    @Support({ POSTGRES, SQLITE, YUGABYTEDB })
    @NotNull @CheckReturnValue
    CreateIndexFinalStep excludeNullKeys();
}
