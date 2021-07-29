package labEX1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HazemAlnabawy
 */

public class ReadCSV {
    Scanner scFile;
    public void readFile(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        scFile = new Scanner(myFile);
    }


    public List<City> readCitiesCSV(String fileName) throws FileNotFoundException {
        ArrayList<City> rowData = new ArrayList<>();
        readFile(fileName);
        String data;
        boolean isFirstLine = true ;
        while (scFile.hasNextLine()) {
            data = scFile.nextLine();
            if(isFirstLine)
                isFirstLine = false;
            else
                rowData.add(createCities(data));
        }
        scFile.close();
        return rowData;
    }


    public City createCities (String inputStr){
        String[] metaData = inputStr.split(",",-1);
        if (metaData[9].equals(""))metaData[9]="0";
        int pop ;
        try {
            pop = Integer.parseInt(metaData[9]);

        }
        catch (Exception e){
            pop = 0 ;
        }
        City line = new City(metaData[6], metaData[4], metaData[1],pop);
        return line ;

    }

    public List<County> readCountriesCSV(String fileName) throws FileNotFoundException {
        ArrayList<County> rowData = new ArrayList<>();
        readFile(fileName);
        String data;
        boolean isFirstLine = true ;
        while (scFile.hasNextLine()) {
            data = scFile.nextLine();
            if(isFirstLine)
                isFirstLine = false;
            else
                rowData.add(createCountries(data));
        }
        scFile.close();
        return rowData;
    }


    public County createCountries (String inputStr) throws NumberFormatException{
        String[] metaData = inputStr.split(",",-1);
        County line  = new County(metaData[1], metaData[0]);
        return line ;

    }

}
