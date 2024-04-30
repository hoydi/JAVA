package com.example.book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Q5 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("c:/JAVA/sample5.txt"));
        while(true){
            String line = br.readLine();
            if(line == null) break;
            data.add(line);
        }
        br.close();

        String text = String.join("\n", data);
        text = text.replaceAll("python", "java");
        FileWriter fw = new FileWriter("c:/JAVA/sample5.txt");
        fw.write(text);
        fw.close();
        System.out.println("파일수정완료");
    }
}
