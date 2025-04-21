public class Search {
    /*  Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
    You may assume no duplicates in the array.*/
    public static int sortedSearch(int arr[],int target){
        int fi = 0;
        int ei = arr.length-1;
        int mid =0;

        while(fi <= ei ){
            mid =(fi + ei);
            if(arr[mid] == target){
                return mid;

            } else if(target > arr[mid]){
                fi = mid+1;
            }
            else{
                ei = mid -1;
            }
        }
        return fi;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int target = 6;
        System.out.println(sortedSearch(arr, target));
    }


}
