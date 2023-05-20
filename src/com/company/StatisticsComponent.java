package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsComponent {
    private List<Student> students;

    public StatisticsComponent(List<Student> students) {
        this.students = students;
    }

    public int getTotalUsers() {
        return students.size();
    }

    public Map<String, Integer> getCourseCounts() {
        Map<String, Integer> courseCounts = new HashMap<>();
        for (Student student : students) {
            for (String course : student.getCourses()) {
                if (courseCounts.containsKey(course)) {
                    courseCounts.put(course, courseCounts.get(course) + 1);
                } else {
                    courseCounts.put(course, 1);
                }
            }
        }
        return courseCounts;
    }

    public void displayStatistics() {
        int totalUsers = getTotalUsers();
        Map<String, Integer> courseCounts = getCourseCounts();
        System.out.println("Number of users: " + totalUsers);
        for (String course : courseCounts.keySet()) {
            int count = courseCounts.get(course);
            System.out.println("Number of students registered in " + course + " course: " + count);
        }
    }
}
