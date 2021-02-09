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
package org.jooq;

import org.jetbrains.annotations.*;

// ...
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.POSTGRES;

import java.util.Collection;

/**
 * A {@link Query} that can create types.
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
 *
 * @author Lukas Eder
 */
public interface CreateTypeStep {

    /**
     * Add the <code>AS ENUM</code> clause to the <code>CREATE TYPE</code> statement.
     */
    @NotNull
    @Support({ H2, POSTGRES })
    CreateTypeFinalStep asEnum();

    /**
     * Add the <code>AS ENUM</code> clause to the <code>CREATE TYPE</code> statement.
     */
    @NotNull
    @Support({ H2, POSTGRES })
    CreateTypeFinalStep asEnum(String... values);

    /**
     * Add the <code>AS ENUM</code> clause to the <code>CREATE TYPE</code> statement.
     */
    @SuppressWarnings("unchecked")
    @NotNull
    @Support({ H2, POSTGRES })
    CreateTypeFinalStep asEnum(Field<String>... values);

    /**
     * Add the <code>AS ENUM</code> clause to the <code>CREATE TYPE</code> statement.
     */
    @NotNull
    @Support({ H2, POSTGRES })
    CreateTypeFinalStep asEnum(Collection<?> values);
}
