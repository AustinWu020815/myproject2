package com.austin;

public class Student {
        String name;
        int english;
        int math;
        public Student(String name){
                this.name = name;
        }
        public Student(String name, int english, int math){
                this(name);

        //                this.name = name;
                this.english = english;
                this.math = math;
        }
        public Student(){
                this("John Doe", -1, -1);
                /*
                name = "John Doe";
                english = -1;
                math = -1;
                */
        }
        public void print(){
                System.out.print(name + "\t" + english + "\t" + math);
                int getAverage(){
                        return (english + math)/2;
                }
                if (getAverage() < 60){
                        System.out.print("*");
                }
                        System.out.println();

        }

}
