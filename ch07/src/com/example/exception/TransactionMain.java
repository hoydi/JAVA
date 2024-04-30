package com.example.exception;

import javax.sound.midi.Soundbank;

//포장 예외 클래스
class PackingException extends Exception {
    public PackingException(String message) {
        super(message);
    }
}

//영수증발행예외클래스
class PrintingException extends Exception {
    public PrintingException(String message) {
        super(message);
    }
}

class ReceiptPrintingException extends Exception {
    public ReceiptPrintingException(String message) {
        super(message);
    }
}

//상품발송클래스
class ProductShipping {
    //상품발송메서드
    public void shipProduct() throws PackingException, ReceiptPrintingException {
        performPacking(); //포장작업
        printRecipt(); //영수증발행
        sendProduct(); //상품발송
    }

    //포장작업

    private void performPacking() throws PackingException {
        System.out.println("상품을 포장합니다");
        if (Math.random() < 0.5) {
            throw new PackingException("포장과정에서문제발생");
        }
    }

    private void printRecipt() throws ReceiptPrintingException {
        System.out.println("영수증을 발행");
        if (Math.random() < 0.5) {
            throw new ReceiptPrintingException("포장과정에서문제발생");
        }
    }

    //상품발송
    private void sendProduct() {
        //상품발송작업수행
        System.out.println("상품을 발송합니다");
    }

}


public class TransactionMain {
    public static void main(String[] args) {

        ProductShipping productShipping = new ProductShipping();
        try {
            productShipping.shipProduct();
            System.out.println("상품발송이 완료되었습니다.");
        } catch (PackingException | ReceiptPrintingException e) {
            System.out.println("상품발송 중 문제가 발송하여 발송을 취소합니다");
            System.out.println("발생한문제: "+ e.getMessage());

        }


    }//main
}
