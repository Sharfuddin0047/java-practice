public class RecursionBasics {
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printDec(n-1);
    // }

    // public static void printInc(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.print(n+" ");
    // }



    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int fn = n*fact(n-1);
    //     return fn;
    // }

      // public static int calcSum(int n){
      //   if(n==1){
      //       return 1;
      //   }
      //   int sum = n + calcSum(n-1);
      //   return sum;
      // }


    //  find nth fibonacci
    public static int nthfibo(int n){
      if(n<=1){
        return n;
      }
      int fib = nthfibo(n-1) + nthfibo(n-2);
      return fib;
    }


    public static void main(String[] args) {
        // int n = 10;
        // printDec(n);
        // printInc(n);


       // System.out.println(fact(5));

      // System.out.println(calcSum(5));


     //nth fibo
     System.out.println(nthfibo(25));
    }
    
}
