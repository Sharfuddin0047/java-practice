public class BitManipulation {
    public static void oddOrEven(int n){
        int bitMask = 1;
        if( (n & bitMask) == 1){
            System.out.println(n+" is odd");
        }else{
            System.out.println(n+"is even");
        }
    }

    public static int getithBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setithBit(int n,int i){
        int bitMak = 1<<i;
        return (n | bitMak);
    }

    public static int clearithBit(int n,int i){
        int bitMask =~(1<<i);
        return n & bitMask;
    }

    public static int countSetbits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count ++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a,int n){
        int ans = 1;

        while(n>0){
            if((n & 1) != 0){
                ans = ans *a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int n=5;
        // oddOrEven(n);


        // System.out.println(getithBit(14, 3));


        // System.out.println(setithBit(10, 2));


        // System.out.println(clearithBit(10, 3 ));



        // System.out.println(countSetbits(11));


        System.out.println(fastExpo(5,3));
        
    }
    
}
