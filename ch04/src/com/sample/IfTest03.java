package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IfTest03 {
    public static void main(String[] args) {
        boolean hascard = true;
        List<String> pocket = new ArrayList<String>();
//        pocket.add("money");
        pocket.add("cellphone");

        if (pocket.contains("money")) {
            System.out.println("택시타고갑니다");
        } else if (hascard) {
            System.out.println("택시타고갑니다");

        } else {
            System.out.println("걸어갑니다");
        }
        int age;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("나이를 입력해주세요.");
            age = sc.nextInt();
            if (age < 0) {
                System.out.println("양수를 입력해주세요.");
            } else break;
        }

        if (age > 70) {
            System.out.println("로맨스 영화 추천");
        } else if (age > 40) {
            System.out.println("코미디 ");
        } else if (age > 20) {
            System.out.println("스릴러");
        } else if (age > 18) {
            System.out.println("청소년");
        } else if (age > 8) {
            System.out.println("애니메이션");
        }

    }
}
