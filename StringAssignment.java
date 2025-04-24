import java.util.*;

public class StringAssignment {

    public static int countLowercase(String txt) {
        int count = 0;
        for (int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i); // Using 'char' instead of 'String'
            if (Character.isLowerCase(ch)) { // Correct method to check lowercase
                count++;
            }
        }
        return count;
    }

    public static boolean anangrams(String str1, String str2){
       if(str1.length() == str2.length()){
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        String sortedch = new String(ch);
        char ch1[] = str2.toCharArray();
        Arrays.sort(ch1);
        String sortedch1 = new String(ch1);
        return sortedch.equals(sortedch1);
       }
       return false;
    
    }

    public static void main(String[] args) {
        // String txt = "BFIUHFAHhifihIHFHhad";
        // System.out.println("Lower case count : " + countLowercase(txt));


        String str1 = "race";
        String str2 = "care";
        System.out.println(anangrams(str1, str2));
    }
}
