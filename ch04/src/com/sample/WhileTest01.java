package com.sample;

public class WhileTest01 {
    public static void main(String[] args) {
        int i = 1;
        int j= 5;
        while(i<=j){
            System.out.println(i);
            i++;
        }

        do{
            i= 7-i;
            System.out.println(i);
            i--;
        }while(i<=j);


        int i2=0;
        while(true){
            i2++;
            if(i2>10){
                break;
            }
            if(i2%2==0){
                continue;
            }
            System.out.println(i2);
        }
    }
}
