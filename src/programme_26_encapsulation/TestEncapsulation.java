package programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        //setting valuef the variables
        obj.setAge(19);
        obj.setName("Siddhi");
        obj.setRollNo(41);
        //displaying values of the variables//
        System.out.println(" Siddhi's name "+ obj.getName());
        System.out.println(" Siddhi's age "+ obj.getAge());
        System.out.println(" Siddhi's roll no "+ obj.getRollNo());


        //direct access of roll no is not poss due to encapsulation//

    }
}
