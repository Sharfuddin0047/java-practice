public class OOPS1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(2,4));
        System.out.println(cal.sum(2.4f,3.4f));
        System.out.println(cal.sum(1,2,3));
        
    }
    
}

class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;

    }
    int sum(int a, int b ,int c){
        return a+b+c;
    }
}
