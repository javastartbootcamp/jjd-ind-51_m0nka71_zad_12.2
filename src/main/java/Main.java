import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileName = "employees.csv";
        File file = new File(fileName);
        file.createNewFile();

        Employee[] employees = EmployeeDataReader.read(fileName);
        double averageSalary = EmployeeStatistics.getAverageSalary(employees);
        System.out.println("Średnia wypłata: " + averageSalary);
        double lowestSalary = EmployeeStatistics.getLowestSalary(employees);
        System.out.println("Minimalna wypłata: " + lowestSalary);
        double highestSalary = EmployeeStatistics.getHighestSalary(employees);
        System.out.println("Maksymalna wypłata: " + highestSalary);

        int numberOfEmployeesInItDepartment = EmployeeStatistics.getNumberOfEmployeesInItDepartment(employees);
        System.out.println("Liczba pracowników IT: " + numberOfEmployeesInItDepartment);

        int numberOfEmployeesInSupportDepartment = EmployeeStatistics.getNumberOfEmployeesInSupportDepartment(employees);
        System.out.println("Liczba pracowników Support: " + numberOfEmployeesInSupportDepartment);

        int numberOfEmployeesInManagementDepartment = EmployeeStatistics.getNumberOfEmployeesInManagementDepartment(employees);
        System.out.println("Liczba pracowników Management: " + numberOfEmployeesInManagementDepartment);

        if (file.exists()) {
            File stats = new File("stats.txt");
            stats.createNewFile();

            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write("Średnia wypłata: " + averageSalary + "\n");
            fileWriter.write("Minimalna wypłata: " + lowestSalary + "\n");
            fileWriter.write("Maksymalna wypłata: " + highestSalary + "\n");
            fileWriter.write("Liczba pracowników IT: " + numberOfEmployeesInItDepartment + "\n");
            fileWriter.write("Liczba pracowników Support: " + numberOfEmployeesInSupportDepartment + "\n");
            fileWriter.write("Liczba pracowników Management: " + numberOfEmployeesInManagementDepartment);

            fileWriter.close();
        }

    }
}
