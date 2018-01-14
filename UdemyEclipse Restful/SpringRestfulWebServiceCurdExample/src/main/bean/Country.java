
public class Country {
	int id;
	String countryName;
	long population;

	public Country() {super();}
	public Country(int i,String countryName,long population){
		super();
		this.id =i;
		this.countryName = countryName;
		this.population=population;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public long getPopulation() {
		return population;
	}
	
	
}
