package com.bridgelabz.opencsv;

import com.bridgelabz.opencsv.CSVUser;
import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVWriter {
    private static final String SAMPLE_CSV_FILE = "C:\\Users\\KIIT\\Desktop\\bridgeLabz\\users.csv";

    public static void main(String[] args) throws IOException {
            try(
                    Writer writer = Files.newBufferedWriter(Paths.get(SAMPLE_CSV_FILE));
                    ){
                StatefulBeanToCsv<CSVUser> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                        .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                        .build();

                List<CSVUser> usersList = new ArrayList<>();
                usersList.add(new CSVUser("Sundar Pichai", "sundar.pichai@gmail.com", "+1-111111", "United States"));
                usersList.add(new CSVUser("Satya Nadella", "satya.nadela@outlook.com", "+1-111111", "United States"));
            }
    }
}

