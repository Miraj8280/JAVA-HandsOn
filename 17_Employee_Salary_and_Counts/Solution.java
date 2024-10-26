import java.util.Arrays;
import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private char gender;
    private double salary;

    public Employee(int employeeId, String employeeName, int age, char gender, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return employeeId + "#" + employeeName;
    }
}

public class Solution {
    private static Employee getEmployeeWithSecondLowestSalary(Employee[] employees) {
        if (employees.length < 2) {
            return null;
        }

        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        double lowestSalary = employees[0].getSalary();

        // Find the second distinct lowest salary
        for (Employee employee : employees) {
            if (employee.getSalary() > lowestSalary) {
                return employee;
            }
        }

        return null;
    }

    private static int countEmployeesBasedOnAge(Employee[] employees, int age) {
        int count = 0;

        for (Employee employee : employees) {
            if (employee.getAge() == age) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            int employeeId = sc.nextInt();
            sc.nextLine();

            String employeeName = sc.nextLine();

            int age = sc.nextInt();
            sc.nextLine();

            char gender = sc.next().charAt(0);
            sc.nextLine();

            double salary = sc.nextDouble();
            sc.nextLine();

            employees[i] = new Employee(employeeId, employeeName, age, gender, salary);
        }

        int age = sc.nextInt();
        sc.close();

        Employee result = getEmployeeWithSecondLowestSalary(employees);

        System.out.println(result == null ? "Null" : result);
        int count = countEmployeesBasedOnAge(employees, age);
        System.out.println(count == 0 ? "No employee found for the given age" : count);
    }
}
