package startproject1;

import java.text.NumberFormat;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args)
	{
		final byte Months_in_year = 12;
		final byte Percentage = 100;
		int Principal = 0;
		float AnnualInterest = 0;
		float MonthlyInterest = 0;
		int NumberofPayments = 0;
		Scanner Scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Principal:");
			Principal = Scanner.nextInt();
			if(Principal >= 1000 && Principal <= 1000000)
				break;
			System.out.println("Enter a value between 1000 and 1000000");
		}
		
		while (true) {
			System.out.println("Annual Interest Rate:");
			AnnualInterest = Scanner.nextFloat();
			if(AnnualInterest >= 1 && AnnualInterest <= 30) {
				MonthlyInterest = AnnualInterest/Percentage/ Months_in_year;
				break;
				}
			System.out.println("Enter value between 1 and 30");
		}
		
		while (true) {
			System.out.print("Period(Years)");
			byte years = Scanner.nextByte();
			if(years >= 1 && years <= 30){
				NumberofPayments = years * Months_in_year;
				break;
			}
			System.out.println("Enter a value between 1 and 30");
		}
		
		double mortgage = Principal * (MonthlyInterest*Math.pow(1+MonthlyInterest, NumberofPayments)) / (Math.pow(1+MonthlyInterest, NumberofPayments) - 1);
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
				System.out.println("Mortgage:" + mortgageFormatted);
	}

}
