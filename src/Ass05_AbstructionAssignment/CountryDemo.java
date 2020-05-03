package Ass05_AbstructionAssignment;

public class CountryDemo {

	public static void main(String[] args) {
		Uzbekistan myUzbekistan =new Uzbekistan("Uzbekistan", "Blue White Green", "Uzbek", 33_152_749.0, "Islam", "Tashkent");
		System.out.println(myUzbekistan);//toString method is calling by obj automatically
		System.out.println(myUzbekistan.Industries());
		myUzbekistan.TypeOfGoverment("Republic");//Parameterized abstract method
		myUzbekistan.Geography();
		myUzbekistan.Climate();
		myUzbekistan.News();//regular method
		
		System.out.println();
		
		
		Turkey myTurkey =new Turkey("Turkey", "Red", "Turkish", 83_429_615, "Islam", "Ankara");
		myTurkey.setRace("Turkish");//setting race to toString method
		System.out.println(myTurkey);//toString method is calling
		System.out.println(myTurkey.Industries());
		myTurkey.TypeOfGoverment("Republican Parliamentary Democracy");
		myTurkey.Geography();
		myTurkey.Climate();
		
		
		
	}

}
