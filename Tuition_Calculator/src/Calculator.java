import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the tuition of your first year in college:");
		double tuition = input.nextDouble();
		
		System.out.println("Enter the percent increase in tuition cost per year(ie: 5 = 5%):");
		double rate = 1 + ((input.nextDouble()) / 100);
		
		double total = 0;
		for (int i = 0; i < 4; i++){
			
			double yearly_total = tuition * Math.pow(rate, i);
			tuition = yearly_total;
			total += yearly_total;
			
		}
		
		System.out.printf("The total cost of tuition for all four years is $%5.2f\n" , total);
	}

}