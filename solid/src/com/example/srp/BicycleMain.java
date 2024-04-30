package com.example.srp;

class Bicycle {
    //주행기능에대한책임을가지는메서드
    //자전거수리하는기능은수리원이책임을지는메서드이다.
    public void ride(){
        System.out.println("자전거가 주행합니다");
    }

    
}

public class BicycleMain{
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle();
        b1.ride();
    }
}