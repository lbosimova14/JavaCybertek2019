package Ass01_CybertekAssighments;

import java.util.Scanner;

public class WebAddress {

	public static void main(String[] args) {
		
		String URL="www.amazon.com";
		
		int begin = URL.indexOf(".a")+1;
		int end = URL.indexOf(".com");
		String domain=  URL.substring(begin , end );
	    
		int begin1 = URL.indexOf("c");
		int end1=URL.length()-1+1;
		String extension=URL.substring(begin1,end1);
		
		boolean result=URL.contains(".");
		boolean result2=URL.startsWith("www");
		
		if(result && result2) {
		System.out.println("Domain:"+domain);
        System.out.println("Extension:"+extension);}
		else
			System.out.println("Invalid URL");
	}

}
/*
 Write a Java program that can check the URL

Valid extensions for URL are: com, net, edu, org, gov

- check that it starts with www.
- check if it contains the ending dot right before the extension
- assign String domain and 
String extension.
- print them
"Domain:" amazon
"Extension:" com 
 */

/*
 * 			Scanner scan = new Scanner(System.in);

			String URL, Domain = "", EXT="";

			boolean start, end;

			System.out.println("Enter website url");

			URL = scan.nextLine();

			

			start = URL.startsWith("www") ;

			end = URL.endsWith(".com") || URL.endsWith(".gov") || URL.endsWith(".org") 

					|| URL.endsWith(".edu") || URL.endsWith(".net");

			if(start) {

				if(end) {

					int extension = URL.length()-3;

					EXT = URL.substring(extension);

					int at = URL.lastIndexOf(".");

					Domain = URL.substring(4,at);

							

				}else {

					System.out.println("Invalid URL");

				}

				

			}else {

				System.out.println("Invalid URL");

			}

			

			System.out.println("Domain: " + Domain);

			System.out.println("Extension: " + EXT);

			

			scan.close();
	} }
 */

