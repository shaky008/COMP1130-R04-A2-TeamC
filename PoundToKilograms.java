// Utsav Shakya (T00693024), Alina Rattanshi (T00691884)
// conversion of pounds to kilograms

package comp1130;
	import java.util.Scanner;
		public class PoundToKilograms {
			static final double P2K = 0.453592;    //conversion factor: 1 lb = 0.453592 kg
			public static void main(String[] args) {
		    
		        Scanner sc = new Scanner(System.in);
		        double inputpounds;      //hold pounds value provided by user
		        double  resultkilograms;       // hold converted kilograms value

		        System.out.println("pounds to kilograms converter");
		        System.out.println("Enter your weight in pounds: ");
		        inputpounds = sc.nextDouble();        // get pounds from user

		        resultkilograms = inputpounds * P2K;   //conversion formula

		        System.out.print ("converted " + inputpounds + " pounds" + " =");
		        System.out.println("\t" + resultkilograms + " kilograms");    //display result

	}

}
