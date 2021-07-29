package labEX1;

/**
 *
 * @author HazemAlnabawy
 */

public class County {
    private String country;
    private String countryID;

    public County(String country, String iso) {
        this.country = country;
        this.countryID = iso;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIso() {
        return countryID;
    }

    public void setIso(String iso) {
        this.countryID = iso;
    }

    @Override
    public String toString() {
        return country ;
    }
}
