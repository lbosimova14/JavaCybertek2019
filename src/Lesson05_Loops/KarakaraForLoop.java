package Lesson05_Loops;

public class KarakaraForLoop {
	//using multiple statement in initialization and update expressions

	public static void main(String[] args) {
		//loop's innitialization expression
		for(int number=1,karakara=3; number<=10;number++) {
			
			System.out.println(karakara+" x "+number+" = "+(number*karakara));
	}
		//modify the loop exucuting two statement in update expression
		System.out.println("\n");
	for(int number=1,darajasi=1; number<=10;number++,darajasi++) {
			
			System.out.println(darajasi+" x "+number+" = "+(number*darajasi));}
	 //in test expretionda dont use comma, use && || operatost instead
}
}/*
3 x 1 = 3                           
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30*/

/*
1 x 1 = 1
2 x 2 = 4
3 x 3 = 9
4 x 4 = 16
5 x 5 = 25
6 x 6 = 36
7 x 7 = 49
8 x 8 = 64
9 x 9 = 81
10 x 10 = 100*/
