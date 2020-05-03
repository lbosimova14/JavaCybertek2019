package Lesson05_Loops;

import java.util.Scanner;

public class EvenNumberWhileLoopForLoop {

	public static void main(String[] args) { 
        /*
         use while loop to print all even number between 1-100         
         */       
        for(int z=1; z <= 100; z++) {
            if(z%2==0) {
                System.out.print(z+" "); //"" Separating line
            }
        }
        
        System.out.println();
        /*
          converting for loop to while loop:
                Initialization;
                    while(condition){
                        statements;
                        iterator;
                    }
         */
        
            int x = 1;
            while(x <= 100) {
                if(x%2==0) {
                    System.out.print(x+" ");
                }               
                x++;
            }
        
            System.out.println();
            
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Enter Starting number");
        int start = scan.nextInt(); // 10
        
        System.out.println(" Enter ending number");
        int end = scan.nextInt();  // 100
    
        
        for(int j = start ;  j <= end ; j++ ) {
            if(j %2 == 0 ) {
                System.out.print(j+" ");
            }
        }
            
        
        int j = start;
        while(j <= end) {
            if(j %2 == 0 ) {
                System.out.print(j+" ");
            }
            j++ ;
        }

	}

}
