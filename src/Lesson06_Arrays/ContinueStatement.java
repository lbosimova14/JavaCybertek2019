package Lesson06_Arrays;

public class ContinueStatement {

	public static void main(String[] args) {
		
        for(int i=0; i < 5; i++) {
            if(i > 2) {
                continue;
            }  
            System.out.print(i+" ");//0 1 2
        }        
        System.out.println();
      
        int[] numers = {1,2,3,4,5};
        for(int i =0; i < numers.length; i++) {

            if(numers[i] < 3) {//3 dan keyingi raqamlar print qilinadi
                continue;
            }
            System.out.print(numers[i] +" ");//3 4 5

            /*
            if(numers[i] < 3) {
                continue;
            }       
            */           
            }
	}

}

