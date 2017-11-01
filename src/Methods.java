import java.util.Scanner;

public class Methods {

public static void baseball(double[] player, double[]) {
	String suffix = " ";
	Scanner scnr = new Scanner(System.in);
	double sluggingAvg = 0;
	double j = 0;
	
	for (int i =0; i < avgCalc.length; i ++) {
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
		avgCalc[i] = scnr.nextInt();
		
		sluggingAvg += avgCalc[i];
		
		if (avgCalc[i] > 0) {
			
			j++;
		}

	}
	System.out.println(j);
	sluggingAvg = sluggingAvg/avgCalc.length;
	System.out.println(sluggingAvg);
	
	return;
		
}

public static void main(String[] args) {

	
}

	}

