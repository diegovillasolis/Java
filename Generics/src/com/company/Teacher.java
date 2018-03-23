package com.company;

import com.company.school.Person;

public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void showDetails() {
        super.getHashCode();
    }
}
