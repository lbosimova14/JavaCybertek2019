package Lesson21_MethodOverriding;

class WebDriver{
	
	//private  void get() {         Error
	//final public void get() {	    Error
	//void get(){                     Yes
	//protected void get(){           Yes
	public void get(){
		System.out.println("Open browser");
	}
	
}

class ChromeDriver extends WebDriver {
	@Override
	public void get() {
		System.out.println("Chrome diver class "+" Open chrome browser");
	}
}

class FirefoxDriver  extends  WebDriver{
	@Override
	public void get() {
		System.out.println("Open firefox browser");
	}
}

public class PracticeOverride {

	public static void main(String[] args) {
		 ChromeDriver driver1= new ChromeDriver();
		 driver1.get();//Chrome diver class  Open chrome browser
         FirefoxDriver driver2=new FirefoxDriver();
         driver2.get();//Open firefox browser
	}

}
