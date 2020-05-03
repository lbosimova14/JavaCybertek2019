package Lesson17_initializer_block;
//static block qachon kerakki, agar main methodda biron nima print qilmoqchi bulsang and hohlamasang sout yozishni
//static block create qilda sout yoz, without calling or writing anything else uzi print qiladi.
//what we actual use:not only printing,also read(pass) value from static variables
//constractor can do it but only work with instance 
import java.util.ArrayList;
import java.util.Arrays;
//this method makes your code more organized
public class staticBlockPractice {
	//static variable
	public static String name; //"suna" ==> "Erhan"
	//declare array
	public static int[] arr1;
	public static ArrayList<String> list =new ArrayList<>();
	public static ArrayList<String> students=new ArrayList<>();
	public static String [] online= {"Arigil","Me","Spike","savas","Baha"};
	public static String [] inclass= {"igil","je","ike","avas","aha"};
	static double a=2;
	//intstance variable
	public int grade;  //must have object instances, you cannot call in main method, becouse no object, so static only accessept static
	//only call way is through object obj(grade)
	
	//create static block
	static {
	name="Erhan";
	 arr1=new int [3];	//{0,0,0}
	   arr1[1]=2;
	   list.add("Break");
	   students.addAll(Arrays.asList(online));//students ArrayListga online Arrayni solayapti
	  //ArrayList                    Array
	   a=78;
	}
	
	//second static block
		static {
			name="Suna";
			arr1=new int [5];	//{0,0,0,0,0}
			arr1[0]=1;
			arr1[2]=3;
			list.add("Coffee");
			list.add("Tea");
			
			students.addAll(Arrays.asList(inclass));
	//  ArrayList       //printing in order  Array
			a=90;
			
			
			}
	

	//constructor
			public staticBlockPractice() {//"suna"==>"mahmud"
			   name="Mahmud";
			  grade=100;
				
			}
	
     public static void main(String[] args) {
    	 
		staticBlockPractice obj1 = new staticBlockPractice();
		System.out.println(obj1.name);
		System.out.println(obj1.grade);
		System.out.println(name);//bunday chaqirsa ham buladi
		
		System.out.println(Arrays.toString((arr1)));
		System.out.println(list);//arrayList bn print qilayapti
		System.out.println(students);//tushinmadim,ikkita static arrayList qushilib print qilayapti
		a=55;
		System.out.println(a);
	}
}
//remember: there is no object instances in any static,so therefor static does not accept non static