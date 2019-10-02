// P5
// Ivory Brallier
// 9/29/2019
// CS164
// brallier@rams.colostate.edu
import java.util.Scanner;

public class P5 
{

	public static void main(String[] args)
	{
		//Begin scanner, console input
		Scanner scnr = new Scanner(System.in);
		
		//Declare variables
		double grossSalary = 0;
		double interestIncome = 0;
		double capitalGains = 0;
		//Calculation variables
		double totalIncome = 0;
		double adjustedIncome = 0;
		double federalTax = 0;
		double stateTax = 0;
		int exemptions = 0;
		
		//Print user prompts
		System.out.print("Salary: ");
		grossSalary = scnr.nextDouble();
		
		System.out.print("Exemptions: ");
		exemptions = scnr.nextInt();
		
		System.out.print("Interest: ");
		interestIncome = scnr.nextDouble();
		
		System.out.print("Gains: ");
		capitalGains = scnr.nextDouble();
		
		//Perform calculations
		totalIncome = grossSalary + interestIncome + capitalGains - 5000;
				
		if(exemptions > 6) 
		{
			exemptions = 6;
		}
		
		adjustedIncome = totalIncome - (exemptions * 1500);
		
		//New trial code
		if(adjustedIncome >= 50000) 
		{
			federalTax = (adjustedIncome - 50000) * .28;
		}
		if(adjustedIncome >= 35000 && adjustedIncome < 50000) 
		{
			federalTax = (adjustedIncome - 35000) * .23;
		}
		else 
		{
			federalTax += (50000 - 35000) * .23;
		}
		if(adjustedIncome >= 20000 && adjustedIncome < 35000) 
		{
			federalTax = (adjustedIncome - 20000) * .13;
		}
		else 
		{
			federalTax += (35000 - 20000) * .13;
		}
		if(adjustedIncome >= 0 && adjustedIncome < 20000) 
		{
			federalTax = (adjustedIncome - 0);
		}
		
		//Original code, needed && and to add value
		/*if(adjustedIncome >= 0 || adjustedIncome < 20000) 
		{
			federalTax = (adjustedIncome - 0);
		}
		else if(adjustedIncome >= 20000 || adjustedIncome < 35000) 
		{
			federalTax = (adjustedIncome - 20000) * .13;
		}
		else if(adjustedIncome >= 35000 || adjustedIncome < 50000) 
		{
			federalTax = (adjustedIncome - 35000) * .23;
		}
		else if(adjustedIncome >= 50000) 
		{
			federalTax = (adjustedIncome - 50000) * .28;
		}*/
		 
		stateTax = adjustedIncome * .065;
		
		//Print totals
		System.out.printf("Total Income: $%.2f\n", totalIncome);
		System.out.printf("Adjusted Income: $%.2f\n", adjustedIncome);
		System.out.printf("Total Tax: $%.2f\n", federalTax);
		System.out.printf("State Tax: $%.2f\n", stateTax);
		
		//close scanner
		scnr.close();
	}

}