package com.company;

public class Main {

    public static void main(String[] args) {
        var sb = new StringBuilder("Welcome");
        sb.append(" to california");
        var s = sb.toString();
        StringBuilder b = new StringBuilder();
        b.append("Shirt Size: ")
                .append("M")
                .append(", Qty ")
                .append(4);
        var s2 = b.toString();
        System.out.println(s2);
    }
}
