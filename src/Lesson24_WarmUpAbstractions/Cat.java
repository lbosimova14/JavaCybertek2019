package Lesson24_WarmUpAbstractions;

public class Cat extends Animal {
	
	//Contractor cannot be override ,because contractor must to be same as class name,but abstact class is extending to sub class
	//that is why any super class contractor to needs to be call
	//
	public Cat(char gender, int age, String color, String Nickname) {//all argument are inheriting from absract/super class
		super(gender,  age,  color,  Nickname);//call constructor using super keyword,and pass local arguments
	}
	
	
	@Override
	public void Speak() {
		System.out.println(Nickname+" speaks miow ");
	}
	public void Eat(String food) {
		System.out.println(Nickname+" eats "+food);
	}
	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+"  sleeps "+hour+" hours");
	}
	public void Drink() {
		System.out.println(Nickname+" drinks chocolote milk");
	}

}
