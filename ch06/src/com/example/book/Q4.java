package com.example.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new FileWriter("c:/JAVA/sample1.txt"));
        System.out.println("한 문장을 입력하세요");
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            pw.write(line);
            pw.write("\n");
            //끝낼땐 ctrl+D
        }
        System.out.println("입력이 완료되었습니다");
        pw.close();
    }
}
