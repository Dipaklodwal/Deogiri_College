package Local_demo;

import java.util.Locale;

public class Localclassdemo {

    public static void main(String[] args) {
        Locale[] allLocales = Locale.getAvailableLocales();
        int i = 0;
        for (Locale locale : allLocales) {
            i++;
            System.out.println(i + " " + "Country:-" + locale.getDisplayCountry());
            System.out.println("Langauge:-" + locale.getDisplayLanguage());
            if (i > allLocales.length) {
                break;
            }

        }

    }

}
