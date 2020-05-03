package Ass01_CybertekAssighments;

public class GasReceipt {

	public static void main(String[] args) {
		double gallons=10.870;
		double price=2.089;
		double total=gallons*price;
		
		
		System.out.println("\tMCLEAN STORE");
		System.out.println("2019-06-19\t"+"04 :38pm");
		System.out.println("Gallons:\t"+ gallons +"\nPrice/gallon:"+ 
		                    " $ "+ price+ "\n");
        System.out.printf("Fuel total:   $%, .2f ",total );
	}

}
