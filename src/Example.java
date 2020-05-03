import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
class A{
	public void test() {
		System.out.println("A");
	}
}
class B extends A{
	public void test() {
		System.out.println("B");
	}
}
class C extends A{
	public void test() {
		System.out.println("C");
	}
}

 public class Example {
public static void main(String[] args) {

A b1=new A();
A b2=new C();
b1=(A)b2;

A b3=(B)b2;
A b4=(B)b2;
b1.test();
b3.test();


	 }
 }
	 
	 
	 
	 
 
 
 
	



	
	
	



	
	 			

				

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	

	
	






		
	