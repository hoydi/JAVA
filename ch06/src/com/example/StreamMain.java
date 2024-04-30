package com.example;

import java.io.*;
import java.util.Scanner;

public class StreamMain {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/JAVA/out1.txt");
        for(int i=0;i<11;i++){
            fw.write(i+"번째 줄입니다"+"\n");

        }
        fw.close();
        PrintWriter pw = new PrintWriter("c:/JAVA/out2.txt");
        for (int i=0;i<11;i++){
            String data = i+"번째 줄입니다";
            pw.println(data);
        }
        pw.close();

        FileWriter fw2 = new FileWriter("c:/JAVA/out2.txt",true);
        for (int i=11;i<21;i++){
            fw2.write(i+"번째 줄입니다.\n");

        }
        fw2.close();
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/JAVA/out1.txt",true));
        for (int i=11;i<21;i++){
            pw2.println(i+"번째 줄입니다.");
        }
        pw2.close();

        BufferedReader br = new BufferedReader(new FileReader("c:/JAVA/out1.txt"));
        while(true){
            String line = br.readLine();
            if(line == null){ break;}
            System.out.println(line);
        }




    }
}
