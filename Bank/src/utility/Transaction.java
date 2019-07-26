package utility;

import java.util.Scanner;
import java.util.Locale;
import utility.Account; 

public class Transaction {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = scn.nextInt();
		
		System.out.print("Enter account holder: ");
		scn.nextLine();
		String holder = scn.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		boolean hasInitialDeposit = (scn.next().charAt(0) == 'y');
	
		
			if(hasInitialDeposit) {
				System.out.println("Enter an ititial deposit valuer: ");
				double value = scn.nextDouble();
				Account cnt1 = new Account(account,holder,value );
				
				System.out.println("Accout data: ");
				cnt1.showData();
				
				System.out.print("Enter a deposit value: ");
				value = scn.nextDouble();
				cnt1.deposit(value);
				
				System.out.println("Enter a withdraw value: ");
				value = scn.nextDouble();
				cnt1.withdraw(value);
			}
			else {
				Account cnt1 = new Account(account,holder);
				
				System.out.println("Accout data: ");
				cnt1.showData();
				
				System.out.println("Enter a deposit value: ");
				double value = scn.nextDouble();
				cnt1.deposit(value);
				
				System.out.println("Enter a withdraw value: ");
				value = scn.nextDouble();
				cnt1.withdraw(value);	
			}
		
		scn.close();

	}
	

}
