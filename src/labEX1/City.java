package labEX1;

/**
 *
 * @author HazemAlnabawy
 */

public class City implements Comparable<City>{

    private String countryID;
    private String country;
    private String city;
    private int population ;

    public City(String countryID, String country, String city, int population) {
        this.country = country;
        this.city = city;
        this.countryID = countryID;
        this.population = population;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int compareTo(City o) {
        return Integer.valueOf(this.getPopulation()).compareTo(o.getPopulation());
    }
}
