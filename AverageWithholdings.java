import java.util.Scanner;
import java.util.InputMismatchException;

public class AverageWithholdings {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		
		//Get input from user for weekly income, validate it is numerical input.
		System.out.print("Please enter your weekly income: ");
		double weeklyIncome;
		
		while (true) {
			try {
				weeklyIncome = user_input.nextDouble();
				break;
			}
			catch (InputMismatchException e) {
				System.out.print("Please enter a valid weekly income: ");
				user_input.nextLine();
			}
		}
		//Calculate which tax bracket your weekly income is in and what its multiplier is
		double weeklyTax;
		
		//Income less than $500: tax rate 10%
		if (weeklyIncome < 500) {
			weeklyTax = 0.10;
		}
		//Income greater than/equal to $1500 and less than $1500: tax rate 15%
		else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
			weeklyTax = 0.15;
		}
		//Income greater than/equal to $1500 and less than $2500: tax rate 20%
		else if (weeklyIncome >= 1500 && weeklyIncome <2500) {
			weeklyTax = 0.20;
		}
		//Income greater than/equal to $2500; tax rate 30%
		else {
			weeklyTax = 0.30;
		}
		//Calculate Tax Withholding
		
		Double taxWithholding;
		taxWithholding = (weeklyTax*weeklyIncome);
		//Output what your weekly income is and what your weekly tax withholdings would be.
		
		System.out.print("Your weekly income is: $" + String.format("%.2f",weeklyIncome));
		System.out.print(" therefore your tax whithholdings is: $" + String.format("%.2f", taxWithholding));

	}

}
