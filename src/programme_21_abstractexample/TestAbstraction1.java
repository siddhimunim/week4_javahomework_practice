package programme_21_abstractexample;
/**
  Create the fourth class name TestAbstraction1 and inside create the main method as below.
 In real scenario, method is called by programmer or user
 */
public class TestAbstraction1 {

    public static void main(String[] args) {
        Shape obj = new Circle1();
        obj.draw();
        Shape obj1 = new Rectangle();
        obj1.draw();
    }
}
