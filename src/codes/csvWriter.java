package codes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvWriter {
    
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";

    private String staffNo;
    private String fullName;
    private String department;
    private String role;
    private String emailAdd;
    private int salary;

    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAdd,salary";

    public static List<Employee> employees = null;

    public List<Employee> generateEmployees() {
        employees = new ArrayList<Employee>();

        Employee emp1 = new Employee("12345", "Daryl Ng", "SS", "Lecturer", "darrylng.nus.edu.sg",50000);
        Employee emp2 = new Employee("12339", "Alex Tan", "SS", "Lecturer", "alextan.nus.edu.sg",70000);
        Employee emp3 = new Employee("15796", "Zekrom Lee", "SS", "Lecturer", "zeklee.nus.edu.sg",85000);
        Employee emp4 = new Employee("59761", "Don Ooi", "SS", "Lecturer", "donooi.nus.edu.sg",35000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException {
        FileWriter fw = new FileWriter(fileName);

        // Write file header to csv.
        fw.append(FILE_HEADER);
        fw.append(NEWLINE_SEPARATOR);

        // read records row by row and write it using fw.append()
        for(Employee e: employees) {
            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAdd());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(e.getSalary()));
            fw.append(COMMA_DELIMITER);
            fw.append(NEWLINE_SEPARATOR);
            fw.flush(); // Must have flush(), if not it won't write.
        }


    }

}
