package com.kodillla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreStream {

    public static void main ( String [] args ){

        MovieStore movieStore = new MovieStore();


        String result = movieStore.getMovies().values().stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!"));
                 System.out.println(result);

    }


}
