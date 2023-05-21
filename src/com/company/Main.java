package com.company;

import au.com.bytecode.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String csvFile = "/app/database/data.csv"; // Replace with the actual path to your CSV file
        List<Student> students = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                String name = line[0];
                int id = Integer.parseInt(line[1]);
                ArrayList<String> courses =  new ArrayList<>(Arrays.asList(line[2].split(",")));
                students.add(new Student(name, id, courses));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create an instance of the StatisticsComponent
        StatisticsComponent statisticsComponent = new StatisticsComponent(students);

        // Display the statistics
        statisticsComponent.displayStatistics();
        File directory = new File("/app/data/batch/");
        File[] fileList = directory.listFiles();
        int numBatchFiles=0 ;
        int numVerifiedFiles=0;
        for (File file : fileList) {
            numBatchFiles++;
            if (file.isFile() && file.getName().contains("_verified.csv")) {
                numVerifiedFiles++;
            }
        }
        System.out.println("Number of batch files: " +numBatchFiles);
        System.out.println("Number of verified batch files: "+ numVerifiedFiles);
    }
}
