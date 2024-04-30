package com.sample;

import java.util.Scanner;

public class SwitchTest01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("국어성적입력");
        int korscore = sc.nextInt();

        if (korscore >= 0 && korscore <= 100) {
            switch (korscore) {
                case 10:
                    case 9:
                        System.out.println("A");
                        break;
                default:
                    System.out.println("아무거나보세요");
            }
        }
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("3+4="+3+4);
                break;
            case '-':
                System.out.println("3-4="+(3-4));
                break;
            case '*':
                System.out.println("3*="+3*4);
                break;
            case '/':
                System.out.println("3/4="+3/4);
                break;
            default:
                System.out.println("유효한연산자가아닙니다.");

        }

    }
}
