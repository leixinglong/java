package com.zte.dom4j;

public class JunitTest {

    public int add(int number1, int number2){
        return number1 + number2;
    }

    public int divi(int number1, int number2){
        if(1 == number1){
            throw new RuntimeException();
        }
        // wo shi xinjiade 
        return number1 / number2;
    }
}
