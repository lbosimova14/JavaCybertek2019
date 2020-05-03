package Lesson24_WarmUpAbstractions;

public class Dog extends Animal {
	//parents constructor must call in sub class,first create Dog constracter matching to class name,then call super class constucter
	
	public Dog(char gender,int age,String color,String Nickname) {
		super(gender,age,color,Nickname); 
		
	}
	//my dog class still giving me compile error even after created constructor,now I need to override abstract method
	//without writing abstract keyword,by doing this:changing the functionality,implementations
	@Override
	public void Speak() {
		System.out.println(Nickname+" speaks woow-woow");
	}
	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+ " sleeps "+hour+" hours");
	}
	@Override
	public void Eat(String food) {
		System.out.println(Nickname+" eats "+food+" food");
	}
	@Override
	public void Drink() {
		System.out.println(Nickname+ " drinks water ");
	}

	
	//in this class has invisiable getInfo method,and 4  data/attributes (also inheriting) compile autometicaly when
	//we create object
}
