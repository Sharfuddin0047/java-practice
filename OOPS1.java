public class OOPS1 {
    public static void main(String[] args) {

        // method overloading
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(2,4));
        // System.out.println(cal.sum(2.4f,3.4f));
        // System.out.println(cal.sum(1,2,3));


        // Method Overriding
        Deer d1 =new Deer();
        d1.eats();
        
    }
    
}


// method overloading
// class Calculator{
//     int sum(int a,int b){
//         return a+b;
//     }
//     float sum(float a, float b){
//         return a+b;

//     }
//     int sum(int a, int b ,int c){
//         return a+b+c;
//     }
// }


/*Method overriding : Parent and child classes both contain the same function with a different definition */
class Animal{
    void eats(){
        System.out.println("Eats anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("Eats grass");
    }
}