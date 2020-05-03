package Ass01_CybertekAssighments;

import java.util.Scanner;

public class OnlineBookMerchands {

	public static void main(String[] args) {
	   int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
	    /*
if(isPremiumCustomer && nbooksPurchased>=5) {
	freeBooks=1;
	}else if(isPremiumCustomer &&  nbooksPurchased>=8 ) {
		freeBooks=2;
	}else if*/
		if(nbooksPurchased > 4){
			if(isPremiumCustomer){
			freeBooks = 1;
			if(nbooksPurchased > 7){
			freeBooks = 2;
			}
			}else{
			freeBooks = 0;
			if(nbooksPurchased > 6){
			freeBooks = 1;
			}
			if(nbooksPurchased > 11){
			freeBooks = 2;
			}

			}
			}else{freeBooks = 0;
			}
	
	System.out.println(freeBooks);
	
	
	
	
	
	}
}
/*
Online Book Merchants offers premium customers 1 free book with every purchase of 5 or more books 
and offers 2 free books with every purchase of 8 or more books.
It offers regular customers 1 free book with every purchase of 7 or more books, 
and offers 2 free books with every purchase of 12 or more books. 
Write a program that assigns freeBooks the appropriate value based on 
the values of the boolean variable isPremiumCustomer and the int variable nbooksPurchased.
Print amount of freeBooks into the console. */