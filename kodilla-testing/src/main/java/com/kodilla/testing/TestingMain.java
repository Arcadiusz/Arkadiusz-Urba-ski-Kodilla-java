package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.sql.SQLOutput;


public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calc = new Calculator();
        int a = 10;
        int b = 4;
        int sum = calc.add(a,b);
        int diff = calc.substract(a,b);

        if ( sum == a + b){
            System.out.println(" Addition test ok");
        }
        else{
            System.out.println("Addition test gone wrong");
        }

        System.out.println();

        if ( diff == a - b){
            System.out.println(" Substraction test ok");
        }
        else{
            System.out.println("Substraction test gone wrong");
        }

    }
}