public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen(); //object p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);

    }
    
}
class pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
    class Student{
        String name;
        int age;
        float percentage;

        void calcPercentage(int phy, int chem,int math){
            percentage = (phy + chem + math)/3;

        }
    }
}
