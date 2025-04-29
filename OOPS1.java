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

        // Mustang myHorse = new Mustang();
        
        // interfaces
        // Queen q = new Queen();
        // q.moves();


        // static
        // Student s1 = new Student();
        // s1.schoolName = "abc";

        // Student s2 = new Student();
        // System.out.println(s2.schoolName);

        // super 
        Horse h = new Horse();
        System.out.println(h.color);

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

//   abstract class Animal{
//     String color;
//     Animal(){
//         System.out.println("Animal constructor called....");
//     }

//     void eat(){
//         System.out.println("Animal eats");
//     }
//     abstract void walks();

//   }

//   class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor called... ");
//     }
//     void changeColor(String color){
//         color = "dark brown";
//     }
//     void walks(){
//         System.out.println("walks on 4 legs");
//     }
// }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor called....");
//     }
// }

// class Chicken extends Animal{
//     void changeColor(){
//         color = " yellow";
//     }
//     void walks(){
//         System.out.println("Walks on 2 legs");
//     }
// }



/*Interfaces
 * All methods are public ,abstract & without implementation
 * Used to achieve total abstraction
 * Variables in the interfaces are final ,public and static
 */

//  interface ChessPlayer{
//     void moves();
//  }
//  class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down, left , right, diagonal (in all 4 dir)");
//     }
//  }

//  class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down, left , right");
//     }
//  }

//  class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("up,down, left , right ,diagonal ( by 1 step)");
//     }
//  }

/*Static keyword
 * static keyword in java is used to share the same variable or method of a given class
 * Properties
 * Functions
 * Blocks
 * Nestedclasses
 */
//  class Student{
//     String name;
//     int roll;
//     Static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return this.name;
//     }
//  }

 /*Super keyword
  * super keyword is used to refer immediate parent class object.
  *to access parent properties,functions,constructors
  */
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "brown";
        
        System.out.println("horse constructor is called");
    }
}


