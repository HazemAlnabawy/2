package labEX1;

import java.io.FileNotFoundException;
import java.util.*;

public class LabEx1 {
    public static void main(String[] args) throws FileNotFoundException {
        ReadCSV readCSV = new ReadCSV();
        List<City> cities = readCSV.readCitiesCSV("C:\\Users\\hazem\\OneDrive\\Desktop\\Java\\assignment\\2\\cities.csv");
        List<County> counties = readCSV.readCountriesCSV("C:\\Users\\hazem\\OneDrive\\Desktop\\Java\\assignment\\2\\countries.csv");

        Collections.sort(cities,Collections.reverseOrder());
        Map <String,List> M = new HashMap<>();
        for (City c:cities ) {
           try {
               M.get(c.getCountryID()).add(c.getCity());
           }
           catch (Exception e) {
               List cityList = new ArrayList<>();
               cityList.add(c.getCity());
               M.put(c.getCountryID(), cityList);
           }
        }

        M.forEach((k, v) ->
                System.out.println("key=" + k + ", value=" + v));
    }

}
