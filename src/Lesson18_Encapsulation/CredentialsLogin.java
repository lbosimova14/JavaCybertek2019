package Lesson18_Encapsulation;

public class CredentialsLogin {

	public static void main(String[] args) {
		Credentials obj=new Credentials();
		//System.out.println(obj.username="Fatih");//bc public variable , I can call by obj, even change name and passw
		//System.out.println(obj.password);//prichoska
		
		//as soon as give private data only visible within  the class,cannot call,or read
		//System.out.println(obj.username="Fatih"); Error bc didnt create getter or setter
		//System.out.println(obj.password);
		//in order to read and give value, needs to be create getter and setter
		
		//read:
		System.out.println(obj.getUsername()); //Ibragim
		System.out.println(obj.getPassword());//prichoska
		
		//modify:
		obj.setUsername("Laylo");
		obj.setPassword("****");
		//in order to read CALL GETTER METHOD
		System.out.println(obj.getUsername()); //Laylo
		System.out.println(obj.getPassword());//****

}
}
