public class EmployeeStatistics {

    static double getAverageSalary(Employee[] employees) {
        double sum = 0;
        int employeeCounter = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            employeeCounter++;
        }
        return sum / employeeCounter;
    }

    public static double getLowestSalary(Employee[] employees) {
        double lowestSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < lowestSalary) {
                lowestSalary = employee.getSalary();
            }
        }
        return lowestSalary;
    }

    public static double getHighestSalary(Employee[] employees) {
        double highestSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > highestSalary) {
                highestSalary = employee.getSalary();
            }
        }
        return highestSalary;
    }

    public static int getNumberOfEmployeesInItDepartment(Employee[] employees) {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("IT")) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }

    public static int getNumberOfEmployeesInManagementDepartment(Employee[] employees) {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("Management")) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }

    public static int getNumberOfEmployeesInSupportDepartment(Employee[] employees) {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("Support")) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }
}
