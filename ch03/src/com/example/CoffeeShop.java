package com.example;

import java.util.HashMap;

enum CoffeeMenu{
    AMERICANO,
    ICE_AMERICANO,
    CAFE_LATTE
}

public class CoffeeShop {


    private static int[] coffeeSales = new int[CoffeeMenu.values().length];
    public static void sellCoffee(CoffeeMenu coffee){
        coffeeSales[coffee.ordinal()]++;
    }

    public static void main(String[] args) {
        //q10
        HashMap<CoffeeMenu, Integer> coffeeSalesHashMap = new HashMap<>();

        sellCoffee(CoffeeMenu.AMERICANO);
        sellCoffee(CoffeeMenu.AMERICANO);
        sellCoffee(CoffeeMenu.AMERICANO);

        sellCoffee(CoffeeMenu.CAFE_LATTE);
        sellCoffee(CoffeeMenu.CAFE_LATTE);

        for(int coffeesale : coffeeSales){
            System.out.println(coffeesale);
        }
    }
}
