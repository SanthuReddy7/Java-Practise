import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

	CountryService countryservice = new CountryService();

	@RequestMapping(value = "/countries", method = RequestMeth.GET, headers = "Accept=application/json")
	public List<Country> getCountries() {
		List<Country> listOfCountries = countryservice.getAllCountries();
		return listOfCountries;
	}

	@RequestMapping(value = "/countries/{id}", method = RequestMeth.GET, headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		return countryservice.getCountry(id);
	}

	@RequestMapping(value = "/countries", method = RequestMeth.GET, headers = "Accept=application/json")
	public Country addCountry(@RequestBody Country country) {
		return countryservice.addCountry(country);
	}

	@RequestMapping(value="/countries",method=RequestMeth.PUT,headers="Accept=application/json")
    public Country updateCountry(@RequestBody Country country)
         return  counrtyservice.updateCountry(country);
}

	@RequestMapping(value="/countries/{id}",method=RequestMeth.DELETE,headers="Accept=application/json")
	public Country updateCountry(@PathVariable int id)
		return  countryservice.deleteCountry(id);
}
