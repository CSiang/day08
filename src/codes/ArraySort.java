package codes;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void example() {

        // custom array with data (name)
        String[] name = { "darryl", "elaine", "james", "zonnae", "iguana", "mark", "ditto", "marcus", "sebastian",
                        "alvin" };

        // print out unsorted array
        System.out.println("Unsorted arr: " + Arrays.toString(name));

        // sort the array in ascending orer
        Arrays.sort(name);

        // print out sorted array
        System.out.println("Sorted arr: " + Arrays.toString(name));

        // sort the array in descending orer
        Arrays.sort(name, Collections.reverseOrder());

        // print out sorted array
        System.out.println("Sorted arr: " + Arrays.toString(name));

    }
}
