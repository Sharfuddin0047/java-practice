package Tries;

import java.util.Arrays;

public class InsertInTrie {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        
        Node() {
            Arrays.fill(children, null);   //you can use loop as well and skip this line as by default array will be initialized, by default value which is null in this case
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(L)
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node(); 
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for(String key : words) {  //Enhanced for loop
            insert(key);
        }
    }
}
