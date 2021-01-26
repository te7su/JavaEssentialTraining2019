package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var scan = new Scanner(System.in);

        System.out.print("Enter a numeric value: ");
        var f1 = scan.nextDouble();

        System.out.print("Enter a numeric value: ");
        var f2 = scan.nextDouble();

        double res = f1 / f2;

        System.out.println("The answer is " + res);
    }
}
