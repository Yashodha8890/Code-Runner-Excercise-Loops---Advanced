/*Create a guessing game.
First the app asks the user to guess a name. If the guess of the user is correct, print “Congratulation!” and exit the loop. If the answer is incorrect, the app asks again. The user can stop guessing by typing "stop". Lastly, print how many times the user guessed.
Important - the right answer is Emma.
The output in the console should be if the guesses were Olivia, Ava and Emma:
Guess my name (type stop to exit)
Olivia
Guess my name (type stop to exit)
Ava
Guess my name (type stop to exit)
Emma
Congratulations!
You guessed 3 times.
Tip! At first create the game so that is just asks the question once. After that, try to make the loop structure. Should you use for, while or do-while? * */

import java.util.Scanner;

public class Question2{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String guess;		
		int count = 0;
		
		do
		{
			System.out.println("Guess my name (type stop to exit)");
			guess = in.nextLine();
			if(guess.equals("Emma")) 
			{
				System.out.println("Congratulations!");
				count++;
				System.out.println("You guessed " + count + " times.");
				break;
			}
			
			else if(guess.equals("stop")) 
			{
				System.out.println("You guessed " + count + " times.");
				break;
				
			}
			count++;
			
		}while(!guess.equals("Emma"));		
	}
}




