package student;

public class Student implements java.io.Serializable {

    public int roll_no;
    public String first_name;
    public String last_name;
    public String address;
    public long mobile_no;
    float percentage;

    public void mailcheck() {
        System.out.println("mail check:-" + roll_no + " " + first_name + " " + last_name + " " + address + " "
                + mobile_no + " " + percentage);

    }
}
