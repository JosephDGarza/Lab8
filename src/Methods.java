import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Methods {

public static void baseball(int numPlayers) {
	
	
	String suffix = " ";
	Scanner scnr = new Scanner(System.in);
	double sluggingAvg = 0;
	double j = 0;
	int numBats = 0;
	int playerId = 0;
	int i = 0;
	int i2 = 0;
	int k = 0;
	System.out.println("How many bats will we average out for our players?");
	numBats = scnr.nextInt();
	int[][] playersBats = new int [numPlayers][numBats];
	
	
	for (i = 0; i < numPlayers; i++) {
		System.out.println("Enter numbers for your batters");
		playerId = scnr.nextInt();
		playersBats[i][0] = playerId;	
		
	}
	for (i =0; i < numPlayers; i++)
	{
		i2 = 0;
		while (i2 < numBats)
		{
			
			
			
			System.out.println("input bats");
			k = scnr.nextInt();
			playersBats[i][i2] =k;
			i2++;
		}
	}
	
	
	System.out.println(playersBats[0][2]);
	System.out.println(playersBats[1][2]);
		
		
		
		
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
	}
	
public static int forLooping(int z) {
	for (int x = 0; x < z; x++) {
		
	}
	
	
	
	return z;
}

public static void main(String[] args) {

	
}

	}

