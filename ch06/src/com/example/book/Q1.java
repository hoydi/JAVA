package com.example.book;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째숫자를입력하세요");
        int first = sc.nextInt();
        System.out.println("두번째숫자를입력하세요");
        int second = sc.nextInt();

        int result = first + second;
        System.out.printf("%d + %d = %d", first, second, result);

    }
}
