package com.austin;

public class ScoringS {
    public static void main(String[] args) {
        Student derek = new Student();
        derek.name = "Derek";
        derek.english = 100;
        derek.math = 55;
        Student hugh = new Student("Hugh", 87, 69);
        derek.print();
        hugh.print();
    }
}
