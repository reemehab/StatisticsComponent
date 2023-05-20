package com.company;


import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String csvFile = "D:\\FCAI-CU\\Level4\\secondterm\\Cloud Computing\\Assignments\\test\\data.csv"; // Replace with the actual path to your CSV file
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

        // Print the list of students
        for (Student student : students) {
            System.out.println(student.toString());
        }

        // Create an instance of the StatisticsComponent
        StatisticsComponent statisticsComponent = new StatisticsComponent(students);

        // Display the statistics
        statisticsComponent.displayStatistics();

    }
}
