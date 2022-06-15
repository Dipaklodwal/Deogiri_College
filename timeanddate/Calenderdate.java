package timeanddate;

import java.util.*;
import java.time.Month;
import java.util.Date;
import java.util.Calendar.*;
//import static java.util.Calendar.MONTH;

/**
 *
 * @author student
 */
public class Calenderdate {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date is :-" + date);
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date);

        System.out.println("Calender Cal 1. Month is :-" + cal1.get(Calendar.MONTH));

        System.out.println("Calender Cal 1. Year  is :-" + cal1.get(Calendar.YEAR));

        System.out.println("Calender cal 2. Month is :-" + cal1.get(Calendar.MONTH));

        System.out.println("Calender cal 2. Year  is :-" + cal2.get(Calendar.YEAR));

        cal1.add(Calendar.MONTH, 22);
        date = cal1.getTime();
        System.out.println("Our Date is :-" + date);

        cal2.add(Calendar.MONTH, -15);
        date = cal2.getTime();
        System.out.println("Our Date is:- " + date);

    }

}
