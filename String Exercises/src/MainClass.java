import java.util.Scanner;

import StringManipulatorPackage.StringManipulate;

public class MainClass {
	
	// Main menu of the program.
	
	private static void Menu()
	{
		Scanner scanner = new Scanner(System.in);
		StringManipulate  manipulator = new StringManipulate(); 
		boolean exitMenu = false;
		int userChoice = 0;
		
		while(exitMenu != true)
		{
			System.out.println("\n--String Exercises Menu--");
			System.out.println("1: Check if given string is a palindrome.");
			System.out.println("2: Reverse Characters.");
			System.out.println("3: Reverse Phrases in String.");
			System.out.println("4: Exit System\n");
			
			while(! scanner.hasNextInt()){
				scanner.next(); // Ignore.
				System.out.println("Please enter an integer value of the choices");
			}
			
			userChoice = scanner.nextInt();
			scanner.nextLine();
			
			// System exit.
			if(userChoice == 4){
				break;
			}
			
			System.out.println("Enter the word/phrase to evaluate or reverse.");
			String word = scanner.nextLine();
			
			if(word.length() <= 1){
				System.out.println("Please enter a word/phrase that is greater that 2 or more characters in length.");
			}else{
				
				switch(userChoice)
				{
					case 1:	System.out.println( (manipulator.isPalindrome(word)) ? word + " is a palindrome." : word +  " is not a palindrome.");
							break;
					case 2:	System.out.println("The reverse of " + word + " is " + manipulator.reverseString(word));
							break;
					case 3: if(word.split("\\s+").length <= 1){
								System.out.println("Please enter a phrase with at least two words.");
							}else{
								System.out.println("The reverse of " + word + " is " + manipulator.reverseWords(word));
							}
							break;
					default:System.out.println("Invalid choice");
							break;
				}
			}
		}
		
		scanner.close();
		System.out.println("System exiting.");
	}
	
	public static void main(String[] arguments){
		
		MainClass.Menu();
		
	}
}
