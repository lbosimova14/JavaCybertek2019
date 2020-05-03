package Ass01_CybertekAssighments;
import java.util.Scanner;
public class DiscountCalculator {
/*Write a Java program to calculate total amount of sale based on the unit price 
 *and quantity of a product taken.   
User should be able to enter unit price and quantity.
Then the program will perform calculations and display amounts.
The discount rate is 10% for the quantity purchased between 100 and 120 units,
 and 15% for the quantity purchased greater than 120 units.
If the quantity purchased is less than 100 units, the discount rate is 0%.
See the example output as shown below:
Input:
Enter unit price: 25
Enter quantity: 110
Output:
Grand Total: $ 2750.0
Discount: 10%
Discount applied: $ 275.0
Total: $ 2475. 
 */
  public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		int quantity;
		double unitPrice;
	    double discount=0;
		double discountApplied=0;
		double TotalSale=0,GrandTotal=0;
	    
		System.out.println("Enter the unit price:");
          unitPrice=keyboard.nextInt();
		System.out.println("How many do yo want to buy? Enter the quantity:");
            quantity=keyboard.nextInt();
      
         
          if(quantity>=100 && quantity<=120) {
        	 GrandTotal=unitPrice*quantity;
        	 discount=10;
        	 discountApplied=((double)10/100)*GrandTotal;
        	 TotalSale=GrandTotal-discountApplied;
          }else if (quantity>120) {
        	  GrandTotal=unitPrice*quantity;
         	 discount=15;
         	 discountApplied=((double)15/100)*GrandTotal;
         	 TotalSale=GrandTotal-discountApplied;
        	 
          }else {
        	  GrandTotal=unitPrice*quantity;
         	 discount=0;
         	 discountApplied=((double)0/100)*GrandTotal;
         	 TotalSale=GrandTotal-discountApplied;
          }

	System.out.printf("Grand total: $%.2f\nDiscount: %.0f%%\nDiscount applied: $%.2f\nTotal: $%.2f "
			            ,GrandTotal,discount,discountApplied,TotalSale);
	
	
	System.exit(0);
	
	
	}

}
