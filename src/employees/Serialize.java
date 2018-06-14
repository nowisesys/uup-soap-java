/*
 * Copyright (C) 2018 Anders Lövgren (Nowise Systems).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 /*
 * Serialize.java
 *
 * Created: 2018-jun-14, 17:56:09
 * Author:  Anders Lövgren (Nowise Systems)
 */
package employees;

import employees.generated.Company;
import employees.generated.Employee;
import employees.generated.Job;

/**
 * @author Anders Lövgren (Nowise Systems)
 */
public class Serialize {

    public static String ToString(Employee obj) {
        if (obj != null) {
            return String.format(
                    "employee={name: %s, boss: %s, %s, %s}",
                    obj.getName(), obj.getBoss(),
                    Serialize.ToString(obj.getCompany()),
                    Serialize.ToString(obj.getJob())
            );
        } else {
            return "employee={}";
        }
    }

    public static String ToString(Company obj) {
        if (obj != null) {
            return String.format("company={name; %s, address: %s}", obj.getName(), obj.getAddress());
        } else {
            return "company={}";
        }
    }

    public static String ToString(Job obj) {
        if (obj != null) {
            return String.format("job={name; %s, salary: %s sek}", obj.getTitle(), obj.getSalary());
        } else {
            return "job={}";
        }
    }
}
