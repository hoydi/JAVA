package com.example;

public class BoardMarkerTest {
    public static void main(String[] args) {
        BoardMarker boardMarker = new BoardMarker("검정");
        System.out.println("boardMarker = " + boardMarker.color);
        System.out.println("BoardMarkerTest.main");
        boardMarker.toDraw("빨강");
    }
}
