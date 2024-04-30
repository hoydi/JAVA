package com.example.inheritance;

public class ClassB extends ClassA {
    protected String name;
    public ClassB() {
        super();
        this.name = "classb 디폴트생성자호출";
        System.out.println(this.name);
    }
    int b1;
    int b2;

//    public ClassB() {
//        System.out.println("class B");
//    }

//자식 클래스의 객체를 생성할때 부모 클래스의 "기본 생성자"를 default 로 호출한다.
// 만약 자식 클래스 생성자에서 부모 클래스의 특정 생성자를 호출하지 않으면서
// 부모 클래스에 기본 생성자가 존재하지 않는 경우, 자식 클래스 객체 생성시 에러가 발생한다.


    public ClassB(int b1){
        this.b1 = b1;
    }


    public ClassB(int b2, int b1) {
        this.b2 = b2;
        this.b1 = b1;
    }
}

