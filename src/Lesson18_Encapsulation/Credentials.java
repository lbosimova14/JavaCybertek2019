package Lesson18_Encapsulation;

public class Credentials {

	/*
	 * username
	 * password
	 */
	
	//public String username="Ibragim";
	//public String password="prichoska";
	private String username="Ibragim";//shortcut:select username ===>click right===>source==>generate getter,setter
	private String password="prichoska";
	
	//getter
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	//setter
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
		
	}
	
	
	
}
