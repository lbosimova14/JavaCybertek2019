package Lesson24_WarmUpAbstractions;

public abstract class Animal {
	//data / attributes:
	// ?? instance variable, belong to object, when i use this in other class I need to create new value in order to use
   //those variable inheritance into the subclasses
   public char gender;
   public int age;
   public String color;
   public String Nickname;
  
   //Contractors:  create constructor set all above values,later on this cons is calling on the sub classes
public Animal(char gender, int age, String color, String Nickname) {
	super();
	this.gender = gender;
	this.age = age;
	this.color = color;
	this.Nickname = Nickname;
}

//actions:those actions common all animals but implimantiosion can be diffirent,create abstract method
 /*decleration of abstract method: Accesses modifier: can be public protected, default
                                return type: void primitives,non-primitives(object)
                                name: can be any name
                                parameter:any data-type
                                */
//in recviremen, not should be return type, just need to print something
public abstract void Speak();
public abstract void Eat(String food);
public abstract void Sleep(int hour);
public abstract void Drink();


//create get info method cut set constracter one by one,it can apply all anymals,one implamantition,no need hide info
//instance method
public void getInfo() {
	System.out.println("getInfo method printing ");
	System.out.println("Name: "+Nickname+"\nAge: "+age+"\nColor: "+color+"\nGender: "+gender);
	System.out.println("===================================================================");
}

}
