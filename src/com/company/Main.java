package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Assuming you have a list of students already populated
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ahmed", 1, "Math", "AI"));
        students.add(new Student("Mohamed", 2, "AI", "Prolog"));

        // Create an instance of the StatisticsComponent
        StatisticsComponent statisticsComponent = new StatisticsComponent(students);

        // Display the statistics
        statisticsComponent.displayStatistics();

    }
}
