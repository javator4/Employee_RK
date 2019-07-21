package pl.sda.employee.controller;

import pl.sda.employee.model.Employee;
import pl.sda.employee.service.EmployeeService;
import pl.sda.employee.view.EmployeeView;

import java.util.Scanner;

public class EmployeeController {

    private EmployeeView employeeView;
    private EmployeeService employeeService;

    public EmployeeController(EmployeeView employeeView, EmployeeService employeeService) {
        this.employeeView = employeeView;
        this.employeeService = employeeService;
    }

    public void prepareEmployee() {

        Scanner scan = new Scanner(System.in);
        Employee newEmployy = new Employee();

        System.out.println("Podaj imię");
        newEmployy.setName(scan.nextLine());

        System.out.println("Podaj nazwisko");
        newEmployy.setLastname(scan.nextLine());

        System.out.println("Podaj płaeć - 'M' lub 'K'");
        newEmployy.setSex(scan.nextLine().charAt(0));

        System.out.println("Podaj numer działu");
        newEmployy.setDepartmnetNumber(scan.nextInt());

        employeeService.addEmployee(newEmployy);

        //pobieranie danych
        // towrzenie obiektu employee
        //przeslanie obiektu metody w serwisie - addEmployee

    }

    public void showEmployee() {
        employeeView.showAllEmployee();
    }


}
