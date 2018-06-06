package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List <ForumUser> lista = new ArrayList<>();

    public Forum(){

        lista.add(new ForumUser(1784, "MadMan", 'M', LocalDate.of(1990, 12, 24), 44));
        lista.add(new ForumUser(1992, "Lolita", 'F', LocalDate.of(1988, 10, 17), 34));
        lista.add(new ForumUser(3291, "Queen123", 'F', LocalDate.of(1991, 4, 15), 15));
        lista.add(new ForumUser(1234, "Goodie", 'F', LocalDate.of(1997, 3, 20), 31));
        lista.add(new ForumUser(4221, "Max100", 'M', LocalDate.of(1980, 2, 24), 66));
        lista.add(new ForumUser(5678, "JasonMMM", 'M', LocalDate.of(1995, 8, 1), 100));
        lista.add(new ForumUser(2134, "TheBestMan", 'M', LocalDate.of(1989, 11, 18), 13));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(lista);
        }
}
