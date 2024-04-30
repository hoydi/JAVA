package com.example.inheritance;

public class ClassA {

    protected String name;
    public ClassA() {
        this.name = "classa 디폴트생성자호출";
        System.out.println(this.name);
    }
    public ClassA(int a) {
        System.out.println("ClassA Constructor int");
    }

}
