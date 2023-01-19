package codes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    public static void example01() {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i =0; i<10; i++) {
            numbers.add((int)(Math.random()*100));
        }

        System.out.println("Unsorted list: " + numbers);

        // Sort in ascending
        Collections.sort(numbers);
        System.out.println("Ascending sorted list: " + numbers);
        
        // Sort in descending
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending sorted list: " + numbers);

    }

    public static void example2() {
        Employee emp1 = new Employee("12345", "Daryl Ng", "SS", "Lecturer", "darrylng.nus.edu.sg",50000);
        Employee emp2 = new Employee("12339", "Alex Tan", "SS", "Lecturer", "alextan.nus.edu.sg",70000);
        Employee emp3 = new Employee("15796", "Zekrom Lee", "SS", "Lecturer", "zeklee.nus.edu.sg",85000);
        Employee emp4 = new Employee("59761", "Don Ooi", "SS", "Lecturer", "donooi.nus.edu.sg",35000);

        List<Employee> employees = new ArrayList<> ();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("Unsorted employees: "+ employees);



    }


}
