import java.util.ArrayList;
public class Pairsum {
    //Brute Force
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }


    //Pointer Approach
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    //     int lp = 0;
    //     int rp = list.size()-1;
    //     while (lp<rp) {
    //         if(list.get(lp) + list.get(rp) == target) {
    //             return true;
    //         } else if(list.get(lp) + list.get(rp) < target)  {
    //             lp++;
    //         } else{
    //             rp--;
    //         }       
    //     }
    //     return false;

    // }

    // solving rorated & sorted pairsum
    public static boolean pairSum2(ArrayList<Integer> list1, int target){
        int bp = -1;
        int n = list1.size();
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)>list1.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;  // Smallest
        int rp = bp;

        while (lp != rp) {
            // case 1
            if(list1.get(lp) + list1.get(rp) == target){
                return true;
            }

            //caase 2
            if(list1.get(lp) + list1.get(rp) < target){
                lp=(lp+1)%n;

            }else{
                //case 3
                rp=(n+rp-1)%n;
            }
            
        }
        return false;
    }

     public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     //1,2,3,4,5,6
    //     list.add(1);
    //     list.add(2);
    //     list.add(3);
    //     list.add(4);
    //     list.add(5);
    //     list.add(6);

    //     int target = 5;
    //     System.out.println(pairSum1(list, target));

    // Rorated & Sorted 11, 15, 6, 8, 9,10
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(11);
    list1.add(15);
    list1.add(6);
    list1.add(8);
    list1.add(9);
    list1.add(10);
    int target = 16;
    System.out.println(pairSum2(list1, target));
        
    }
    
}
