package Lesson11_WrapperClasses;

public class ParseMethod {

	public static void main(String[] args) {
	    // parse methods: converts String values to primitives, returns primitive values
        
        // parseInt("strValue"): takes the String and converts the string to int primitive
        
        Integer num1 = Integer.parseInt("123");   // auto-boxing
        System.out.println( num1 + 1 );
        
        int num2 = Integer.parseInt("125");  // none
        System.out.println( num2+1 );
        
        
// parseByte("strValue"): take the string and converts the string value to byte
        
        //  byte num3 = Byte.parseByte("198");  // out of range
        
            byte num3 = Byte.parseByte("18");  // none
            System.out.println(num3 + 1); 
            
            Byte num4 = Byte.parseByte("18");  // auto-boxing
            System.out.println( num4 + 1 );
            


// parseShort("strValue"): takes the string and convrts it to short primitive value
        
            short num5 = Short.parseShort("200");
            System.out.println( num5+1 );
            
            Short num6 = Short.parseShort("200");  // auto-boxing
            System.out.println( num6+1 );
        
        
// parseLong("strValue"): takes string value and converts to long primitive
            
        int num7 =  (int)Long.parseLong("1222"); 
        long num8  = Long.parseLong("1222"); 
        System.out.println( num7 );
        System.out.println( num8 );
        

//parseFloat("StrValue"): takes string value and converts it to float primitive
        
        float num9 = Float.parseFloat("12.5"); // none
        System.out.println(num9 + 1 );
        
        Float num10 = Float.parseFloat("12.5f");   // Auto-boxing
        System.out.println( num10 +1 );
        

// parseDouble("StrValue"): takes string value and converts it to double primitive
        
          float num11 = (int)Double.parseDouble("8.5");  // none
          System.out.println(num11);
          
        double num12 = Double.parseDouble("8.5");
        System.out.println( num12 );
        
        Double num13 = Double.parseDouble("8.5");  // auto-boxing
        System.out.println(num12);
            
            
// parseBoolean("StrValue"): takes string value and converts to boolean primitive
        
        String bl="laylo";
        boolean b=Boolean.parseBoolean(bl);
        System.out.println(b); //false  default value berayapti
        Boolean B=Boolean.parseBoolean(bl);
        System.out.println(B);//false
  
        //REVIEW:      
   //   I have string example "12345"; how I am gona convert to int raqamlarga, textni raqamga aylantirshda parse method ishlatiladi
  	  short s1=Short.parseShort("1233") ;
  	  System.out.println(s1);
// now text convert buldimi yuqmi bilish uchun textga bironta raqam qushib kurihs kk,do some math
  	  double d=Double.parseDouble("78.5");//none textdan primitivge aylandi,primitiv+primitive none oxing buladi
  	  Double d1=Double.parseDouble("78.5"); //now it is auto boxing bulayapti,
 // wrapper class   now primitivga aylandi:  primitive/raqam wrapper classga assinging qilayaptiva auto boxing bulayapti		  
     }

	}


