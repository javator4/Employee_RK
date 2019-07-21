package pl.sda.employee.view;

import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;


public class EmployeeView {

    public void showAllEmployee() {

        for (int i = 0; i < EmployeeDatabase.employeeList.size(); i++) {

            System.out.printf("%d Imię: %-10s Nazwisko: %-12s Płeć: %-4c Wydział: %d \n",
                    (i + 1),
                    EmployeeDatabase.employeeList.get(i).getName(),
                    EmployeeDatabase.employeeList.get(i).getLastname(),
                    EmployeeDatabase.employeeList.get(i).getSex(),
                    EmployeeDatabase.employeeList.get(i).getDepartmnetNumber()
            );

        }


    }


}
