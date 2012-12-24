/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq;

import static org.jooq.SQLDialect.CUBRID;
import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.HSQLDB;
import static org.jooq.SQLDialect.MYSQL;
import static org.jooq.SQLDialect.ORACLE;
import static org.jooq.SQLDialect.POSTGRES;

import java.util.Collection;

import javax.annotation.Generated;

/**
 * A model type for a row value expression with degree <code>11</code>
 * <p>
 * Note: Not all databases support row value expressions, but many row value
 * expression operations can be simulated on all databases. See relevant row
 * value expression method Javadocs for details.
 *
 * @author Lukas Eder
 */
@Generated("This class was generated using jOOQ-tools")
public interface Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> extends Row {

    // ------------------------------------------------------------------------
    // Field accessors
    // ------------------------------------------------------------------------

    /**
     * Get the first field
     */
    Field<T1> field1();

    /**
     * Get the second field
     */
    Field<T2> field2();

    /**
     * Get the third field
     */
    Field<T3> field3();

    /**
     * Get the fourth field
     */
    Field<T4> field4();

    /**
     * Get the fifth field
     */
    Field<T5> field5();

    /**
     * Get the sixth field
     */
    Field<T6> field6();

    /**
     * Get the seventh field
     */
    Field<T7> field7();

    /**
     * Get the eighth field
     */
    Field<T8> field8();

    /**
     * Get the ninth field
     */
    Field<T9> field9();

    /**
     * Get the tenth field
     */
    Field<T10> field10();

    /**
     * Get the eleventh field
     */
    Field<T11> field11();

    // ------------------------------------------------------------------------
    // Equal / Not equal comparison predicates
    // ------------------------------------------------------------------------

    /**
     * Compare this row value expression with another row value expression for
     * equality
     * <p>
     * Row equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition equal(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition equal(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition equal(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition equal(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for equality
     *
     * @see #equal(Row11)
     */
    @Support({ CUBRID, HSQLDB, MYSQL, ORACLE, POSTGRES })
    Condition equal(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition eq(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition eq(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition eq(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * equality
     *
     * @see #equal(Row11)
     */
    @Support
    Condition eq(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for equality
     *
     * @see #equal(Row11)
     */
    @Support({ CUBRID, HSQLDB, MYSQL, ORACLE, POSTGRES })
    Condition eq(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality
     * <p>
     * Row non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition notEqual(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition notEqual(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition notEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition notEqual(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support({ CUBRID, HSQLDB, MYSQL, ORACLE, POSTGRES })
    Condition notEqual(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition ne(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition ne(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition ne(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     *
     * @see #notEqual(Row11)
     */
    @Support
    Condition ne(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for non-equality
     *
     * @see #notEqual(Row11)
     */
    @Support({ CUBRID, HSQLDB, MYSQL, ORACLE, POSTGRES })
    Condition ne(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    // ------------------------------------------------------------------------
    // Ordering comparison predicates
    // ------------------------------------------------------------------------

    /**
     * Compare this row value expression with another row value expression for
     * order
     * <p>
     * Row order comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B, C) < (1, 2, 3)</code> is equivalent to
     * <code>A < 1 OR (A = 1 AND B < 2) OR (A = 1 AND B = 2 AND C < 3)</code>
     */
    @Support
    Condition lessThan(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lessThan(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lessThan(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lessThan(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #lessThan(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition lessThan(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lt(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lt(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessThan(Row11)
     */
    @Support
    Condition lt(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #lessThan(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition lt(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     * <p>
     * Row order comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <= (1, 2)</code> is equivalent to
     * <code>A < 1 OR (A = 1 AND B < 2) OR (A = 1 AND B = 2)</code>
     */
    @Support
    Condition lessOrEqual(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition lessOrEqual(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition lessOrEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition lessOrEqual(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition lessOrEqual(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition le(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition le(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition le(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support
    Condition le(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #lessOrEqual(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition le(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     * <p>
     * Row order comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B, C) > (1, 2, 3)</code> is equivalent to
     * <code>A > 1 OR (A = 1 AND B > 2) OR (A = 1 AND B = 2 AND C > 3)</code>
     */
    @Support
    Condition greaterThan(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition greaterThan(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition greaterThan(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition greaterThan(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #greaterThan(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition greaterThan(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition gt(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition gt(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition gt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterThan(Row11)
     */
    @Support
    Condition gt(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #greaterThan(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition gt(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     * <p>
     * Row order comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) >= (1, 2)</code> is equivalent to
     * <code>A > 1 OR (A = 1 AND B > 2) OR (A = 1 AND B = 2)</code>
     */
    @Support
    Condition greaterOrEqual(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition greaterOrEqual(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition greaterOrEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition greaterOrEqual(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition greaterOrEqual(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition ge(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> row);

    /**
     * Compare this row value expression with a record for order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition ge(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> record);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition ge(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11);

    /**
     * Compare this row value expression with another row value expression for
     * order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support
    Condition ge(Field<T1> t1, Field<T2> t2, Field<T3> t3, Field<T4> t4, Field<T5> t5, Field<T6> t6, Field<T7> t7, Field<T8> t8, Field<T9> t9, Field<T10> t10, Field<T11> t11);

    /**
     * Compare this row value expression with a subselect for order
     *
     * @see #greaterOrEqual(Row11)
     */
    @Support({ HSQLDB, MYSQL, POSTGRES })
    Condition ge(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    // ------------------------------------------------------------------------
    // [NOT] DISTINCT predicates
    // ------------------------------------------------------------------------


    // ------------------------------------------------------------------------
    // [NOT] IN predicates
    // ------------------------------------------------------------------------

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality
     * <p>
     * Row IN predicates can be simulated in those databases that do not support
     * such predicates natively: <code>(A, B) IN ((1, 2), (3, 4))</code> is
     * equivalent to <code>((A, B) = (1, 2)) OR ((A, B) = (3, 4))</code>, which
     * is equivalent to <code>(A = 1 AND B = 2) OR (A = 3 AND B = 4)</code>
     */
    @Support
    Condition in(Collection<? extends Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> rows);

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality
     *
     * @see #in(Collection)
     */
    @Support
    Condition in(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>... rows);

    /**
     * Compare this row value expression with a set of records for equality
     *
     * @see #in(Collection)
     */
    @Support
    Condition in(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>... record);

    /**
     * Compare this row value expression with a subselect for equality
     *
     * @see #in(Collection)
     */
    @Support({ CUBRID, DB2, HSQLDB, MYSQL, ORACLE, POSTGRES })
    Condition in(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality
     * <p>
     * Row NOT IN predicates can be simulated in those databases that do not
     * support such predicates natively:
     * <code>(A, B) NOT IN ((1, 2), (3, 4))</code> is equivalent to
     * <code>NOT(((A, B) = (1, 2)) OR ((A, B) = (3, 4)))</code>, which is
     * equivalent to <code>NOT((A = 1 AND B = 2) OR (A = 3 AND B = 4))</code>
     */
    @Support
    Condition notIn(Collection<? extends Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> rows);

    /**
     * Compare this row value expression with a set of row value expressions for
     * equality
     *
     * @see #notIn(Collection)
     */
    @Support
    Condition notIn(Row11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>... rows);

    /**
     * Compare this row value expression with a set of records for non-equality
     *
     * @see #notIn(Collection)
     */
    @Support
    Condition notIn(Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>... record);

    /**
     * Compare this row value expression with a subselect for non-equality
     *
     * @see #notIn(Collection)
     */
    @Support({ CUBRID, DB2, HSQLDB, MYSQL, ORACLE, POSTGRES })
    Condition notIn(Select<? extends Record11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> select);

}
