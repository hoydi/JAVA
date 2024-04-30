package com.example.book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/JAVA/sample.txt");
        fw.write("write onece, run anywhere");
        fw.close();
        BufferedReader br = new BufferedReader(new FileReader("c:/JAVA/sample.txt"));
        String line = br.readLine();
        System.out.println(line);
    }
}
