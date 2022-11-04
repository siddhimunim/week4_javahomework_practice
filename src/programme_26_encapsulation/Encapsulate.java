package programme_26_encapsulation;

public class Encapsulate {
    // private variables declared these can only be accessed by public methods of class//
    private String name;
    private int rollNo;
    private int age;
    //get method for name to access private variable name//

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
