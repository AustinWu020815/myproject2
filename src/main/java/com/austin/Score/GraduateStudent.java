package com.austin.Score;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name, int english, int math){
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        System.out.println(name + "\t" + english + "\t" +
                math + "\t" + getAverage() +
                "\t" + thesis);
    }
}
