import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Published by Joseph Garza

// This method is used to create a 2 dimensional array with the batters and their at bats. Then calculate their averages.

public class Methods {

public static void baseball(int numPlayers) {
	
	
	Scanner scnr = new Scanner(System.in);
	int numBats = 0; // number of bats holder
	int playerId = 0; // Jersey number of player
	int i = 0; // incrementer 
	int i2 = 0;// Incrementer 2
	int tempValue = 0; // value holder
	int sum = 0;
	int	sum2 =0;
	System.out.println("How many bats will we average out for our players?");
	numBats = scnr.nextInt();
	numBats = numBats+1; // had to add 1 to account for names holding first column. 
	int[][] playersBats = new int [numPlayers][numBats];
	
	
	for (i = 0; i < numPlayers; i++) {
		System.out.println("Enter numbers for your batters");
		playerId = scnr.nextInt();
		playersBats[i][0] = playerId;	
		
	}
	for (i =0; i < numPlayers; i++)
	{
		i2 = 1; // had to iterate from one to account for names at first column
		while (i2 < numBats)
		{
			for (int j =1; j < numBats; j++) {
				String suffix = " ";
					if (j == 1) {
				suffix = "st";
				}
				if (j%10 == 2) { // this will remain accurate until the teens position, would need to create an additional if statement. 
					suffix = "nd";
					
				}
				if (j%10 == 3) {
					suffix = "rd";
					
				}
				if (j > 3) { // this breaks everything over 3 from happening. 
					suffix = "th";
				}
			
				
			
//			System.out.println("input bats");
			System.out.println("Now enter your results at bat for player " +playersBats[i][0] + " the " + (i2) + suffix + " time at bat");
			tempValue = scnr.nextInt();
			playersBats[i][i2] = tempValue;
			i2++;
			
			
		}
		}
		
	}
	System.out.println("Stats for your team: (NOTE: First number will indicate jersey number." );
	for (i = 0; i < playersBats.length; i++) {
		System.out.println(Arrays.toString(playersBats[i]));
	}


		
	
	
		
	}
		
		
//	for (int i =0; i < arr1.length; i++) {
//		if (i+1 == 1) {
//		suffix = "st";
//		}
//		if (i+1%10 == 2) { // this will remain accurate until the teens position, would need to create an additional if statement. 
//			suffix = "nd";
//			
//		}
//		if (i+1%10 == 3) {
//			suffix = "rd";
//			
//		}
//		if (i+1 > 3) { // this breaks everything over 3 from happening. 
//			suffix = "th";
//		}
//		
//			
//		System.out.println("Now enter your results at bat for the " + (i+1) + suffix + " time at bat");
//		arr1[playerNumber][i] = scnr.nextInt();
//		
//		sluggingAvg += arr1[playerNumber][i];
//		
//		if (arr1[playerNumber][i] > 0) {
//			
//			j++;
//		}
//
//	}
//	System.out.println(j);
//	sluggingAvg = sluggingAvg/arr1.length;
//	System.out.println(sluggingAvg);
	
	
//public static int words(int z, int y) {
//	for (z =0; z < y; z++) {
//	String suffix = " ";
//		if (z+1 == 1) {
//	suffix = "st";
//	}
//	if (z+1%10 == 2) { // this will remain accurate until the teens position, would need to create an additional if statement. 
//		suffix = "nd";
//		
//	}
//	if (z+1%10 == 3) {
//		suffix = "rd";
//		
//	}
//	if (z+1 > 3) { // this breaks everything over 3 from happening. 
//		suffix = "th";
//	}
//	System.out.println("Now enter your results at bat for the " + (z+1) + suffix + " time at bat");
//	
//	
//	
//}
//	return suffix;
//}

public static void main(String[] args) {

	
}

	}

