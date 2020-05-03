package Ass01_CybertekAssighments;
/*status code: 200, OK 201, Created 202, Accepted 301, Moved Permanently 303, See Other 304, Not Modified
 307, Temporary Redirect 400, Bad Request 401, Unauthorized 403, Forbidden 404, Not Found 410, Gone 500, Internal Server Error
 503, Service Unavailable
1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself,
the appropriate label from the above list based on status 
 */

public class Task04_HTTPS_StatusCode {

	public static void main(String[] args) {
		int StatusCode=301;
		String finalResult="Invalid Status code";//if statuse code not match any of them result gives me 
		                                           //Invalid Status code default initialized string
		
		if(StatusCode==200) {
			System.out.println("OK");
		}
		if(StatusCode==201) {
			finalResult= "Created";
		}
		if(StatusCode==202) {
			finalResult="Accepted";
		}
		if(StatusCode==301) {
			finalResult="Moved permanently";
		}
		if(StatusCode==303) {
			finalResult="See others";
		}
		if(StatusCode==304) {
			finalResult= "Not modified";
		}
		if(StatusCode==307) {
			finalResult= "Temparary redirect";
		}
	    if(StatusCode==400) {
	    	finalResult= "Bad Request";
		}
		if(StatusCode==401) {
			finalResult= "Service Unavailable";
			
		}
		
		System.out.println("Status code "+ StatusCode +" is: "+  finalResult );
		
		/*if(StatusCode==200) {
			System.out.println("OK");
		}
		else if(StatusCode==201) {
			System.out.println("Created");
		}
		else if(StatusCode==202) {
			System.out.println("Accepted");
		}
		else if(StatusCode==301) {
			System.out.println("Moved permanently");
		}
		else if(StatusCode==303) {
			System.out.println("See others");
		}
		else if(StatusCode==304) {
			System.out.println("Not modified");
		}
		else if(StatusCode==307) {
			System.out.println("Temparary redirect");
		}
		else if(StatusCode==400) {
			System.out.println("Bad Request");
		}
		else if(StatusCode==401) {
			System.out.println("Service Unavailable");
		}
		*/

	

	}

}
