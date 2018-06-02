package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemBeautifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator){
        String beautifiedText = poemDecorator.decorate(textToDecorate);
        System.out.println("Decorated text looks like that: " + beautifiedText);
        }

}
