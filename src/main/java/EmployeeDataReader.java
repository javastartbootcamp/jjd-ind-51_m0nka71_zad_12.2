import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EmployeeDataReader {

    static Employee[] read(String fileName) throws FileNotFoundException {
        final int linesNumber = countLines(fileName);
        Employee[] employees = new Employee[linesNumber];
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < linesNumber; i++) {
                String fileLine = scanner.nextLine();
                employees[i] = createClientFromCsv(fileLine);
            }
        }
        return employees;
    }

    private static Employee createClientFromCsv(String fileLine) {
        String[] data = fileLine.split(";");
        String firstName = data[0];
        String lastName = data[1];
        String pesel = data[2];
        String department = data[3];
        double salary = Double.parseDouble(data[4]);
        return new Employee(firstName, lastName, pesel, department, salary);
    }

    private static int countLines(String fileName) throws FileNotFoundException {
        int lines = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lines++;
            }
        }
        return lines;
    }
}
