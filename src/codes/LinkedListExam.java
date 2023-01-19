package codes;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
    
    public static void example(){
    
    LinkedList<String> list1 = new LinkedList<>();

    list1.add("A");
    list1.add("B");
    list1.add("C");
    list1.add("D");
    list1.add("E");
    list1.add("F");
    list1.add("G");

    System.out.println(list1);

    System.out.println("\nBelow is to remove C.");
    list1.remove("C");
    System.out.println(list1);



    System.out.println("\nBelow is to remove first and last.");
    list1.removeFirst();
    list1.removeLast();
    System.out.println(list1);




}

}
