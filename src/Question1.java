/*
 * Create an app. First ask the user, what is the first number and then ask, what is the last number. For example, if the user gave numbers 2 and 4, the app prints:
2
3
4 
The output in a console should be precisely:
First number?
2
Last number?
8
2
3
4
5
6
7
8
 */
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		System.out.println("First number?");
		Scanner in = new Scanner(System.in);
		
		int number1 = in.nextInt();
		System.out.println("Last number?");
		int number2 = in.nextInt();
						
		while(number1 <= number2) 
			{				
				System.out.println(number1);
				number1++;
			}
	}
}


