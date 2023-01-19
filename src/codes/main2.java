package codes;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class main2 {

    public static void main(String[] args) throws IOException {

        String dirPath = "data2";
        String fileName = "data.txt";

        File newDir = new File(dirPath);
        boolean isDirCreated = newDir.mkdir();

        if(isDirCreated) {
            System.out.println("New directory "+dirPath + " created");
        } else {
            System.out.println("Directory "+dirPath+" already exist.");
        }

        File[] fileList = newDir.listFiles();

        for(File f: fileList) {
            System.out.println(f.getName());
            System.out.println("File "+ f.getPath()+ ":" + f.getCanonicalFile());
        }

        // If to write with outputstream you will have to convert the items to byte
        // outputstream method can only write bytes.
        // String str = "Just testing.";
        FileOutputStream os = new FileOutputStream("./data2/Test.txt");
        // byte[] b = str.getBytes();
        // os.write(b);

        for(int i=0; i<10;i++) {
            // char [] str = Integer.toString(i).toCharArray();

            // String num = Integer.toString(i);
            // System.out.println(num);
            // byte[] c = num.getBytes();

            byte[] c = Integer.toString(i).getBytes();

            os.write(c);
        }

        csvWriter cw = new csvWriter(); // Note that we nvr write a constructor in csvWriter.java, but IDE have a default constructor.
        List<Employee> employees = cw.generateEmployees();
        cw.writeToCSV(employees, "./data2/Test.txt");

    }
    
}
