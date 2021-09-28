//Utsav Shakya (T00693024), Alina Rattanshi (T00691884)
// insert 2 numbers more than 7 significant figures to 

package comp1130;
	import java.util.Scanner;
	public class Float {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);               
		System.out.println("Enter the first number : ");
		float A = sc.nextInt();         // ask user to input first number
		System.out.println("Enter the second number : ");
        float B = sc.nextInt();        // ask user to input second number
        System.out.println("The calculation for " + A +  " and " + B);
		        
        //formula (math process)
        float sum = A + B;
        float diff = A - B;
        float mul = A * B;
        float div = A / B;
        float per = A % B;
		        
        //display results (output)
        System.out.println("\t" + A + " + " + B + " = " + sum);
        System.out.println("\t" + A + " - " + B + " = " + diff);
        System.out.println("\t" + A + " * " + B + " = " + mul);
        System.out.println("\t" + A + " / " + B + " = " + div);
        System.out.println("\t" + A + " % " + B + " = " + per);

	}

}
