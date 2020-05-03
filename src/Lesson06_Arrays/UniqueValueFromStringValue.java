package Lesson06_Arrays;

public class UniqueValueFromStringValue {

	public static void main(String[] args) {
     String []arr={"Alli","Bobo","Bobo","Alli","Cali","Alli","Dada"};
     
    /* //how many time A is appered in the array
        //I need compare each index 
     int count=0;
     
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i].equals("A")){//because of string use equal, not == sign.//becouse of string use equal, not == sign.  Every time you need change index, yani 
    		                    // "B". keyin "C" qushish kk, shundan avoid bulish uchun we need another loop, repat again again
    		                     //outter loop repates innir loop 7 times.
    		 count++;
    	 } 
     }
     System.out.println(count); //3  */
   
		
		  for(int j=0; j<arr.length;j++){  
          int count=0;
     
          for(int i=0;i<arr.length;i++) {
    	     if(arr[i].equals(arr[j])){
    		 count++;
    	 } 
     }
           if(count==1) {
	         System.out.println(arr[j]);
   }
    
   }
	}

}
