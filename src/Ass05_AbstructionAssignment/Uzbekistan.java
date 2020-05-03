package Ass05_AbstructionAssignment;

public class Uzbekistan extends Countries {
    private  final String Top_Export="Cotton";
    private final String Top_Import="Vehile parts";
    
	//constructor
	public Uzbekistan(String countryName, String flag, String language, double population, String religion,
			String capital) {
		super(countryName, flag, language, population, religion, capital);
		
	}

	@Override //adding some functionality to Industries abstract method
	public String Industries() {
		String ExportAndImport;
		 
		ExportAndImport=countryName+" industries are textiles,food processing,machine building\nTop export is:"
		                +Top_Export+"\nTop import is: "+Top_Import;
		return ExportAndImport;
	}

	@Override
	public void TypeOfGoverment(String GovermentType) {
	   System.out.println(countryName+" goverment type is: "+ GovermentType);
		
	}

	@Override
	public void Geography() {
		System.out.println(countryName+" situated in Central Asia");
		
	}

	@Override
	public void Climate() {
		System.out.println(countryName+" climate is continental with hot summer and cool winter");
		
	}
	//regular method
	public  void News() {
		System.out.println(countryName+" Current event is: A Rocky Relationship with the United States");
	}

}
