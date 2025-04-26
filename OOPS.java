public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen(); //object p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        Student s1 = new Student("xyz");
        System.out.println(s1.name);

       
        

    }
    
}

class Student{
    String name;
    int roll;
    Student(String name){
        this.name = name;
    }
}

class pen {
    private String color;
    private int tip;
    int getTip(){
        return this.tip;
    }
    String getColor(){
        return this.color;
    }
    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
    
}
