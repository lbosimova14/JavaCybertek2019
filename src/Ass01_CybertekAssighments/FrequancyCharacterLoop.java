package Ass01_CybertekAssighments;

import java.util.Scanner;

public class FrequancyCharacterLoop {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Your String :");
	        String s1=sc.nextLine();
	        int count,j=1;
	        char var='A';
	        char ch[]=s1.toCharArray();
	        while(j<=26)
	        {
	           count=0;
	                for(int i=0; i<s1.length(); i++)
	                {
	                    if(ch[i]==var || ch[i]==var-32)
	                    {
	                        count++;
	                    }
	                }
	                if(count>0){
	                System.out.println("Frequency of "+var+" is "+count);
	                }
	                var++;
	                j++;
	        }

	}
	}

/*
Write a program that can find the frequency of characters in String
ex:
str ="AAABBCDDDDEE";
output:  A3B2C1D4E2*/