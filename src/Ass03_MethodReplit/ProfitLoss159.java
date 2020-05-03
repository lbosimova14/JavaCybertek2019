package Ass03_MethodReplit;

public class ProfitLoss159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String x=c_profits(100,100);
      System.out.println(x);
	}
      public static String c_profits (int buyPrice,int sellPrice) {
	 
    	  if(buyPrice==100 && sellPrice==100) {
			 return "no loss";
    	  } else  if(buyPrice>100 && sellPrice>100) {
		            return "profit";	  
	        }else{
			      return "loss";
	         }
	  
      }
	 
}
      

/*c_profits gets the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.
it returns a string value that can be "profit","loss","no loss"
for example:
c_profis(100,1500)
returns : "profit"
c_profis(20,5)
returns : "loss"
c_profis(100,100)
returns : "no loss"*/