package programme_21_abstractexample;

public class Rectangle extends Shape {
    public Rectangle(double width, double length) {
        super();
    }

    public Rectangle() {

    }

    public void draw(){                  //implementation of abstract method//
        System.out.println("Drawing rectangle");
    }
    public  void myMethod(){
        System.out.println("Re -Test");

    }
    public static void main(String []args){
        Rectangle obj = new Rectangle();
        obj.myMethod();
        Shape obj1 = new Rectangle();
        obj1.draw();


    }


}
