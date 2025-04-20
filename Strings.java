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

    public static float GetShortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            
            // south
            if(dir == 'S'){
                y--;
            }
            // north
            else if(dir == 'N'){
                y++;
            }
            // west
            else if(dir == 'W'){
                x--;
            }
            // east 
            else{
                x++;
            }
        }
        float sPath = (float)Math.sqrt((y*y)+(x*x));
        return sPath;
    }

    public static String subString(String str ,int si, int ei){
        String subStr = "";
        for(int i=si; i<ei; i++){
            System.out.print(str.charAt(i));
        }
        return subStr;
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


        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        // String path = "WNEENESENNN";
        // System.out.println("Distance is "+GetShortestPath(path)+" unit");

        // String str = "Hello World!";
        // int si =0,ei = 5;
        // System.out.println(subString(str, si, ei));


        String fruits[] ={"apple","banana","mango"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);

    }
    
}
