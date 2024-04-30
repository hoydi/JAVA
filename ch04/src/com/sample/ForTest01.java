package com.sample;

public class ForTest01 {
    public static void main(String[] args) {

        int [] scores = {100,90,80,70,60,50};
        for(int score:scores) {
            if(score >= 60) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }
        }
        for(int i=0;i<scores.length;i++) {
            if(scores[i] >= 60) {
                System.out.println(scores[i]+" pass");
            } else {
                System.out.println(scores[i]+" fail");
            }
        }

    }
}
