package Lesson06_Arrays;

public class LongestNameArray {
//find who has longest name
	public static void main(String[] args) {
	    
		String[]  names = {"Seyfo","Asiya","Myra","kAteryna",
		                    "Daulet", "vladislav zakharovich skorobogotko",
		                "pneumonoultram"};
		System.out.println(names.length);
		        String LongestName ="";
		        int max = 0;
		        for(int i=0; i < names.length; i++) {		            
		           if(names[i].length() > max) {
		                max = names[i].length();
		                LongestName = names[i];		                
		            }
		        }
		        
		        System.out.println(max);//34
		        System.out.println(LongestName);//   pneumonoultramicroscopicsilicovolcanoconiosis

	}

}
