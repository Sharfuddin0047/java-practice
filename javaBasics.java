import java.util.Scanner;

public class javaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");

    }

    public static int calculateSum(int num1, int num2) {
       int sum = num1 + num2;
       return sum;
    }
    public static void swap(int a, int b){
       int temp = a;
       a = b;
       b = temp;
       System.out.println("a =" +a);
       System.out.println("b =" +b);
    }
    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static int factorial(int n){
        int f=1;
        for (int i =1;i<=n;i++){
            f=f*i;
            
        }
        return f;
    }
    public static int binCoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoff =fact_n / (fact_r * fact_nmr);
        return binCoff;
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b , int c){
        return a+b+c;
    }
    public static float sum(float a ,float b){
        return a+b;
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
public static void binToDec(int binNum){
    int pow = 0;
    int decNum = 0;
    int myNum = binNum;

    while(binNum > 0){
        int lastDigit = binNum % 10;
        decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

        pow++;
        binNum = binNum/10;

    }
    System.out.println("Decimal of "+ myNum + " = " + decNum);
}
public static void decToBin(int n){
    int myNum = n;
    int pow = 0;
    int binNum = 0;

    while(n>0){
        int rem = n % 2;
        binNum = binNum + (rem * (int)Math.pow(10,pow));
        pow++;
        n = n/2;

    }
    System.out.println("binary form of " + myNum + " = " + binNum);
}
    public static void main(String[] args) {
        decToBin(9);
    }
}