package Lesson24_WarmUpAbstractions;

public class Cow extends Animal{
//why I need constructer bc,later on to use as obj, and pass my name=Miov,age=3,color=red,gender=male
	//when i create object i need to use age,color,name....
	public Cow(char gender, int age, String color, String Nickname) {
		super(gender, age, color, Nickname);
		
	}

	@Override
	public void Speak() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Eat(String food) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sleep(int  hours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Drink() {
		// TODO Auto-generated method stub
		
	}

}
