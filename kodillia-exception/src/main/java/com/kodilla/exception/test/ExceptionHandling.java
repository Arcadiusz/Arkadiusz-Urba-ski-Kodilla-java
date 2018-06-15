package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main (String [] args ){

        SecondChallenge challenge = new SecondChallenge();

        try{
        challenge.probablyIWillThrowException(1.2,1.6);
            System.out.println("No exception found");
        }catch(Exception e){
            System.out.println("Exception found " + e);
        } finally {
            System.out.println("Method ececuted....");
        }
    }
}
