package com.austin.Score;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name, int english, int math){
        super(name, english, math);
        this.thesis = thesis;
    }
    public void print(){
        System.out.println(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + thesis);
        if (getAverage() < 60){
            System.out.println("*");
        }else{
            System.out.println("!");
        }
    }
    public int getAverage(){
        return (english + math)/2;
    }
}
