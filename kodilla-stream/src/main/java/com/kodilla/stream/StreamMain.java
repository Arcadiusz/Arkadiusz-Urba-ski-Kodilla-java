package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String [] args){


        /*Processor processor = new Processor();
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

        poemBeautifier.beautify("Sample text to decorate", (string) -> "ABC " + string + " ABC");
        poemBeautifier.beautify("Another thing to beautify", (string) -> string.toUpperCase());
        poemBeautifier.beautify(text, (string) -> firstChar + string + lastChar  );
        poemBeautifier.beautify("Good morning everybody", (string) -> string.replace('o',  'O')  );
        poemBeautifier.beautify("Kodilla is perfect", (string) -> string.replaceAll("\\p{Space}", "|||" ));
        poemBeautifier.beautify("Kodilla is perfect", (string) -> string.replaceAll("\\s+",""));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

       /* People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);*/

        /*BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/

        //--------------------------------------------------------------

        /*BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);
        */

       // ---------------------------------------------------------------------

       /* BookDirectory theBookDirectory = new BookDirectory();


        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
               .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())  // O TO SPYTAC
                .forEach(System.out::println);*/


        // Operation Collectors.joining()---------------------------------------------------------------------


       /* BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/

        // Zadanie 7.3 funkcyjny spacer po liscie uzytkowników forum -----------------------------------------

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> Period.between(user.getDateOfBirth(), LocalDate.now()).getYears() >=20)
                .filter(user -> user.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);






    }

}
