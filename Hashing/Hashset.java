package Hashing;
import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());

        if(set.contains(2)) {
            System.out.println("true");
        }
    }
}
