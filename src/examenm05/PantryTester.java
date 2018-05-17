package examenm05;

import java.util.Scanner;

/**
 * Classe que executa el programa per untar marmelada 
 * @author Admin
 */
public class PantryTester{

    /**
     * metode main executa els metodes de les altres classes per tal de que en 
     * poguem untar la marmelada que vulguem
     * @param args
     */
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, amount;
		Jam goose = new Jam("Gooseberry", "7/4/2015", 12);
		Jam apple = new Jam("Crab Apple", "9/30/2015", 8);
		Jam rhub = new Jam("Rhubarb", "10/31/2014", 3);
		Jam rhub2 = new Jam("Rhubarb", "10/31/2014", 3);
		Pantry hubbard = new Pantry(goose, apple, rhub);

		System.out.println("Welcome to Mother Hubbard's Party!");
		System.out.println("The jams are: ");
		hubbard.print();
                /**
                 * Bucle que et demana quina marmelada vols i la quantitat que en necessites
                 * per sortir del bucle hem de posar un index erroni i despres -1
                 */
		do {
			System.out.println("Enter your selection (1,2,or 3):");
			num = scan.nextInt();
			if (num == 1 || num == 2 || num == 3) {
				hubbard.select(num);
				System.out.println("Enter amount to spread:");
				amount = scan.nextInt();
				hubbard.spread(amount);
				System.out.println("The jams are: ");
				hubbard.print();
			} else {
				System.out.println("Selection out-of-range, please enter again or '-1' for exit!");
			}
		} while (num != -1);
		System.out.println("Good-by!");
		scan.close();
	}
}
