package com.company;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id, ArrayList<String> courses) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
        for (int i=0 ; i< courses.size() ; i++) {
            this.courses.add(courses.get(i));
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", courses=" + courses +
                '}';
    }

    public List<String> getCourses() {
        return courses;
    }
}