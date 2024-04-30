package com.example.ocp;

import javax.sound.midi.Soundbank;

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("멍멍");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("양옹");
    }
}

class duck implements Animal{
    public void makeSound(){
        System.out.println("꽥꽥");
    }
}

class Zoo{
    
    public void addAnimal(Animal animal){
        //동물추가하는기능
        System.out.println("동물원에 새로운 동물이 추가되었습니다.");
        animal.makeSound();//추가된 동물의 소리 출력
    }
}


public class ZooMain {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        //새로운동물추가확장
        zoo.addAnimal(new Dog());
        zoo.addAnimal(new Cat());

    }
}
