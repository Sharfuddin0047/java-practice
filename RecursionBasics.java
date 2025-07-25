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


    public static boolean isSortedArray(int num[],int i){
      if(num[i] == num.length-1){
        return true;
      }
      else if(num[i] > num[i+1]){
        return false;

      }
      return isSortedArray(num,i+1);
      
    }

    public static int firstOccurence(int arr[],int i,int target){
      if(i==arr.length){
        return -1;
      }
      else if(arr[i] == target){
        return i;
      }
      return firstOccurence(arr, i+1, target);
    }

    public static int lastOccurence(int arr[], int j,int target){
      if(j<0){
        return -1;
      }
      else if(arr[j] == target){
        return j;
      }
      return lastOccurence(arr, j-1, target);
    }


    public static int pow(int x,int n){
      if(n==1){
        return 1;
      }
      int xn = x*pow(x, n-1);
      return xn;
    }

    public static int optimizedPower(int x,int n){
      if(n == 0){
        return 1;
      }
      int pow = optimizedPower(x, n/2);
      int powsq = pow * pow;
      if(n % 2 != 0){
        powsq = x*powsq;
      }
      return powsq;
    }


    //tiling problem
    public static int tilingProblem(int n){ //2*n (floor size)
      //base case
      if( n==0 || n==1){
        return 1;
      }
      
      //kaam
      //vertical choice
      int fnm1 = tilingProblem(n-1);
      //horizontal choice
      int fnm2 = tilingProblem(n-2);

      int totways = fnm1 + fnm2;
      return totways;
    }

    //remove duplicate
    public static void remDup(String str,int idx,StringBuilder newStr,boolean map[]){
      if(idx == str.length()){
        System.out.println(newStr);
        return;
      }
      
      char currChar = str.charAt(idx);
      if(map[currChar - 'a']==true){
        remDup(str, idx+1, newStr, map);
      }else{
        map[currChar - 'a']=true;
        remDup(str, idx+1, newStr.append(currChar), map);
      }
    }

    public static int friendsPairing(int n){
      if(n == 1 || n == 2){
        return n;
      }
      //choice
      //single
      // int fnm1 = friendsPairing(n-1);

      // //pair
      // int fnm2 = friendsPairing(n-2);
      // int pairWays = (n-1)*fnm2;

      // //totways
      // int totways = fnm1 + pairWays;
      // return totways;


      //another way 
      return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }

     public static void printBinStrings(int n,int lastPlace, String str){
      //kaam

      if(n==0){
        System.out.println(str);
        return;
      }
      if(lastPlace == 0){
        //sit 0 on chair n
        printBinStrings(n-1, 0, str+"0");
        printBinStrings(n-1, 1, str+"1");
      }else{
        printBinStrings(n-1, 0, str+"0");
      }
     }

    public static void main(String[] args) {
        // int n = 10;
        // printDec(n);
        // printInc(n);


       // System.out.println(fact(5));

      // System.out.println(calcSum(5));


     //nth fibo
    //  System.out.println(nthfibo(25));


    // int num[] = {1,2,3,7,5};
    // System.out.println(isSortedArray(num, 0));

    // firstOccurence
    int arr[] = {1,45,34,67,54,34,45};
    int target = 467;
    int i = 0;
    int j = arr.length -1;
    //System.out.println(firstOccurence(arr, i, target));
    //System.out.println(lastOccurence(arr, j, target));

    int x = 2;
    int n = 10;
    //System.out.println(pow(x, n));
    //System.out.println(optimizedPower(x, n));
    //System.out.println(tilingProblem(n));



    // String str = "appnnacollege";
    // remDup(str, 0, new StringBuilder(""), new boolean[26]);
    //System.out.println(friendsPairing(n));
    printBinStrings(3, 0, "");
    }
    
}
