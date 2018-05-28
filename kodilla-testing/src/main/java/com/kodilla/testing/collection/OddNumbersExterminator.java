package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;


public class OddNumbersExterminator {

   /* ArrayList<Integer> myList;
    ArrayList<Integer> onlyEven;

    public  OddNumbersExterminator() {
        myList = new ArrayList<Integer>();
        onlyEven = new ArrayList<Integer>();
    }


    public void addNumbers() {
        for (int i=0; i<10; i++){
            myList.add(i+1);
            }
    }
    */


    public List<Integer> exterminate(List<Integer> theList) {
        List<Integer> result = new ArrayList<Integer>();
        for (int n: theList) {
            if ( n % 2 == 0 ){
                result.add(n);
            }
        }
        return result;
    }
}

