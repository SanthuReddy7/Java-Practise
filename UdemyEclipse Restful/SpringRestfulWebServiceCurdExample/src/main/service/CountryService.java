
/*	it is just a helper class which should be replaced by database imp-lementation.
	It is not very well return classe, it is just used for demonstration */
	public class CountryService {
		static HashMap<Integer,Country> countryIdMap=getCountryIdMap();
		
		public CountryService(){
			super();
		if(countryIdMap==null){
			countryIdMAp= new HashMap<Integer,Country>();
			//create some objects of country while initializing
			Country indiaCountry = new Country(1,"India",100000);
			Country chinaCountry = new Country(1,"China",200000);
			Country nepalCountry = new Country(1,"Nepal",300000);
			Country butanCountry = new Country(1,"Bhutan",400000);
		
countryIdMap.put(1,indiaCountry);
countryIdMap.put(2,nepalCountry);
countryIdMap.put(3,chinaCountry);
countryIdMap.put(4,butanCountry);

		}
		}
		
		public List<country> getAllCountries()
		{
			List<Country> countries = new ArrayList<Country>(countryIdMap.value());
		return country;
		}
		public country getCountry(int id){
			Country country = countryIdMap.get(id);
			return country;
		}
		public Country addCountry(Country country)
		{
			country.setId(getMaxId()+1);
			counrtyIdMap.put(country.getId(),country);
			return country;
		}
		public Country updateCountry(Country country ){
			if(country.getId()<=0)
				return null;
			countryIdMap.put(country.getId(),country);
			return country;
		}
		public void deleteCountry(int id){
			countryIdMap.remove(id);
		}
		public static HashMap<Integer,Country> getCountryIdMap(){
			return countryIdMap;
		}
		
		//utility method to get max id
		public static int getMaxId(){
			int max=0;
			for(int id:countryIdMap.keySet()){
				if(max<=id)
					max=id;
			}
			return max;
		}

}
