package com.kodilla.stream;

import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String [] args){
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text"));


        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions using Labdas: ");

        expressionExecutor.executeExpression(10,5, (a,b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a,b) -> a / b);
        System.out.println();

        System.out.println("Calculating expressions with method references: ");

        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::myltiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::substractBFromA);

        System.out.println();


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String text = "Yet another text that will be beautiful";
        char firstChar = text.charAt(0);
        char lastChar = text.charAt(text.length()-1);

        poemBeautifier.beautify("Sample text to decorate", (String) -> "ABC " + String + " ABC");
        poemBeautifier.beautify("Another thing to beautify", (String) -> String.toUpperCase());
        poemBeautifier.beautify("Yet another text that will be beautiful", (String) -> firstChar + String + lastChar  );
        poemBeautifier.beautify("Good morning everybody", (String) -> String.replace('o',  'O')  );
        poemBeautifier.beautify("Kodilla is perfect", (String) -> String.replaceAll("\\p{Space}", "|||" ));
        poemBeautifier.beautify("Kodilla is perfect", (String) -> String.replaceAll("\\s+",""));
    }




}
