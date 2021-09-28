//Utsav Shakya (T00693024), Alina Rattanshi (T00691884)
// Insert two numbers for simple math operation.

package Shakya2;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);               
        System.out.println("Enter the first number : ");
        int A = sc.nextInt();         // ask user to input first number
        System.out.println("Enter the second number : ");
        int B = sc.nextInt();        // ask user to input second number
        System.out.println("The calculation for " + A +  " and " + B);
        
        //formula (math process)
        int sum = A + B;
        int diff = A - B;
        int mul = A * B;
        int div = A / B;
        int per = A % B;
        
        //display results (output)
        System.out.println("\t" + A + " + " + B + " = " + sum);
        System.out.println("\t" + A + " - " + B + " = " + diff);
        System.out.println("\t" + A + " * " + B + " = " + mul);
        System.out.println("\t" + A + " / " + B + " = " + div);
        System.out.println("\t" + A + " % " + B + " = " + per);
    }
}
