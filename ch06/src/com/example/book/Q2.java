package com.example.book;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            if ("END".equals(line)) break;
            System.out.println(line.toUpperCase());

        }
    }
}
