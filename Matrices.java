import java.util.Scanner;

public class Matrices {

    public static boolean search(int matrix[] [],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length; j++){
                if(matrix[i] [j] == key){
                    System.out.println("Found at cell("+i + ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void printSpiral(int matrix[] []){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            for(int j=startCol; j<=endCol; j++){

                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1; i<=endRow; i++){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[i][endCol]+" ");
            }
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startCol++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0,col = matrix[0].length-1;
        while (row < matrix.length && col >= 0) {
            if(matrix[row][col] == key){
                System.out.println("found key at ("+row + ","+col+")");
                return true;
            } 
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        // int Max = Integer.MIN_VALUE;
        // int Min = Integer.MAX_VALUE;
        // int matrix[] [] = new int[3] [3];
        // int n = matrix.length, m = matrix[0].length;
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         matrix[i][j] = sc.nextInt();
        //         Max = Math.max(Max, matrix[i][j]);
        //         Min = Math.min(Min, matrix[i][j]);
        //     }
        // }

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
               
        //     }
        //     System.out.println();
        // }
        // System.out.println(search(matrix, 3));
        // System.out.println("Max value : "+ Max);
        // System.out.println("Min value : "+ Min);



    //     int matrix[][] = {{1,2,3,4},
    //                       {5,6,7,8},
    //                     {9,10,11,12},
    //                     {13,14,15,16}};


    //    printSpiral(matrix);

    int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    int key = 33;
    staircaseSearch(matrix, key);
    }
    
}
