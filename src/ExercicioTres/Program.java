package ExercicioTres;

import java.util.Locale;
import java.util.Scanner;

import ExercicioTres.entities.Account;
import ExercicioTres.entities.exception.WithdrawException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = entrada.nextInt();
		entrada.nextLine();
		System.out.print("Holder: ");
		String holder = entrada.nextLine();
		System.out.print("Initial balance: ");
		double balance = entrada.nextDouble();
		System.out.print("Withdram Limit: ");
		double limit = entrada.nextDouble();
				
		try{
			Account account = new Account(number, holder, balance, limit);
			System.out.print("Enter amount for withdraw: ");
			double amount = entrada.nextDouble();
			account.withdraw(amount);
			System.out.println(account);
		}catch(WithdrawException errorWithdraw){
			System.err.printf(" %s", errorWithdraw.getMessage());
		}finally {
			entrada.close();
		}
	}
}
