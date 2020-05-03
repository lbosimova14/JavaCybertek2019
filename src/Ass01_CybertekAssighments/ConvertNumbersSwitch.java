package Ass01_CybertekAssighments;
import java.util.Scanner;
public class ConvertNumbersSwitch {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
	  
	    System.out.println("Enter a number between 0 to 9: ");
	    int number=keyboard.nextInt();
	  //remember switch statement  not work  in boolean expression 
	// way to using the switch statement.
	    switch(number) {
	case 0: System.out.println("You have entered: zero"); break;
	case 1:System.out.println("You have entered: one");break;
	case 2:System.out.println("You have entered: two");break;
	case 3:System.out.println("You have entered: three");break;
	case 4:System.out.println("You have entered: four");break;
	case 5:System.out.println("You have entered: five");break;
	case 6:System.out.println("You have entered: six");break;
	case 7:System.out.println("You have entered: seven");break;
	case 8:System.out.println("You have entered: eight");break;
	case 9:System.out.println("You have entered: nine");break;
	default:System.out.println("You have entered: Invalid number");} 
	 
	   // way  to using the ternary conditional statement
	
	 /*  String str = (number==1)? "one"
			           :(number==2)? "two"
					   :(number==3)? "tree"
					   :(number==4)? "four"
					   :(number==5)? "five"
					   :(number==6)? "six"
					   :(number==7)? "seven"
					   :(number==8)? "eight"
					   :(number==9)? "nine"
					   : "Invalid number";
	System.out.println("You have entered: "+ str);*/

	
	
	keyboard.close();
	}

}
/*	write a program that can convert numbers (between 0~9) to words.
if the number is greater than 9, the out put should be "invalid number.
            DO NOT USE IF STATEMENT
ex 1: 
input:
enter a number between 0 to 9:
1
out put:
you have entered: one
ex 2:
input:
enter a number between 0 to 9:
2
output:
you have entered: two
ex 3:
enter a number between 0 to 9:
10
output:
you have entered: Invalid number*/