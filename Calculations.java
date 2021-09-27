package Shakya2;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int A = sc.nextInt();
        System.out.println("Enter the second number : ");
        int B = sc.nextInt();
        System.out.println("The calculation for " + A +  " and " + B);
        int sum = A + B;
        int diff = A - B;
        int mul = A * B;
        int div = A / B;
        int per = A % B;
        System.out.println("\t" + A + " + " + B + " = " + sum);
        System.out.println("\t" + A + " - " + B + " = " + diff);
        System.out.println("\t" + A + " * " + B + " = " + mul);
        System.out.println("\t" + A + " / " + B + " = " + div);
        System.out.println("\t" + A + " % " + B + " = " + per);






    }
}
