public class OOPS1 {
    public static void main(String[] args) {

        // method overloading
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(2,4));
        // System.out.println(cal.sum(2.4f,3.4f));
        // System.out.println(cal.sum(1,2,3));


        // Method Overriding
        // Deer d1 =new Deer();
        // d1.eats();

        // abstract 
        // Horse h = new Horse();
        // h.eat();
        // h.walks();

        // Chicken c = new Chicken();
        // h.eat();
        // h.walks();

        Mustang myHorse = new Mustang();
        
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
// class Animal{
//     void eats(){
//         System.out.println("Eats anything");
//     }
// }

// class Deer extends Animal{
//     void eats(){
//         System.out.println("Eats grass");
//     }
// }





/*Abstract class
 * Cannot create an instance of abstract class
 * can have abstract/non-abstract methods
 * can have constructors
  */

  abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor called....");
    }

    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walks();

  }

  class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called... ");
    }
    void changeColor(String color){
        color = "dark brown";
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called....");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = " yellow";
    }
    void walks(){
        System.out.println("Walks on 2 legs");
    }
}