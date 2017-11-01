import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Lab8 {


	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		double sluggingAvg= 0;
		System.out.println("Welcome to Batting Average Calculator!");
		String suffix = "";
		String userContinue = "Y";
		int j = 0;
		
		System.out.println("How many batters will there be?");
		while (userContinue.equalsIgnoreCase("y")) {
			System.out.println("Enter number of times at bat: ");
			int timesAtBat = scnr.nextInt();
			double[] bases = new double[timesAtBat];
			scnr.nextLine();
			
			for (int i =0; i < bases.length; i ++) {
				if (i+1 == 1) {
					suffix = "st";
				}
				if (i+1%10 == 2) { // this will remain accurate until the teens position, would need to create an additional if statement. 
					suffix = "nd";
					
				}
				if (i+1%10 == 3) {
					suffix = "rd";
					
				}
				if (i+1 > 3) { // this breaks everything over 3 from happening. 
					suffix = "th";
				}
				
					
				System.out.println("Now enter your results at bat for the " + (i+1) + suffix + " time at bat");
				bases[i] = scnr.nextInt();
				
				sluggingAvg += bases[i];
				
				if (bases[i] > 0) {
					
					j++;
				}

			}
			
			
			System.out.println(j);
			sluggingAvg = sluggingAvg/bases.length;
			System.out.println(sluggingAvg);
			
			System.out.println("Would you like to add another batter? (Y/N)");
			userContinue = scnr.next();
			
			
			
			
			
			
			
			
		
		}
System.out.println("goodbye");

scnr.close();
	}
	

}
