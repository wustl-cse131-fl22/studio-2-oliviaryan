package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int winLimit = 1000;	
	double startAmount = 500.0;				
	int totalSimulations = 0;
	int totalLosses = 0;
	int totalWins = 0;
	double expectedRuin = (double)(1.0-(startAmount/winLimit));
		
		while (startAmount > 0 && startAmount <= winLimit)
			{
			
			totalSimulations = totalSimulations+1;
			
			int randomNumber = (int)(Math.random()*10) + 1;
		
			boolean winningNumber = randomNumber > 5;
		
				if (winningNumber)
				{
			
				totalWins = totalWins+1;
				
				startAmount = startAmount+1;
				
				System.out.println("You won $1!!! Your balance is $"+startAmount);
			
				}
		
					else
					{
						
					totalLosses = totalLosses+1;
						
					startAmount = startAmount-1;
					
					System.out.println("You lost $1! XD Your balance is $"+startAmount);
					}
		
		
		}
		
		double ruinRate = (double) totalLosses/totalSimulations;
		
		System.out.println("Total Simulations Run: " + totalSimulations);	
		System.out.println("Total Losses: " + totalLosses);
		System.out.println("Total Wins: " + totalWins);
		System.out.println("Ruin Rate from Simulations: "+ruinRate);
		System.out.println("Expected Ruin Rate: "+expectedRuin);
	}

}
	
