package programme_24_method_overriding;

public class Test2 {
    public static void main(String[] args) {
        SBI s =new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("Rate of Interest :" + s.getRateOfInterest());
        System.out.println("Rate of Interest :" + i.getRateOfInterest());
        System.out.println("Rate of Interest :" + a.getRateOfInterest());
    }
}
