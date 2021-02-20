package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        primitiveValuesToString();
//        compareStrings();
//        parseStringValues();
        gettingStringValuesFromUser();
        interpolateStringsWithPlaceholders();
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

    private static void parseStringValues() {
        String s2 = "Welcome       ";
        var len = s2.length();
        System.out.println(len);
        var trimmed = s2.trim();
        System.out.println(trimmed.length());
    }

    private static void gettingStringValuesFromUser() {
        var scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.println("Enter number 1: ");
        var number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        var number2 = scanner.nextInt();

        var sum = number2 + number1;
        System.out.println("Sum : " + sum);
    }

    private static String interpolateStringsWithPlaceholders() {
        var item = "Shirt";
        var size = "M";
        var price = 14.99;
        var color = "Red";

        var template = "Clothing item: %s, size %s, color %s, KES %.2f";
        var itemString = String.format(template, item, size, color, price);

        System.out.println(itemString);
        return  itemString;
    }
}
