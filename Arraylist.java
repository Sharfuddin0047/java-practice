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
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(1,9);

        // System.out.println(list);
        // Collections.sort(list);  //ascending
        // System.out.println(list);

        //descending
        // Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);

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


        // multi dimensional Arraylist
        // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);list.add(2);list.add(3);
        
        // mainList.add(list);

        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(4);list1.add(5);list1.add(6);
        // mainList.add(list1);

        // for(int i=0; i<mainList.size(); i++){
        //     ArrayList<Integer> currList = mainList.get(i);
        //     for(int j=0; j<currList.size(); j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);


        ArrayList<ArrayList<Integer>> mainList1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list2.add(1*i);
            list3.add(2*i);
            list4.add(3*i);
        }
        mainList1.add(list2);
        mainList1.add(list3);
        mainList1.add(list4);

        System.out.println(mainList1);

        //nested loop
        for(int i=0; i<mainList1.size(); i++){
            ArrayList<Integer> currlist1 = mainList1.get(i);

            for(int j=0; j<currlist1.size(); j++){
                System.out.print(currlist1.get(j)+",");
            }
            System.out.println();
        }
    }
}
