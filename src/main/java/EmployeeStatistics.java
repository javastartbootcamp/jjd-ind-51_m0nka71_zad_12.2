public class EmployeeStatistics {

    static double getAverageSalary(Employee[] employees) {
        double averageSalary = 0;
        int employeeCounter = 0;
        for (Employee employee : employees) {
            averageSalary += employee.getSalary();
            employeeCounter++;
        }
        double avgSalary = averageSalary / employeeCounter;
        System.out.println("Średnia wypłata: " + avgSalary);
        return avgSalary;
    }

    public static double getLowestSalary(Employee[] employees) {
        double lowestSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() < lowestSalary) {
                lowestSalary = employee.getSalary();
            }
        }
        return lowestSalary;
    }

    public static double getHighestSalary(Employee[] employees) {
        double highestSalary = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() < highestSalary) {
                highestSalary = employee.getSalary();
            }
        }
        return highestSalary;
    }

    public static int getNumberOfEmployeesInDepartment(Employee[] employees) {
        int employeeCounter = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment().equals("IT")) {
                employeeCounter++;
            }
            if (employee.getDepartment().equals("Support")) {
                employeeCounter++;
            }
            if (employee.getDepartment().equals("Management")) {
                employeeCounter++;
            }
        }
        return employeeCounter;
    }
}
