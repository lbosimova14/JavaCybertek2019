package Lesson10_ArrayListClass;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Example {
	public static void main(String[] args) {
		String str="aaabbbdddsssc";	
		System.out.println(removeDup(str));
	}
public static String removeDup(String str) {
		
		str=new LinkedHashSet<String> (Arrays.asList(str.split(""))).toString();
		str=str.replace(",", "").replace("[", "").replace("[", "");
		return str;
}

}
