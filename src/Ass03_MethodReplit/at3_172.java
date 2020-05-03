package Ass03_MethodReplit;

public class at3_172 {

	public static void main(String[] args) {
		String str=at3("longword","foo");
		System.out.println(str);

	}
	 public static String at3(String target,String word) {
		   String s1a = target.substring(0,3);//long (first half)
			String s1b = target.substring(3);//word (second half)
			//System.out.println(s1a);
			//System.out.println(s1b);
			String join=(s1a.concat(word)+s1b);
			return join;
	 }
}

/*at3 gets two strings and returns a string.
the first string is the one that will be manipulated. at the 3rd char position of target you will insert the word argument.
example use:
at3("longword","foo")
will return: "lonfoogword"
at3("blabla","a")
will return: "blaabla"*/

/*
yuqoridagi masalani qanday qilib topgan yulim: this is example
String s="cybertek";
String x="bla";
int mid = s.length()/2; //Calculate the mid position
System.out.println(mid);//4 returns int

String s1c=""+ s.length()/2;// returns String 
//lengthni uzini aniqlamoqchi bulsa int suraydi, shuning uchun "" mark berib stringga aylantir
System.out.println("s1c "+s1c); //4. faqat length ni aniqlab beradi, suzlarni yozmaydi

String s1a = s.substring(0, (s.length()/2));//cybe. substring method devide qilinayotgan suzlarni yozadi
String s1b = s.substring((s.length()/2));//trek
System.out.println(s1a);//cybe
System.out.println(s1b);//trek
System.out.println(s1a.concat(x)+s1b);//*/