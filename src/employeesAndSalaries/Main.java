package employeesAndSalaries;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Welcome to the employees' database.");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add employee");
            System.out.println("2. Show employees");
            System.out.println("3. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("\nSelect the type of employee to add:");
                    System.out.println("1. Salaried Employee");
                    System.out.println("2. Hourly Employee");
                    int employeeType = scanner.nextInt();
                    scanner.nextLine();

                    switch (employeeType) {
                        case 1:
                            System.out.println("Enter the salaried employee's id: ");
                            int idSalariedEmployee = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            System.out.print("Enter the name of the salaried employee: ");
                            String salariedEmployeeName = scanner.nextLine();
                            System.out.print("Enter the base salary of the salaried employee: ");
                            double baseSalarySalariedEmployee = scanner.nextDouble();
                            SalariedEmployee salariedEmployee = new SalariedEmployee(idSalariedEmployee, salariedEmployeeName, baseSalarySalariedEmployee);
                            employees.add(salariedEmployee);
                            break;
                        case 2:
                            System.out.print("Enter the hourly employee's id: ");
                            int idHourlyEmployee = scanner.nextInt();
                            scanner.nextLine(); // Consume the newline character
                            System.out.print("Enter the name of the hourly employee: ");
                            String hourlyEmployeeName = scanner.nextLine();
                            System.out.print("Enter the number of hours worked: ");
                            int totalHoursWorked = scanner.nextInt();
                            System.out.print("Enter the hourly rate: ");
                            double hourlyRateEmployee = scanner.nextDouble();
                            scanner.nextLine(); // Consume the newline character
                            HourlyEmployee hourlyEmployee = new HourlyEmployee(idHourlyEmployee, hourlyEmployeeName, totalHoursWorked, hourlyRateEmployee);
                            employees.add(hourlyEmployee);
                            break;
                        default:
                            System.out.println("Invalid employee type!");
                            break;
                    }
                    break;

                case 2:
                    if (employees.isEmpty()) {
                        System.out.println("No employees added yet!");
                    } else {
                        System.out.println("\nEmployee Details:");
                        for (Employee employee : employees) {
                            System.out.println("ID: " + employee.getId() + " - Name: " + employee.getName());
                            System.out.println("Salary: $" + employee.calculateSalary());
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }
    }
}
