public class Backtracking {
    // public static void changeArr(int arr[], int i, int val){
    //     //Base case
    //     if(i == arr.length){
    //         printArr(arr);
    //         return;

    //     }

    //     //recursion
    //     arr[i] = val;
    //     changeArr(arr, i+1, val+1); //function call step
    //     arr[i] = arr[i] - 2;        //backtracking step


    // }

    // public static void printArr(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }
       

    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }else{
                System.out.println(ans);
            }
            
            return;
        }

        //Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice
        findSubsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        // int arr[] = new int[5];
        // changeArr(arr,0,1);
        // printArr(arr);


        String str = "abc";
        findSubsets(str, "", 0);
    }
}
