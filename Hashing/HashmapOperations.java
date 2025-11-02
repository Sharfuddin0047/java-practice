package Hashing;
import java.util.*;


public class HashmapOperations {
    public static void main(String[] args) {

        //create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US",50);

        // System.out.println(hm);

        // //Get - O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        // //ContainsKey - O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("Indonesia"));

        // //Remove - O(1)
        // System.out.println(hm.remove("Indonesia"));
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        //size
        System.out.println(hm.size());

        //Is Empty
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
