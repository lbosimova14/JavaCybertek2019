package Ass01_CybertekAssighments;

import java.util.Scanner;

public class LoopDrawRectangleOutline {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = s.nextInt();
	    
	    String rect ="xxx\n";
	    for(int i=1; i<=n;i++)
	    {
	       rect +="x x\n";
	    }
	    rect +="xxx";
	    System.out.println(rect);

	}

}
/* 
each rectangle row is 3 x: xxx
inner rect row is "x  x"
for example:
n = 2
xxx
x  x
x  x\
xxx
n=3
xxx
x  x
x  x\
x  x\
xxx*/