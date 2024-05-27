package OOPS;

public class C01 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen1.write();
        pen2.write();

    }
}
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("The " + this.color + " Pen is Writing.");
    }
}
