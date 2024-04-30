package com.example;

public class BoardMarker {
    // 멤버변수, 메서드
    // 데이터가 있고 이 데이터로 행위(기능)를 할 수 있다.
    String color;
    //생성자는 리턴타입이 없고 클래스 이름이다.
    public BoardMarker(String color) {
        this.color = color;
    }
    public BoardMarker() {}
    //생성자오버로딩
    public void toDraw(String color){
        System.out.println("화이트보드에 "+ color +"색으로 판서를 합니다.");
    }

}
