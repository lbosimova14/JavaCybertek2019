package Ass05_AbstructionAssignment;
  /*           
         abstract class: Countries
                    Data: name, flag, language, population, religion, rivals, capital city  
                   constructor that can set all those data            
                Actions (abstract):  exports(parameter),  import(prameter),
                                        economy(), currency()..                                                                     
            sub class: 
                    South Korea
                    USA
                    Kazakhistan
                    New Zealand
                    Mother Russia
                    Turkey
                    ....
                                    
         abstract method, inheritance, abstract class, method overriding .. 
   */
public abstract class Countries {
	
	protected String countryName;
	protected String flag;
	protected String language;
	public double population;
	protected String religion;
	protected String capital;
	
	//Constructor is not used for creating object,also used to initialize the data members of a class
	public Countries(String countryName, String flag, String language, double population, String religion,
			String capital) {
		super();
		this.countryName = countryName;
		this.flag = flag;
		this.language = language;
		this.population = population;
		this.religion = religion;
		this.capital = capital;
	}
	
	public abstract String Industries();
	public abstract void TypeOfGoverment(String govermentType);
	public abstract void Geography();
	public abstract void Climate();
	
	//set up info
	public String toString() {
		String str;
		str="Country name: "+countryName+"\nFlag: "+flag+"\nLanguage: "+language
				+"\nPopulation: "+population+"\nReligion: "+religion+"\nCapital of Country: "+capital;
		return str;
	}

}
