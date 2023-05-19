package com.company;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int id;
    private List<String> courses;

    public Student(String name, int id, String... courses) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
        for (String course : courses) {
            this.courses.add(course);
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getCourses() {
        return courses;
    }
}