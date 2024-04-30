package com.sample;

import java.util.Arrays;

public class LOttoGenerator {
    public static void main(String[] args) {

        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
        }
        System.out.println(Arrays.toString(lotto));


    }
}
