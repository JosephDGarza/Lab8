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
//	int sum = 0;
	int count = 0;
	double Score = 0.0;
		System.out.println("How many bats will we average out for our players?");
	numBats = scnr.nextInt();
	numBats = numBats+3; // had to add 1 to account for names holding first column. 
//	double []	sum2 = new double [numPlayers];
	double [][] playersBats = new double [numPlayers][numBats];
	
	
	for (i = 0; i < numPlayers; i++) {
		System.out.println("Enter numbers for your batters");
		playerId = scnr.nextInt();
		playersBats[i][0] = playerId;	
		
	}
	for (i =0; i < numPlayers; i++)
	{
		i2 = 1; // had to iterate from one to account for names at first column
		while (i2 < numBats -2)
		{
			for (int j =1; j < numBats-2; j++) {
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
			
				
			tempValue = (int) playersBats[i][0];
//			System.out.println("input bats");
			System.out.println("Now enter your results at bat for player " + tempValue + " the " + (i2) + suffix + " time at bat");
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

	for(i = 0; i < numPlayers; i++) {
		i2 = 1;
		count = 0;
		Score = 0;
		while (i2 < numBats -2) { // -2 to input into the last 2 sections of the array to store the avgs.
			
			if (playersBats[i][i2] > 0) { // to determine when an at bat converts to a base
				count++;					 // to determine batting average
				Score += playersBats[i][i2]; // to determine slugging percentage
			}
				i2++;
		}
		
			playersBats[i][numBats-2] = Score/(numBats-3);   // numbats -2 to put in correct allocation. numbats -3 to correlate with the added player # and the 2 batting avgs 
		

			playersBats[i][numBats-1] = (double)count/(numBats-3); // numbats -1 to correlate with the first position to determine avg
		
			
			System.out.println("Player number #" + playersBats[i][numBats-numBats]+" average: " +playersBats[i][numBats-1] + "		Slugging percentage: " + playersBats[i][numBats-2]);
			
	}
	System.out.println("Stats for your team: (NOTE: First number will indicate jersey number." );
	for (i = 0; i < playersBats.length; i++) {
		System.out.println(Arrays.toString(playersBats[i]));
	
	}
	
//	System.out.println("Stats for your team: (NOTE: First number will indicate jersey number." );
//	for (i = 0; i < playersBats.length; i++) {
//		System.out.println("Player number #" + playersBats[i] +" average: " + playersBats[numBats-1] + "Slugging percentage: " + playersBats[numBats-2]);
//	
//	}
		
	
	
//		for (i2 = 1; i2 < numBats; i2++) { // in order to calculate sum, has to start at 1 to ignore the player number
//			sum += playersBats[0][i2];
//		}
//		System.out.println(sum);
	
	
		
//	for (i =0; i < numPlayers; i++) {
//		
//		i2 =0;
//		tempValue = 0;
//		while (i2 < numBats -1) {
//			i2++;
////			tempValue += playersBats[i][i2];
//			sum2[i] += playersBats[i][i2];
////			sum2[i] = tempValue;
//			}
//		System.out.println(Arrays.toString(sum2));
//		}
	
	scnr.close();
	}

		
		







public static void main(String[] args) {

	
}

	}

