

import java.util.*; //import

public class CoinsDanny {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a whole number from 1 to 99: ");
		int cents = in.nextInt();
		int quarter = cents / 25; //finding the number of quarters needed by casting off decimals
		int dime = (cents - quarter * 25) / 10; //finding the number of dimes needed by casting off decimals
		int nickel = (cents - (quarter * 25 + dime * 10)) / 5; //finding the number of nickels needed by casting off decimals
		int penny = cents - (quarter * 25 + dime * 10 + nickel * 5); //finding the number of pennies needed 
		
		System.out.println(quarter + " quarters" + "\t 25 cents");
		System.out.println(dime + " dimes" + "\t\t 10 cents");
		System.out.println(nickel + " nickles" + "\t 5 cents");
		System.out.println(penny + " pennies" + "\t 1 cent");
		
	}

}
