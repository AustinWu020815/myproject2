package com.austin;

public class ScoringS {
    public static void main(String[] args) {
        Student derek = new Student("Derek", 100, 55);
        /*
        derek.name = "Derek";
        derek.english = 100;
        derek.math = 55;
        */
        Student hugh = new Student("Hugh", 87, 69);
        Student s = new Student();
        GraduateStudent jane = new GraduateStudent("Jane", 94, 85);
        derek.print();
        hugh.print();
        s.print();
        jane.print();
    }
}
