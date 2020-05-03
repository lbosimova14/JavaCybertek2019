package Lesson08_Method_Return;

public class LongestStringValue {

	public static void main(String[] args) {
		//main method
		String []arr= {"Samarqand", "Tashkent","Jizzah","Termez","Bukhoro"};
		String str=LongCityName(arr);
		System.out.println(str);
		//System.out.println(LongCityName(arr));
	

	}
     public static String LongCityName(String[] strArray) {
     String LongCityName="";
     int max=0;
     for(int i=0;i<strArray.length;i++) {
    	 if(strArray[i].length()>max) {
    		 max=strArray[i].length();
    		 LongCityName=strArray[i];
    	 }
     }
     return LongCityName;
}
}