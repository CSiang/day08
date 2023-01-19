package codes;

public class main {
   public static void main(String [] args) {
    
    CollectionSort.example01();
    System.out.println();
    CollectionSort.example2();

    System.out.println("Array sorting below.");
    ArraySort.example();

   //  System.out.println("ConcurrentHashMap below.");
   //  ConcurrentHashMapExam.example();

    System.out.println("\nLinkedList below.");
    LinkedListExam ll = new LinkedListExam();
    ll.example();

    System.out.println("\nStack operation below.");
    stackExam.example();


   } 
}
