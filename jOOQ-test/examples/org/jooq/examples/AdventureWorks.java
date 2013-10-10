/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
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
package org.jooq.examples;

/* [pro] */

import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.Department;
import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.Employee;
import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.EmployeeAddress;
import static org.jooq.examples.sqlserver.adventureworks.humanresources.Tables.EmployeeDepartmentHistory;
import static org.jooq.examples.sqlserver.adventureworks.person.Tables.Contact;
import static org.jooq.impl.DSL.val;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class AdventureWorks {

    public static void main(String[] args) throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;integratedSecurity=true");

        DSLContext create = DSL.using(connection, SQLDialect.SQLSERVER);

        System.out.println(create
              .select(Employee.fields())
              .select(val("###"))
              .select(Department.fields())
              .select(val("###"))
              .select(Contact.fields())
              .from(Employee)
              .join(EmployeeAddress).using(Employee.EmployeeID)
              .join(EmployeeDepartmentHistory).using(Employee.EmployeeID)
              .join(Department).using(Department.DepartmentID)
              .join(Contact).using(Contact.ContactID)
              .fetch());
    }
}

/* [/pro] */