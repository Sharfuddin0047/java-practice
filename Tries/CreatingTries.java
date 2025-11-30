package Tries;

import java.util.Arrays;

public class CreatingTries {
    static class Node {
        Node Children[] = new Node[26];
        boolean eow = false;
        
        Node() {
            Arrays.fill(Children, null);   //you can use loop as well and skip this line as by default array will be initialized, by default value which is null in this case
        }
    }

    public static Node root = new Node();

    
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
    }
}
