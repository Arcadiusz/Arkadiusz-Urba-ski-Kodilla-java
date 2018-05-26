package com.kodilla.testing.collection;

import java.util.ArrayList;


public class OddNumbersExterminator {

    ArrayList<Integer> myList;
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


    public ArrayList exterminate(ArrayList<Integer> theList, ArrayList<Integer> anotherList) {
        int temporaryValue = 0;
        for (int n=0; n<theList.size(); n++){
            temporaryValue = theList.get(n);

            if (temporaryValue % 2 == 0){
                anotherList.add(temporaryValue);
            }
        }
        return anotherList;
    }
}

