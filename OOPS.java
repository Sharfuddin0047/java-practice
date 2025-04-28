public class OOPS {
    public static void main(String[] args) {
        // pen p1 = new pen(); //object p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());
        Student s1 = new Student();
        // Student s2 = new Student("xyz");
        // Student s3 = new Student(444);
        s1.roll = 456;
        s1.name = "xyz";
        s1.password = "abcd";
        s1.marks = new int[3];
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
    
}

class Student{
    String name;
    int roll;
    String password; 
    int marks[];
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student(){
        System.out.println("constructor is called...");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
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
