package com.example.isp;

//범용인터페이스
interface Animal{
    void eat();
    void sleep();
    void makeSound();
}

//채식동물
interface Herbivore{
    void eat();
}
//육식동물
interface Carnivore{
    void eat();
    void makeSound();
}

//각각의 동물 클래스
class Dog implements Carnivore{
    @Override
    public void eat(){
        System.out.println("고기를먹습니다");
    }
    @Override
    public void makeSound(){
        System.out.println("멍멍");
    }
}

class Rabbit implements Herbivore{
    @Override
    public void eat(){
        System.out.println("풀을 먹습니다");
    }

}


public class ThingsMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Rabbit rabbit = new Rabbit();
        dog.eat();
        dog.makeSound();
        rabbit.eat();

    }
}
