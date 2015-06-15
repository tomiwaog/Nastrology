import java.util.Scanner;
public class Intro {
	
	public static void Introduction(){
		System.out.println("\t\t\t*** Welcome to TASO PERSONALITY 1.0 ***\n");
		Scanner enterKey = new Scanner(System.in);

		System.out.println("* Use ENTER key on your Keyboard to Navigate throught the Intro *");
		String pressEnter = enterKey.nextLine();
		
		System.out.println("Philosopher and Human Psychologist 'Neil Steitman' in 1942, discovered 12 types "
				+ "of personality traits inhibited by Homo Erectus (Human).");
		pressEnter = enterKey.nextLine();
		System.out.println("*You will now be presented with 12 Personality traits (in 3 groups)");
		pressEnter = enterKey.nextLine();
		System.out.println("*You are required to Select ONE trait that mostly describe your character from the set groups");
		pressEnter = enterKey.nextLine();
		
	}

}
