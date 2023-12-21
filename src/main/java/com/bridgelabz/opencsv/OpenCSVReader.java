package com.bridgelabz.opencsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

// Read CSV file into string array
public class OpenCSVReader {

    public static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\KIIT\\Desktop\\bridgeLabz\\users.csv";

    public static void main(String[] args) throws IOException, CsvException {
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader);

        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null){
            System.out.println("Name: "+ nextRecord[0]);
            System.out.println("Email: "+ nextRecord[1]);
            System.out.println("Phone: "+ nextRecord[2]);
            System.out.println("Country: "+ nextRecord[3]);
            System.out.println("-------------------------");
        }

        // Reading all records at once into a List<String[]>
        List<String[]> records = csvReader.readAll();
        for(String[] record: records){
            System.out.println("Name: "+ record[0]);
            System.out.println("Email: "+ record[1]);
            System.out.println("Phone: "+ record[2]);
            System.out.println("Country: "+ record[3]);
        }
    }
}
