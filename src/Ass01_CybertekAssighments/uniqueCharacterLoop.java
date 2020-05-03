package Ass01_CybertekAssighments;

public class uniqueCharacterLoop {

	public static void main(String[] args) {
/*
write a program that can find the unique characters from the String
Ex:
str ="AAABBBCCCDEF";
output: "DEF
*/
//Muhtar Way
	      
              String Str ="ALL THE LETTERS";
               String Unique ="";  //to store all the unique  chars from Str
               
               
       for(int j = 0 ; j < Str.length(); j++) { //open{ close at  very end
           
               int count =0; //count how many times tha chracter is appeared
               //loop check all index
               
               for(int i = 0; i < Str.length(); i++) {//highest value of i: is  Str.length()-1
                   if(Str.substring(i, i+1).equals( ""+Str.charAt(j) )) 
                                                  // or .equals(str.sunstring(j,j+1)){{
                       count++;//now how do I now A is unique
                   }
                   
                   if(count == 1) {//
                   Unique+=""+Str.charAt(j); //Unique+="A";
               }
               //you dont have to couunt every char one by one, shuning uchun use another for loop j loop
       }
               System.out.println("Unique characters are: "+Unique);
               
              
/* with while loop
  
        String word = scan.nextLine();
        String result = "";
        while (word.length()!=0) {
        String word1 = word.replaceFirst(word.substring(0,1), "");
        
            if (!word1.contains(word.substring(0,1))) {
                result += word.substring(0,1); 
                }
            word= word.replace(word.substring(0,1), "");
            
            }
        
        System.out.println(result);
 */
	}
}