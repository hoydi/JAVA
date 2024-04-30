package com.example.inheritance;

public class ClassC extends ClassB{
    protected String name;
    public ClassC() {
        super();
        this.name = "classc 디폴트생성자호출";
        System.out.println(this.name);
    }
}
