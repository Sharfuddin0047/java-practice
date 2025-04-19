public class Diagonal {
    public static void diagonalPattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    System.out.print("*");
                }
                else if((i+j) == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static int DiagonalSum(int matrix[][]){
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if((i+j) == matrix[0].length-1){
                    sum += matrix[i][j];
                }
                
            }
        }
        return sum;
    }

    public static void SpiralMatrix(int matrix[][]){
            int startRow = 0;
            int endRow = matrix.length-1;
            int startCol = 0;
            int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            // top
            for(int i=startCol; i<endCol; i++){
                System.out.print(matrix[startRow][i]+" ");
            }

            // end
            for(int j=startRow; j<endCol; j++){
                System.out.print(matrix[j][endCol]+" ");
            }

            // bottom
            for(int i=endCol; i>startCol; i--){
                System.out.print(matrix[endRow][i]+" ");
            }

            // left
            for(int j=endRow; j>startCol; j--){
                System.out.print(matrix[j][startCol]+" ");
            }

            // middle value in odd case
            if(startRow == endRow && startCol == endCol){
                System.out.print(matrix[startRow][startCol]+" ");
            }

            startRow +=1;
            startCol+=1;
            endRow-=1;
            endCol-=1;
        }
        System.out.println();
        System.out.println("Spiral print successful");
    }
    public static void main(String[] args) {
        // int n=5;
        // diagonalPattern(n);

        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // System.out.println("Diagonal sum is : "+DiagonalSum(matrix));
        SpiralMatrix(matrix);
    }
    
}
