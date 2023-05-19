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
                courseCounts.put(course, courseCounts.getOrDefault(course, 0) + 1);
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