package firstJavaApp;

/*
 * the program accepts 15 measurements in inch from the user
 * set count to 15 
 * converts each accepted measurements into millimeter
 * displays the converted result 
 * while iteration technique has been used
 * 
 */

import java.util.Scanner;



public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this the Measurement conversion example using While Loop
		/*
		int count =0;
		while(count<15) {
			System.out.println("the count "+ count);
			System.out.println("Please Enter the Measurement");
			Scanner scan = new Scanner(System.in);
			double measurement = scan.nextDouble();
			double result = measurement*25.44;
			System.out.println("the measurement result in mm will be:"+result);
			count = count+1;	
		}
		System.out.println("All Measurements Processed !!");
		 */
		
		int count =0;
		
		do {
			System.out.println("count "+ count);
			System.out.println("Please enter the measurement in inch");
			Scanner scan = new Scanner(System.in);
			double meas = scan.nextDouble();
			double result = meas*25.44;
			System.out.println("The result "+ result);
			count++;
			
			}while(count<15);
		
		System.out.println("All Measurements Processed !!1");
			
		
	}

}
