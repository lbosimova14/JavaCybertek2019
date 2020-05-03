package Lesson25_InterfaceWarmUp;
//create all 4 classes here
//Animal class
class  Animal{ // super class of Tiger, and Octopus
	//instance method
	public void talk() {
		System.out.println("Animal is talking");
	}
	
}
	//1st sub class
	class Tiger extends Animal{
		public void Hunt() {
			System.out.println("Tiger is hunting");
		}
		@Override
		public void talk() {
			System.out.println("Tiger is talking===>Roar");
		}
	}
	//2nd sub class
	class Octopus extends Animal{
		public void Swim () {
			System.out.println("Octopus swiming");
		}
		@Override
		public void talk() {
			System.out.println("Octopus is talking====> golo golo");
		}
	
}
   public class Zoo {     //object class
   public static void main(String[] args) {
	   
	   //create object of tiger
	   Tiger tiger1=new Tiger();
//referenceName
	   
	Tiger [] tigers= {tiger1,new Tiger()};
	Octopus octopus1=new Octopus();
	Octopus[]octopus= {octopus1,new Octopus()};
	
	       Animal   animal =    new     Tiger();
//reference type	referenceName        Object
	       animal.talk();//Tiger is talking===>Roar
// ERROR   animal.Hunt(); //I cannot call hunt method bc hunt method not exit in the Animal class,only overriden methods  i can call
	       //Rule:reference type decides what is accessible and what can be used
	      
	       
	       Animal   animal2=    new   Octopus();
	       //animal2.Swim();
	       animal2.talk();//Octopus is talking====> golo golo
	       //I cannot call swim method, if reference type is Octopus then i would call it
	       Octopus o=new Octopus();
	       o.Swim(); //Valid
	       o.talk();//Valid
	       
	
	/*
	 * WebDrive driver =new ChromDriver();
	 *Interface             Class
	 * driver.get("google.com") //overridden method will be executed, google  opens in ChromeDriver class
	 */
	
	
}//main method ending
}//Zoo class ending
/*WarmUp:
   Create a class called Animal (Do not use abstraction for now):
   Actions: Talk()
create sub classes of Animal class:
   1. Tiger:
           Actions: Hunts()
   2. Octopus:
           Actions: Swim()
override super class' instance method Talk()
create a class called Zoo:
Create Arrays of Tiger
Create Arrays of Octopus*/