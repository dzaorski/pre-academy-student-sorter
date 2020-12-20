package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderCSV {
    private ArrayList<String[]> data = new ArrayList<>();
    BufferedReader bufferReader = null;

    public ArrayList<String[]> readCSV(String csvFile) {
        try {
            bufferReader = new BufferedReader(new FileReader("src/main/resources/" + csvFile + ".csv"));
            String row;
            while ((row = bufferReader.readLine()) != null) {
                String [] rows = row.split(",");
                data.add(rows);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Wrong input");
        } finally {
            if (bufferReader != null) {
                try {
                    bufferReader.close();
                } catch (IOException e) {
                    System.err.println("Wrong input");
                }
            }
        }
        return data;
    }
}
