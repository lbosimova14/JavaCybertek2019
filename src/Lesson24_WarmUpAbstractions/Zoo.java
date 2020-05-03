package Lesson24_WarmUpAbstractions;
 /*
  * WarmUp:
    create an Animal abstract class   
            data/attributes: gender, age, color, nam         
            create one constructor that can set the gender, name, color and age          
            Actions: Speak(), Eat(), Sleep(), Drink();   
        create sub classes of the Animal and override those actions:
                    dog: Speak()    ==> woof
                         Sleep()    ==> 8 hours
                         Eat()      ==> KFC
                         Drinks()   ==> Milk Shake
                    Cat: Speak()    ==> meow
                         Sleep()    ==> 14 hours
                         Eat()      ==> m&m
                         Drinks()   ==> Hot chocolate
                    cow: Speak()    ==> moo
                         Sleep()    ==> 5 hours
                         Eat()      ==> grace
                         Drinks()   ==> Coffee with sugar
        create  zoo class and store some of those animals' obj
  */
public class Zoo {

	public static void main(String[] args) {
		
		//create object:
		Cat myCat=new Cat('F',3,"WhiteAndBlack", "Kitty"); 
	    Cat  Cleo  =  new  Cat('F', 5 , "White & Black", "Cleo");
	    //  System.out.println( "Name is "+ Cleo.Nickname );  //Cleo
	    //  System.out.println("Gender is "+Cleo.Gender );
	    //  System.out.println( "Color is "+Cleo.color );
	    //  System.out.println("Age is "+Cleo.Age);
	    //instead of writing name,gender,color,age for each object,create getInfo method in the abstact method (this
	    //is being regular,concrete method,not overriding)
	    
	    myCat.getInfo();
	    myCat.Drink();//not passing argument,drink name just putted inside print statement (sout)
	    myCat.Eat("M&M");//passing argument on assigned on abstract class and cat class
	    myCat.Sleep(8);
	    myCat.Speak();
	    
	    Dog dog1=new Dog('M', 5, "Olabula", "Polvon");
	    dog1.getInfo();
	    dog1.Eat("kasha");
	    dog1.Drink();
	    dog1.Sleep(2);
	    dog1.Speak();
	    
	    //create array, array suport object
	    Cat [] cats= {myCat,Cleo};
	    System.out.println("array is printing");
		cats[0].getInfo();
		cats[0].Drink();

	}

}
