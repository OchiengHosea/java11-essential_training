package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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

    }

    private static void tryCatchExample() {
        String s = "";
        try {
            var sub = s.substring(1);
        } catch (NullPointerException e) {
            e.printStackTrace();
            System.out.println("Null Pointer : "+ e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Out of bounds : "+ e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("We dont know this error : "+ e.getMessage());
        }
        System.out.println("App didnt break");
    }
    private static void closeObjectsWithTryWith() {
        var file = new File("hello.txt");
        System.out.println("file exists : "+file.exists());
        // Closed aoutomatically
        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {
            var text = br.readLine();
            System.out.println(text);
        } catch (IOException e){
            e.printStackTrace();
        } finally {

        }
    }


    // Challenge, build a more robust calculator that handles exceptions if users doesnt enter correct values
    // and has more operations

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
