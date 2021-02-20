package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        primitiveValuesToString();
        compareStrings();
    }

    private static void primitiveValuesToString() {
        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: "+ numF.format(doubleValue));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: "+ intF.format(doubleValue));

        // to force non-comma usage
        intF.setGroupingUsed(false);
        System.out.println("Number without commas: "+ intF.format(doubleValue));

        //to use locale
        var locale = Locale.getDefault();
        var localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number formatted by local: "+ localFormatter.format(doubleValue));


        // Local explicit specification
        var locale2 = new Locale("en", "KE");
        var localFormatter2 = NumberFormat.getNumberInstance(locale2);
        System.out.println("Number formatted by explicit local: "+ localFormatter2.format(doubleValue));

        var currencyFormatter = NumberFormat.getNumberInstance(locale2);
        System.out.println("Currency Format "+ currencyFormatter.format(doubleValue));

        var df = new DecimalFormat("KES 0.00");
        System.out.println("Decimal Format: " + df.format(1));
    }

    private static boolean compareStrings() {
        String s1 = "Hello!";
        var s2 = "Hello!";
        if (s1 == s2) {
            System.out.println("they match");
        } else {
            System.out.println("They dont match");
        }

        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        if (s3 == s4) {
            System.out.println("they match");
        } else {
            System.out.println("They dont match");
        }

        if (s3.equals(s4)){
            System.out.println("they match");
        } else {
            System.out.println("They dont match");
        }


        var s5 = "HELLO!";
        if (s5.equalsIgnoreCase(s4)){
            System.out.println("they match");
        } else {
            System.out.println("They dont match");
        }

        return s1 == s2;
    }
}
