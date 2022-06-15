package Numberformatpackage;

import java.util.*;
import java.text.*;

public class Number_format {

    public static void main(String[] args) {
        try {
            double d = 5699.2569;
            System.out.println("Double is :-" + d);
            NumberFormat nf = null;

            nf.Numberformat.getInstance();
            System.out.println("Number Format is:-" + nf.format(d));

            nf.setMaximunIntegerDigitals(2);
            nf.setMaximunFractionDigitals(2);
            System.out.println("Formmeted As Number Max. 2 Digit for int/frac.:-" + nf.Format(d));

            nf.setMaximunIntegerDigitals(3);
            nf.setMaximunFractionDigitals(3);
            System.out.println("Formmeted As Number Max. 3 Digit for int/frac.:-" + nf.Format(d));

            nf.setMaximumCurrencyDigitals();
            System.out.println("Formated As a currency:-" + nf.Format(d));

        } catch (Exception e) {
            System.out.println("Please Enter the currect Value again :- ");;
        }
    }

}
