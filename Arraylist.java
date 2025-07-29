import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        //swap two numbers
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);

        System.out.println(list);
        Collections.sort(list);  //ascending
        System.out.println(list);

        //descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list,idx1,idx2);
        // System.out.println(list);

        //Get operation
        // int element = list.get(2);
        // System.out.println(element);


        //Delete
        // int del = list.remove(2);
        // System.out.println(del);

        //set
        // list.set(2,10);
        // System.out.println(list);

        //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        //System.out.println(list.size());

        //print the arraylist
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+ " ");

        // }
        // System.out.println();

        // Reverse print
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+ " ");
        // }
        // System.out.println();

        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++){
        //     // if(max<list.get(i)){
        //     //     max = list.get(i);
        //     // }
        //     max = Math.max(max,list.get(i));
        // }
        // System.out.println("max is : "+max);
    }
}
