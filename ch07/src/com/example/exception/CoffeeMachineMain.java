package com.example.exception;


//커피재료가부족할때 예외클래스 정의
class CoffeeMachineException extends Exception {
    public CoffeeMachineException(String message) {
        super(message);
    }
}

//커피머신클래스
class CoffeeMachine{
    private int coffeeStock = 10; //커피재고
    //커피주문메서드
    public void orderCoffee(int quantity) throws CoffeeMachineException {
        if (quantity > coffeeStock) {
            throw new CoffeeMachineException("재고가 부족합니다");
        }
    }
}

public class CoffeeMachineMain {
    public static void main(String[] args) throws CoffeeMachineException {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        try{
            coffeeMachine.orderCoffee(11);
        } catch (CoffeeMachineException e) {
            System.out.println(e.toString());
            System.out.println("재고가 부족하니 다른 음료를 선택하세요.");
        }
    }
}
