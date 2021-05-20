package com.company.collection;

public class JavaExceptionExample2 {


    public static void main(String[] args) throws NotSuficientBalanceException {

        int balance = 5000;
        int inputAmount = 4000;


        if (inputAmount > balance) {
            throw new NotSuficientBalanceException();
        }

        else {
            System.out.println("successful trnsaction");
        }

    }


}