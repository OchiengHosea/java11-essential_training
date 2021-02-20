package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

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
}
