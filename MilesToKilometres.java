// Utsav Shakya (T00693024), Alina Rattanshi (T00691884)
// conversion of miles to kilometres
package Shakya2;

import java.util.Scanner;

public class MilesToKilometres {
    static final double M2K = 1.609344;    //conversion factor: 1mile = 1.609344km
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputmiles;      //hold mile value provided by user
        double  resultkm;       // hold converted kilometre value

        System.out.println("miles to kilometre converter");
        System.out.println("Enter your length in miles: ");
        inputmiles = sc.nextDouble();        // get miles from user

        resultkm = inputmiles * M2K;   //conversion formula

        System.out.print ("converted " + inputmiles + " miless" + " =");
        System.out.println("\t" + resultkm + " kilometre");    //display result
    }
}
