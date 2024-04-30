package com.example.lsp;


class Animal{
    public void makesound(){

    }
}

class Dog extends Animal{
    @Override
    public void makesound(){
        System.out.println("멍");
    }
}

class Cat extends Animal{
    @Override
    public void makesound(){
        System.out.println("양");

    }
}

class AnimalAction{
    public void performSound(Animal animal){
        animal.makesound();
    }
}


public class AnimalActionMain {
    public static void main(String[] args) {
        AnimalAction animalAction = new AnimalAction();

        //다형성활용하여 모든동물이animal클래스로대체될수잇음을보여줌
        Animal dog = new Dog(); //dog is a animal
        Animal cat = new Cat();
        animalAction.performSound(dog);
        animalAction.performSound(cat);
    }
}
