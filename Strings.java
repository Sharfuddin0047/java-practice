import java.util.*;

public class Strings {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str1 ="abcd";
        String str2 = new String("xyz");

        Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name);

        // String firstName = "xyz";
        // String lastName = "012";
        // System.out.println(firstName+" "+ lastName);
        // System.out.println(firstName.charAt(0));


        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
    
}
