package Shakya2;

import java.util.Scanner;

public class GallonsToLitres {
    static final double GAL2LT = 3.78541;
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        double inputGallons;
        double resultLitres;

        System.out.println("US Gallon to Litres Converter");
        System.out.println("How many gallons?");
        inputGallons = scan.nextDouble();

        resultLitres = inputGallons * GAL2LT;

        System.out.print("Converted: " + inputGallons + " gal" +" = ");
        System.out.println(resultLitres + "litre");
    }
}
