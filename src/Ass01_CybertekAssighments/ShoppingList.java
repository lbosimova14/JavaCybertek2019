package Ass01_CybertekAssighments;

import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);

           String item1, item2, item3, report;
          double price1, price2, price3, totalPrice;
          int count1, count2, count3;
        
         
          System.out.println("Enter Item1, count and its price:");
          item1=scan.nextLine();
          count1=scan.nextInt();
          price1=scan.nextDouble();
          
           System.out.println("Enter Item2, count and its price:");
           scan.nextLine();
          item2=scan.nextLine();
          count2=scan.nextInt();
          price2=scan.nextDouble();
        
          
           System.out.println("Enter Item3, count and its price:");
         
           scan.nextLine();
           item3=scan.nextLine();
           count3=scan.nextInt();
           price3=scan.nextDouble();
          
          
          totalPrice=count1*price1+count2*price2+count3*price3;
          report="";
          
          report+=(count1>0)?"Item1: ".concat(item1).concat(" Price: ")+(count1*price1)+",":"";
          report+=(count2>0)?"Item2: ".concat(item2).concat(" Price: ")+(count2*price2)+",":"";
          report+=(count3>0)?"Item3: ".concat(item3).concat(" Price: ")+(count3*price3)+",":"";
          
          System.out.println(report);
          System.out.println("Total price: "+totalPrice);

	}

}
