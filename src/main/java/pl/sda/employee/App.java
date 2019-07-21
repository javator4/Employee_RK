package pl.sda.employee;


import pl.sda.employee.controller.EmployeeController;
import pl.sda.employee.database.EmployeeDatabase;
import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println(EmployeeDatabase.employeeList);
        EmployeeDatabase.employeeList.add(new Employee("jjj", "Karczewska", 'K', 4));

        System.out.println(EmployeeDatabase.employeeList);

        EmployeeController controller = new EmployeeController(new EmployeeView(), new EmployeeService());

        Scanner scan = new Scanner(System.in);


        while (true) {

            System.out.println("1 - dodaj pracownika");
            System.out.println("2 - wyświetl listę");
            System.out.println("0 - wyjście z programu");

            int value = scan.nextInt();

            if (value == 0) {
                break;
            }
            switch (value) {

                case 1:
                    controller.prepareEmployee();
                    break;
                case 2:
                    // metoda na wyswietlanie
                    controller.showEmployee();
                    break;

            }

        }
    }
}
