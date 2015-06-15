import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternateMain {
	// This class was created to use Array instead of List Array

	public static void main(String[] args) {
		// Prints list of Options

		//Runs methods from other classes within the project
		Intro.Introduction();
		signDescription.printOptionMenu();
		
		// Declaration of monthSign and Description for Switch
		String monthSign = "";
		int monthNumREP = 0;
		String signDescription = "";

		// Empty Array
		// Selected option will be stored in it later
		String[] possibleList = new String[3];
		String[] hiddenPossibleSign = new String[3];

		// Scanner system
		Scanner selectNum = new Scanner(System.in);

		int month = 0; // nothing, initialises month ID

		int max = 12; // represents numbers of personalities
		int counter = 0; // counts the number of level

		
		String enterGame = selectNum.nextLine();
		System.out.println("\t*************** NOW, LETS WRITE THEM DOWN *************** ");
		// if month types is greater than 0 and less than 12
		while ((month >= 0) && (month < max) && (counter < 3)) {
			counter++;
			System.out.print("\nSelect a Number from level " + counter + ": (TYPE HERE)");
			month = selectNum.nextInt();
			System.out.println("You have entered: " + month + " from level "
					+ counter);

			switch (month) {
			case 1:
				monthSign = "Aries";
				monthNumREP = 1;
				signDescription = "1. Independent, generous, moody, short tempered, optimistic, self-involved, impatient\n";
				break;
			case 2:
				monthSign = "Taurus";
				monthNumREP = 2;
				signDescription = "2. Stubborn, honest, possession OR materialistic, self-indulging, lazy\n";
				break;
			case 3:
				monthSign = "Gemini";
				monthNumREP = 3;
				signDescription = "3. Intelligent, thinker, communicative, humourous, multiskilled, indecisive, changeable, adaptable, restless, witty, devious\n";
				break;
			case 4:
				monthSign = "Cancer";
				monthNumREP = 4;
				signDescription = "4. Moody, caring, dependable, homely, family-oriented / issues, over-sensitive, slightly insecure, responsive\n";
				break;
			case 5:
				monthSign = "Leo";
				monthNumREP = 5;
				signDescription = "5. Confident, melodramatic, generous, loyal, stubborn, vain, pretentious, family-oriented/ family issues\n";
				break;
			case 6:
				monthSign = "Virgo";
				monthNumREP = 6;
				signDescription = "6. Analytical, observant, fussy, precise, cold, interfering, inflexible, direct, helpful, reliable, not fun\n";
				break;
			case 7:
				monthSign = "Libra";
				monthNumREP = 7;
				signDescription = "7. Diplomatic, hospitable, thinker, colourful/likes-drawing/ART, Vain, indecisive, fair, social, intelligent\n";
				break;
			case 8:
				monthSign = "Scorpio";
				monthNumREP = 8;
				signDescription = "8. Resourceful, passionate, loyal, evil, stubborn, determined, obsessive, jealous, intuitive, violent, aggressive, manipulative, ride or die\n";
				break;
			case 9:
				monthSign = "Sagittarius";
				monthNumREP = 9;
				signDescription = "9. Exciting, independable, unemotional, adventurous, mutable (changeable), philosophical, stubborn, argumentative\n";
				break;
			case 10:
				monthSign = "Capricorn";
				monthNumREP = 10;
				signDescription = "10. Stubborn, resourceful, hardworking, ambition, dictatorial, conceited, emotional, distrusting, reponsible\n";
				break;
			case 11:
				monthSign = "Aquarius";
				monthNumREP = 11;
				signDescription = "11. Witty, communicative, thinker, original, intelligent, aloof, unemotional\n";
				break;
			case 12:
				monthSign = "Pisces";
				monthNumREP = 12;
				signDescription = "12. Emotional, compassionate, devoted, lazy, imaginative, oversensitive, self-pitying, escapist\n";
				break;
			default:
				monthSign = "Invalid month";
				break;

			}
			//Passes values into memory location, incrementd by counter i.e. List[increment]
			possibleList[counter - 1] = signDescription;
			hiddenPossibleSign[counter -1] = monthSign;

		}
System.out.println("\n**********************************************************");
		System.out
				.println("\n***** Now Select from ONE from the LIST below:-");
		//Displaying selected list using loop index, remember u can also do without INDEX
		for (int i = 0; i < possibleList.length; i++) {
			//System.out.println(hiddenPossibleSign[i]); //Do not display 3 guesses yet
			System.out.println(possibleList[i]);
		}
		System.out.print("Enter your final selection: ");
		int finalSign = selectNum.nextInt();
		month = finalSign;
		switch (month) {
		case 1:
			monthSign = "Aries";
			signDescription = "1. Independent, generous, moody, short tempered, optimistic, self-involved, impatient\n";
			break;
		case 2:
			monthSign = "Taurus";
			signDescription = "2. Stubborn, honest, possession OR materialistic, self-indulging, lazy\n";
			break;
		case 3:
			monthSign = "Gemini";
			signDescription = "3. Intelligent, thinker, communicative, humourous, multiskilled, indecisive, changeable, adaptable, restless, witty, devious\n";
			break;
		case 4:
			monthSign = "Cancer";
			signDescription = "4. Moody, caring, dependable, homely, family-oriented / issues, over-sensitive, insecure, responsive\n";
			break;
		case 5:
			monthSign = "Leo";
			signDescription = "5. Confident, melodramatic, generous, loyal, stubborn, vain, pretentious, family-oriented/ family issues\n";
			break;
		case 6:
			monthSign = "Virgo";
			signDescription = "6. Analytical, observant, fussy, precise, cold, interfering, inflexible, direct, helpful, reliable, not fun\n";
			break;
		case 7:
			monthSign = "Libra";
			signDescription = "7. Diplomatic, hospitable, thinker, colourful/likes-drawing/ART, Vain, indecisive, fair, social, intelligent\n";
			break;
		case 8:
			monthSign = "Scorpio";
			signDescription = "8. Resourceful, passionate, loyal, evil, stubborn, determined, obsessive, jealous, intuitive, violent, aggressive, manipulative, ride or die\n";
			break;
		case 9:
			monthSign = "Sagittarius";
			signDescription = "9. Exciting, independable, unemotional, adventurous, mutable, philosophical, stubborn, argumentative\n";
			break;
		case 10:
			monthSign = "Capricorn";
			signDescription = "10. Stubborn, resourceful, hardworking, ambition, dictatorial, conceited, emotional, distrusting, reponsible\n";
			break;
		case 11:
			monthSign = "Aquarius";
			signDescription = "11. Witty, communicative, thinker, original, intelligent, aloof, unemotional\n";
			break;
		case 12:
			monthSign = "Pisces";
			signDescription = "12. Emotional, compassionate, devoted, lazy, imaginative, oversensitiv, self-pitying, escapist\n";
			break;
		default:
			monthSign = "Invalid month";
			break;
			
		}
		System.out.println("Newsflash, You are a ....." + monthSign.toUpperCase());

		System.out.print("\nDid I guess it right? please Enter 'YES' or 'NO':");

		Scanner selectYesorNo = new Scanner(System.in);
		String amIRight = selectYesorNo.nextLine();
		
		while (amIRight.toLowerCase().contentEquals("")){
			
			System.out.println("You are a ....." + monthSign.toUpperCase());

			System.out.print("\nDid I guess it right? please Enter 'YES' or 'NO':");
			amIRight = selectYesorNo.nextLine();
		}
		
		if (amIRight.toLowerCase().contentEquals("yes")) {
			System.out
					.println("THANKS FOR PLAYING, ASTROLOGY IN YOUR FACE BITCH!");
		} 
		else {
			System.out
					.println("\nOkay you got me, Is it any of the following 3?...");
			// Displays 3 possible signs with ForLoop WITHOUT LOOPINDEX
			for (String starSign: hiddenPossibleSign){
				System.out.println(starSign);
			}
			
			System.out.print("\nEnter Yes or NO: ");
			amIRight = selectYesorNo.nextLine();
			selectYesorNo.close();
			
			if (amIRight.toLowerCase().contentEquals("yes")) {
				System.out
						.println("THANKS FOR PLAYING, ASTROLOGY MAKES SENSE!");
			} else {
				System.out.println("\nNo? Well Thanks for Playing! \nGOODBYE!!!");
				System.out.println("ARIES, CAPRICORN, VIRGOs and sometimes LEOs are 100% VERY likely to disagree with the Accuracy of this Test");
			}
		}
	}

}
