import java.util.Scanner;

public class signDescription {
	// Prints list of Options

	public static void printOptionMenu() {

		String monthSign = "";
		String signDescription = "";

		// Empty Array
		// Selected option will be stored in it later
		String[] selectedProfiles = new String[3];
		String[] hiddenSelectedSign = new String[3];

		Scanner enterKey = new Scanner(System.in);

		// Scanner system
		Scanner selectNum = new Scanner(System.in);

		int month = 1; // nothing, initialises month ID

		// Gets sign Description text from OriginalSignDescription.java class
		String[] signDesc = OriginalSignDescription.signDescription;

		System.out
				.println("\t\t\t***************** TEST BEGINS *****************");
		System.out.println("LEVEL 1");
		// Loops starts at 0, then ends at 4 (12/3)
		for (int i = 0; i < signDesc.length / 3; i++)
			System.out.println(signDesc[i]);

		System.out
				.println("\n* Use ENTER key on your Keyboard for next Level *");
		String pressEnter = enterKey.nextLine();
		System.out.println("\nLEVEL 2");
		// loop starts at 4, but end at 8 (12-4)
		for (int i = 4; i < signDesc.length - 4; i++)
			System.out.println(signDesc[i]);

		System.out
				.println("\n* Use ENTER key on your Keyboard for next Level *");
		pressEnter = enterKey.nextLine();

		System.out.println("\nLEVEL 3");
		// loop starts at 8, but end at 12
		for (int i = 8; i < signDesc.length; i++)
			System.out.println(signDesc[i]);

		int counter = 0; // counts the number of level

		String enterGame = enterKey.nextLine();
		System.out
				.println("\t*************** NOW, LETS WRITE THEM DOWN *************** ");
		// if month types is greater than 0 and less than 12
		while (month > 0 && month <= 12 && (counter < 3)) {
			counter++;
			System.out.print("\nSelect a Number from level " + counter
					+ ": (TYPE HERE)");
			month = selectNum.nextInt();
			System.out.println("You have entered: " + month + " from level "
					+ counter);

			switch (month) {
			case 1:
				monthSign = "Aries";
				signDescription = signDesc[month - 1];
				break;
			case 2:
				monthSign = "Taurus";
				signDescription = signDesc[month - 1];
				break;
			case 3:
				monthSign = "Gemini";
				signDescription = signDesc[month - 1];
				break;
			case 4:
				monthSign = "Cancer";
				signDescription = signDesc[month - 1];
				break;
			case 5:
				monthSign = "Leo";
				signDescription = signDesc[month - 1];
				break;
			case 6:
				monthSign = "Virgo";
				signDescription = signDesc[month - 1];
				break;
			case 7:
				monthSign = "Libra";
				signDescription = signDesc[month - 1];
				break;
			case 8:
				monthSign = "Scorpio";
				signDescription = signDesc[month - 1];
				break;
			case 9:
				monthSign = "Sagittarius";
				signDescription = signDesc[month - 1];
				break;
			case 10:
				monthSign = "Capricorn";
				signDescription = signDesc[month - 1];
				break;
			case 11:
				monthSign = "Aquarius";
				signDescription = signDesc[month - 1];
				break;
			case 12:
				monthSign = "Pisces";
				signDescription = signDesc[month - 1];
				break;
			default:
				monthSign = "Invalid month";
				break;
			}
			// Passes values into memory location, increment by counter i.e.
			// List[increment]
			selectedProfiles[counter - 1] = signDescription.substring(3);
			hiddenSelectedSign[counter - 1] = monthSign;
		}

		System.out
				.println("\n**********************************************************");
		System.out.println("\n***** Now Select from ONE from the LIST below:-");
		// Displaying selected list using loop index, remember u can also do
		// without INDEX
		for (int i = 0; i < selectedProfiles.length; i++) {
			// System.out.println(hiddenPossibleSign[i]); //Do not display 3
			// guesses yet
			System.out.println("Select option:" + (i + 1) + "\t"
					+ selectedProfiles[i]);
		}
		System.out.print("Enter your final selection: ");
		int finalSign = selectNum.nextInt();
		int finalmonth = finalSign;
		switch (finalmonth) {
		//If user select option from 3 info, option is mapped to location in array
		case 1:
			monthSign = hiddenSelectedSign[0];
			signDescription = selectedProfiles[0];
			break;
		case 2:
			monthSign = hiddenSelectedSign[1];
			signDescription = selectedProfiles[1];
			break;
		case 3:
			monthSign = hiddenSelectedSign[2];
			signDescription = selectedProfiles[2];
			break;
		default:
			monthSign = "Invalid month";
			break;

		}
		System.out.println("Newsflash, You are a ....."
				+ monthSign.toUpperCase());

		System.out.print("\nDid I guess it right? please Enter 'YES' or 'NO':");

		Scanner selectYesorNo = new Scanner(System.in);
		String amIRight = selectYesorNo.nextLine();

		while (amIRight.toLowerCase().contentEquals("")) {

			System.out.println("You are a ....." + monthSign.toUpperCase());

			System.out
					.print("\nDid I guess it right? please Enter 'YES' or 'NO':");
			amIRight = selectYesorNo.nextLine();
		}

		if (amIRight.toLowerCase().contentEquals("yes")) {
			System.out
					.println("THANKS FOR PLAYING, ASTROLOGY IN YOUR FACE BITCH!");
		} else {
			System.out
					.println("\nOkay you got me, Is it any of the following 3?...");
			// Displays 3 possible signs with ForLoop WITHOUT LOOPINDEX
			for (String starSign : hiddenSelectedSign) {
				System.out.println(starSign);
			}

			System.out.print("\nEnter Yes or NO: ");
			amIRight = selectYesorNo.nextLine();
			selectYesorNo.close();

			if (amIRight.toLowerCase().contentEquals("yes")) {
				System.out
						.println("THANKS FOR PLAYING, You're the reason why ...\nASTROLOGY MAKES SENSE!");
			} else {
				System.out
						.println("\nNo? Well Thanks for Playing! \nGOODBYE!!!");
				System.out
						.println("ARIES, CAPRICORN, VIRGOs and sometimes LEOs are 100% VERY likely to disagree with the Accuracy of this Test");
			}

		}
	}
}