package test;

import java.util.Scanner;

public class dice {

public static void main(String[] args) throws InterruptedException {
		
		System.out.println("    ____");
		System.out.println("   /\\' .\\    _____");
		System.out.println("  /: \\___\\  / .  /\\");
		System.out.println("  \\' / . / /____/..\\");
		System.out.println("   \\/___/  \\'  '\\  /");
		System.out.println("            \\'__'\\/");
		System.out.println("      THE DICE!");
		
		System.out.println("press enter to continue:");
		Scanner s = new Scanner(System.in);
		String a =  s.nextLine();
		s.close();
		
		
		
		if (a.equals("")) {
		    System.out.println("Then we shall begin!..");
		    System.out.println("+---------------------+");
		}
		else {
			System.out.println("Hmm.. do you not wanna continue?");
		}
		
		int luck = (int) (Math.random() * 6) +1;
		
		System.out.println(" You're lucky today if ");
		System.out.println("    you roll a: " + luck);
		
		System.out.println("      Rolling...");
		
		Thread.sleep(2000);
		
		int c = (int) (Math.random() * 6) +1;

		System.out.println("     You rolled a");
		
		if (c == 1) {		
	    System.out.println("     __________");
	    System.out.println("    |          |");
	    System.out.println("    |          |");
	    System.out.println("    |    o     |");
	    System.out.println("    |          |");
	    System.out.println("    |__________|");
		} else if(c == 2) {
			System.out.println("      __________");
		    System.out.println("     |          |");
		    System.out.println("     |  o       |");
		    System.out.println("     |          |");
		    System.out.println("     |       o  |");
		    System.out.println("     |__________|");	
		} else if(c == 3) {
			System.out.println("      __________");
		    System.out.println("     |          |");
		    System.out.println("     |  o       |");
		    System.out.println("     |    o     |");
		    System.out.println("     |      o   |");
		    System.out.println("     |__________|");	
		} else if(c == 4) {
			System.out.println("      __________");
		    System.out.println("     |          |");
		    System.out.println("     | o     o  |");
		    System.out.println("     |          |");
		    System.out.println("     | o     o  |");
		    System.out.println("     |__________|");	
		} else if(c ==5) {
			System.out.println("      __________");
		    System.out.println("     |          |");
		    System.out.println("     | o     o  |");
		    System.out.println("     |    o     |");
		    System.out.println("     | o     o  |");
		    System.out.println("     |__________|");	
		} else {
			System.out.println("      __________");
		    System.out.println("     |          |");
		    System.out.println("     | o     o  |");
		    System.out.println("     | o     o  |");
		    System.out.println("     | o     o  |");
		    System.out.println("     |__________|");	
		}

	}

}
