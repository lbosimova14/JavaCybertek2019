package Ass05_AbstructionAssignment;

public class Turkey extends Countries{

	String Ethnicity_race;
	
	
	public Turkey(String countryName, String flag, String language, double population, String religion,
			String capital) {
		super(countryName, flag, language, population, religion, capital);
		
	}

	@Override
	public String Industries() {
		
		return countryName+"  textiles, food processing, autos, electronics, mining"
				+ " (coal, chromite, copper, boron), steel, petroleum, construction, lumber, paper.";

	}

	@Override
	public void TypeOfGoverment(String govermentType) {
		System.out.println(countryName+" goverment type is: "+ govermentType);
		
	}

	@Override
	public void Geography() {
		System.out.println(countryName+"  located both in Western Asia and Southeastern Europe");
		
	}

	@Override
	public void Climate() {
		System.out.println(countryName+" Mediterranean climate, with hot, dry summers and mild to cool, wet winters");
		
	}
    
	@Override
	public String toString() {
		String str;
		//calling abstract toString method as Overrrided by using super. keyword and adding ethnicity
		str=super.toString()+"\nEthnicity-Race: "+Ethnicity_race;
		
		return str;
	}
	
	public void setRace(String race) {
		this.Ethnicity_race=race;
	}

}
