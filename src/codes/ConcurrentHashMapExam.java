package codes;

import java.io.Console;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExam {

    public static void example() {
        
        Map<String, Integer> laptops = new ConcurrentHashMap<> ();

        laptops.put("Acer",5);
        laptops.put("Apple",15);
        laptops.put("MSI",15);
        laptops.put("Asus",10);

        System.out.println("Total laptops: " + laptops.size());

        for(String key:laptops.keySet()) {

            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "";
        Console cons = System.console();

        while(!searchString.equals("quit")) {

            searchString = cons.readLine("What is the item you wish to search?");

            if(laptops.containsKey(searchString)) {
                System.out.println(searchString + "-" + laptops.get(searchString));
            } else {
                System.out.println("Item not found.");
            }
    }
    
}
}