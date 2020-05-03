package Lesson14_InstanceVariable;

public class CellPhoneTest {

	public static void main(String[] args) {
		//create object to use CellPhone class attribuits
		//call ichida constructor create qilmasdan turib object yasa ham buladi test class ,class da defaut construc
		//bor deb uylaydi
		     CellPhones phone1=new CellPhones();
		     //now gives default value
		     System.out.println(phone1.brand);
		     System.out.println(phone1.color);
		     System.out.println(phone1.model);
		     System.out.println(phone1.price);
		     System.out.println(phone1.screensize);
		     System.out.println("______________________________________________");
		     
				System.out.println(phone1.brand="Samsung");
				System.out.println(phone1.color="black");
				System.out.println(phone1.price=850.0);
				System.out.println(phone1.screensize= 8);
			
			
		     
		 //  this is a for parameters constructor  
		
		     CellPhones phone2=new CellPhones("Motorala", 2,"black", 250.0);
		       phone2.getInfo();
		     CellPhones phone3=new CellPhones("Nokia",20,"Black",99.0); 
		      phone3.getInfo();
		      
		     CellPhones phone4=new CellPhones("Samsung",700,"red",750.0);
		      phone4.getInfo();
		      
		//we can create array object ,yes array support also object
		      CellPhones[] phones= {phone1,phone2,phone3,phone4};
		      System.out.println(phones[2].brand);//[2] index calling nokia
		      phones[2].getInfo();
		
		      
		      //call method:action
		      
		      phone1.call(999999);

	}

}
