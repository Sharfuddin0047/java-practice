package Tries;

import java.util.Arrays;

/*
Find shortest unique prefix for every word in a given list.
assume no word is prefix of another

arr[] = {"Zebra", "Dog", "duck", "dove"}

ans = {"Z","dog","du","dov"}
*/
public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        int freq;
        boolean eow;

        Node() {
            Arrays.fill(children,null);
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { //only applicable for a-z characters
        Node curr = root;
        for(int i=0; i<word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null ) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node  root, String ans) {
        if(root == null) {
            return;
        }

        if(root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for(int i=0; i<root.children.length; i++) {
            if(root.children[i] != null) {
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"zebra","dog","duck","dove"};
        for(String key: arr) {
            insert(key);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}
