package Tries;

import java.util.Arrays;

/*
Given an input string and a dictionary of words, find out if the input string can be broken into a space-seprated sequence of dictionary words.

words[] = {i, like, samsung, mobile, ice}

key = "ilikesamsung"

output: true

*/
public class WordBreakProblem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        
        Node() {
            Arrays.fill(children, null);   //you can use loop as well and skip this line as by default array will be initialized, by default value which is null in this case
        }
    }

    public static Node root = new Node();

// Insertion code
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

// Search code

    public static boolean search(String key) { //O(L)
        Node curr = root;
        for(int level=0; level<key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null ) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;  //also okay to write-> return curr.eow;
    }

// Word break code
    public static boolean wordBreak(String key) {
        if(key.length() == 0) {
            return true;
        }

        for(int i=1; i<=key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String words[] = {"i","like","samsung","mobile","ice"};
        for(String key : words) {  //Enhanced for loop
            insert(key);
        }

        String key = "ilikesamsung";
        System.out.println(wordBreak(key));
    }
}
