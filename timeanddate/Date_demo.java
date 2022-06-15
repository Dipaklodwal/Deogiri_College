package timeanddate;

import java.util.Date;

public class Date_demo {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(999999999999L);
        Date date3 = new Date(9999999999999999L);

        System.out.println("Our first Date is :-" + date1);
        System.out.println("Our Secound Date:-" + date2);
        System.out.println("Our Third Date:-" + date3);
        if (date1.after(date2)) {
            System.out.println("Our First date is After Our Date second ");
        }
        if (date2.before(date3)) {
            System.out.println("Our second Date is Before Our Date Third ");
        }
        date2.setTime(date2.getTime() + 999999999999999999L);

        System.out.println("Our updated new second date" + date2);
        if (date2.before(date3)) {
            System.out.println("Our Second date is After Our third date");
        } else {
            System.out.println("Our Second date is after Our third date");
        }
    }
}
