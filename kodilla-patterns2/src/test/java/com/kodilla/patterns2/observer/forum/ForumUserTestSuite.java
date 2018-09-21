package com.kodilla.patterns2.observer.forum;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ForumUserTestSuite {

    @Test
    public void testUpdate() {

        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessePinkman = new ForumUser("Jesse Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessePinkman);
        javaToolsForum.registerObserver(jessePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with this loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, MySql db doesn't want to work :(");
        javaHelpForum.addPost("Why while is it better?");
        javaToolsForum.addPost("When i try to log in I got 'bad credentials' message.");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessePinkman.getUpdateCount());
    }

}
