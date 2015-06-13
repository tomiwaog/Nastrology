import java.util.Scanner;

public class signDescription {

	public static void printOptionMenu() {

		System.out.println("***************** TEST BEGINS *****************");
		System.out.println("LEVEL 1");
		System.out
				.println("1. Independent, generous, moody, short tempered, optimistic, self-involved, impatient");
		System.out
				.println("2. Stubborn, honest, possession OR materialistic, self-indulging, lazy");
		System.out
				.println("3. Intelligent, thinker, communicative, humourous, multiskilled, indecisive, changeable, adaptable, restless, witty, devious");
		System.out
				.println("4. Moody, caring, dependable, homely, family-oriented / issues, over-sensitive, insecure, responsive");

		Scanner enterKey = new Scanner(System.in);
		System.out.println("\n* Use ENTER key on your Keyboard for next Level *");
		String pressEnter = enterKey.nextLine();
		
		System.out.println("\nLEVEL 2");
		System.out
				.println("5. Confident, melodramatic, generous, loyal, stubborn, vain, pretentious, family-oriented/ family issues");
		System.out
				.println("6. Analytical, observant, fussy, precise, cold, interfering, inflexible, direct, helpful, reliable, not fun");
		System.out
				.println("7. Diplomatic, hospitable, thinker, colourful/likes-drawing/ART, Vain, indecisive, fair, social, intelligent");
		System.out
				.println("8. Resourceful, passionate, loyal, evil, stubborn, determined, obsessive, jealous, intuitive, violent, aggressive, manipulative, ride or die");

		System.out.println("\n* Use ENTER key on your Keyboard for next Level *");
		pressEnter = enterKey.nextLine();
		System.out.println("\nLEVEL 3");
		System.out
				.println("9. Exciting, independable, unemotional, adventurous, mutable, philosophical, stubborn, argumentative");
		System.out
				.println("10. Stubborn, resourceful, hardworking, ambition, dictatorial, conceited, emotional, distrusting, reponsible");
		System.out
				.println("11. Witty, communicative, thinker, original, intelligent, aloof, unemotional");
		System.out
				.println("12. Emotional, compassionate, devoted, lazy, imaginative, oversensitiv, self-pitying, escapist");

	}
}
