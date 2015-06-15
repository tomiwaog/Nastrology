import java.util.Scanner;

public class TestDelivery {

	public static void funny() {
		String[] signDesc = ProfilesDescription.signDescription;
		Scanner enterKey = new Scanner(System.in);
		// Gets sign Description text from ProfilesDescription.java class

		System.out
				.println("\t\t\t***************** TEST BEGINS *****************");
		System.out.println("LEVEL 1");
		// Loops starts at 0, then ends at 4 (12/3)
		for (int i = 0; i < signDesc.length / 3; i++)
			//Adds number listing to the Array listing the (the +1 is used as numbering starts from 0
			System.out.printf("%2d. %s\n", (i+1), signDesc[i]); //Another way to display using printf formatting

		System.out
				.println("\n* Use ENTER key on your Keyboard for next Level *");
		String pressEnter = enterKey.nextLine();
		System.out.println("\nLEVEL 2");
		// loop starts at 4, but end at 8 (12-4)
		for (int i = 4; i < signDesc.length - 4; i++)
			//Adds number listing to the Array listing
			System.out.println((i+1)+ ". "+signDesc[i]);

		System.out
				.println("\n* Use ENTER key on your Keyboard for next Level *");
		pressEnter = enterKey.nextLine();

		System.out.println("\nLEVEL 3");
		// loop starts at 8, but end at 12
		for (int i = 8; i < signDesc.length; i++)
			//Adds number listing to the Array listing the (the +1 is used as numbering starts from 0
			System.out.printf("%2d. %s\n", (i+1), signDesc[i]); //Another way to display using printf formatting

		System.out
		.println("\n* Use ENTER key on your Keyboard TO BEGIN *");
		String enterGame = enterKey.nextLine();
	}
}