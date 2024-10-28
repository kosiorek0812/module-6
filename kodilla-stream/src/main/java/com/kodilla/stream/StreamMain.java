package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.*;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("LaLaLand", (p) -> p.toUpperCase());
        poemBeautifier.beautify("The Man Who Stared At Goats", (p) -> p.toLowerCase());
        poemBeautifier.beautify("Dead Poets Society", (p) -> "ABC " + p + " ABC");
        poemBeautifier .beautify("abcdefghijklmnopq", (p) -> p.substring(3, 10));

        ForumUser user1 = new ForumUser(1, "Mike", 'M', LocalDate.of(1999, Month.AUGUST, 16));
        ForumUser user2 = new ForumUser(2, "Joe", 'M', LocalDate.of(2000, Month.FEBRUARY, 11));
        ForumUser user3 = new ForumUser(3, "Babette", 'W', LocalDate.of(2004, Month.NOVEMBER, 1));
        ForumUser user4 = new ForumUser(4, "Harrison", 'M', LocalDate.of(1994, Month.DECEMBER, 12));
        ForumUser user5 = new ForumUser(5, "Javier", 'M', LocalDate.of(1999, Month.AUGUST, 30));
        ForumUser user6 = new ForumUser(6, "Jaquin", 'M', LocalDate.of(1975, Month.FEBRUARY, 28));
        ForumUser user7 = new ForumUser(7, "Jim", 'M', LocalDate.of(1998, Month.JANUARY, 19));
        ForumUser user8 = new ForumUser(8, "Anette", 'W', LocalDate.of(2007, Month.JULY, 11));
        ForumUser user9 = new ForumUser(9, "Hale", 'W', LocalDate.of(1991, Month.JUNE, 14));
        ForumUser user10 = new ForumUser(10, "Demi", 'W', LocalDate.of(1981, Month.MARCH, 11));
        ForumUser user11 = new ForumUser(11, "Jolanda", 'W', LocalDate.of(1997, Month.MAY, 30));
        ForumUser user12 = new ForumUser(12, "Scarlett", 'W', LocalDate.of(1993, Month.FEBRUARY, 9));
        ForumUser user13 = new ForumUser(13, "Robert", 'M', LocalDate.of(1991, Month.APRIL, 2));
        ForumUser user14 = new ForumUser(14, "Morgan", 'M', LocalDate.of(2002, Month.OCTOBER, 3));
        ForumUser user15 = new ForumUser(15, "Anne", 'W', LocalDate.of(1992, Month.AUGUST, 19));
        ForumUser user16 = new ForumUser(16, "Monica", 'W', LocalDate.of(2005, Month.FEBRUARY, 17));

        user1.setPosts(11);
        user2.setPosts(12);
        user3.setPosts(101);
        user14.setPosts(102);
        user15.setPosts(99);
        user16.setPosts(1);
        user5.setPosts(12);
        user6.setPosts(11);
        user7.setPosts(111);

        Forum forum = new Forum();

        forum.addForumUser(user1);
        forum.addForumUser(user2);
        forum.addForumUser(user3);
        forum.addForumUser(user4);
        forum.addForumUser(user5);
        forum.addForumUser(user6);
        forum.addForumUser(user7);
        forum.addForumUser(user8);
        forum.addForumUser(user9);
        forum.addForumUser(user10);
        forum.addForumUser(user11);
        forum.addForumUser(user12);
        forum.addForumUser(user13);
        forum.addForumUser(user14);
        forum.addForumUser(user15);
        forum.addForumUser(user16);



        Map<Integer, String> result = forum.getForumUsers().stream()
                .filter(u -> u.getSex() == 'M')
                .filter(u -> Period.between(u.getBirthday(), LocalDate.now()).getYears() > 20)
                .filter(u -> u.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getID, ForumUser::getName));

                result.forEach((key, value) -> System.out.println(key + "   " + value));


    }
}

