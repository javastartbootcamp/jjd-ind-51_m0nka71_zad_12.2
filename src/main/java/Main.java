import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\monik\\Desktop\\employees.csv";
        File file = new File(fileName);

        Employee[] employees = EmployeeDataReader.read(fileName);
        EmployeeStatistics.getAverageSalary(employees);
        EmployeeStatistics.getLowestSalary(employees);
        EmployeeStatistics.getHighestSalary(employees);
        EmployeeStatistics.getNumberOfEmployeesInDepartment(employees);

        if (file.exists()) {
            File stats = new File("stats.txt");
            stats.createNewFile();

            FileWriter fileWriter = new FileWriter(stats);
            fileWriter.write("Średnia wypłata: 5000");

            fileWriter.close();
        }

    }
}
