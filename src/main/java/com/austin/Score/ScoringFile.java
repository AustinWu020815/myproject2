package com.austin.Score;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoringFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scoring.txt");
            int data = fileReader.read();
            System.out.println(data);
            data = fileReader.read();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR 404");
        } catch (IOException e) {
            System.out.println("ERROR 404");
        }
        System.out.println("Testing");
    }
}
