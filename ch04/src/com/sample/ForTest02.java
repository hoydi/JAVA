package com.sample;

public class ForTest02 {
    public static void main(String[] args) {

        int i = 0;
        while (true){
            i+=1;
            if(i>5){
                break;
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
