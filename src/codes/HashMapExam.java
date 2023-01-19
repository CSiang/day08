package codes;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
    
    public void example1() {

        Map<String, Integer> phones = new HashMap<>();

        phones.put("iphone",10);
        phones.put("Samsung",1);
        phones.put("Huawei",8);
        phones.put("XiaoMi",5);

        System.out.println("Total phone types: " + phones.size());

        for(String key: phones.keySet()) {
            System.out.println(key + " - " +phones.get(key));
        }

        String searchString = "";
        Console cons = System.console();

        while(!searchString.equals("quit")) {

            searchString = cons.readLine("What is the item you wish to search?");

            if(phones.containsKey(searchString)) {
                System.out.println(searchString + "-" + phones.get(searchString));
            } else {
                System.out.println("Item not found.");
            }

        }
        
        


        

        



    }

}
