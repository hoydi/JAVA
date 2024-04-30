package com.sample;

public class IfTest01 {
    public static void main(String[] args) {


        int a = 5- (int)(Math.random()*10);
        System.out.println(a);
        if(a>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }

    }
}
