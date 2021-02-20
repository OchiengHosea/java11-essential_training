package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // inferred data types
        var myInt = 6; // infers type int
        var myFloat = 5f; // infers type float;
        var myDouble = 5d; // infers type double
        var myLong = 5L; // infers type long

        // Wrapper classes used for conversion between classes
        // primitive values are always signed

        /*
         Initializing an object variable
         ClassName instanceName = new ClassName();

         Inferred typing with Objects
         var itemNme = new ClassName();
         */
        System.out.println("Hello from Java, " + args[0] + "!");
    }
}
