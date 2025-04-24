public class Array2dpractice {
    // Print the number of 7’s that are inthe 2d array.
    public static int count(int matrix[][], int target){
        int count = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == target){
                    count += 1;
                }
            }
        }
        return count;
    }

    // Print out the sum of the numbers inthe second row of the “nums” array.
    public static int row2sum(int matrix[][]){
        int i = 1;
        int sum = 0;
        for(int j=0; j<matrix[0].length; j++){
            sum += matrix[i][j];
        }
        return sum;
    }

    // Write a program to FindTransposeofa Matrix.

    public static void transpose(int arr[][]){
        int tp[][] = new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                tp[j][i] = arr[i][j];
            }
        }
        for(int i=0; i<tp.length; i++){
            for(int j=0; j<tp[0].length; j++){
                System.out.print(tp[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // sol 1
        // int matrix[][] =  { {4,7,8},{8,8,7} };
        // int target = 7;
        // System.out.println(target +"occur"+count(matrix, target)+"times");



        // sol 2
        // int matrix[][] = { {1,4,9},{11,4,3},{2,2,3} };
        // System.out.println("the sum is : "+row2sum(matrix));


        // sol 3
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };
        transpose(arr);

    }
}
