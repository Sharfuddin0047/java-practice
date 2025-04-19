import java.util.*;

public class ArraysCC{
    public static int linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int strSearch(String str[], String key){
        for(int i=0; i<str.length; i++){
            if(str[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : "+smallest);
        return largest;
    }
    public static int binarySearch(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid +1;
            }else{
                end = mid-1;
            }
            
        }
        return -1;
    }
    public static void printPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+ curr +","+ numbers[j] +")");
            }
            System.out.println();
        }
    }
    public static void subArray(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                int sum = 0;
                System.out.print("(");
                for (int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum = numbers[k] + sum;
                }
                if(sum < smallest){
                    smallest = sum;
                }
                if(sum > largest){
                    largest = sum;
                }
                System.out.print(")" + " sum is : "+ sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("largest : "+largest + "  smallest : "+smallest);
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our max subarraysum is : " + ms);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,3,4,-5,6,7,-8,9,-10};
        kadanes(numbers);
        // int key = 8;
        // printPairs(numbers);
        // System.out.println("value is at index : "+binarySearch(numbers, key));
        // System.out.println("largest value is : "+getLargest(numbers));
        // int key = 0;
        // int index = linearSearch(numbers, key);
        // String str[] = {"a","b","c","d"};
        // String key = "d";
        // int index = strSearch(str, key);
        // if(index == -1){
        //     System.out.println(key +" not found");
        // }
        // else{
        //     System.out.println(key +" found at index value " + index);
        // }
    }
    
}
