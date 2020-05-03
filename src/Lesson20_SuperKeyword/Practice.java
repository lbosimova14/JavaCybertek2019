package Lesson20_SuperKeyword;
class parent{
	public parent(int a) {//C A
		//calleng current constructor by using this keyword
		this("A");//C
		System.out.println("A");//A
	}
	public parent(String b) {
		System.out.println("C");
	}
}





public class Practice extends parent{
//           sub class       superclass
	
	/*default constructor has it here like gost
	 * public Practice(){
	 * super();  }
	 */
	//call paramitrized cons
	public  Practice() {
		super(10);//C A
//Error	this("A"); one constructor calls one constructor
	}
	
	//another constructor: this need call super class constr
	public  Practice(int a) {
		super("A");
	}
	
	public static void main(String[] args) {
		 Practice obj =new  Practice();
	}
}
