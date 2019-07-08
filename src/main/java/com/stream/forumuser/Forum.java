package com.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(10, "User1", 'f', LocalDate.of(1988,6,20),10));
        forumUserList.add(new ForumUser(13, "User2", 'm', LocalDate.of(1998,5,24),45));
        forumUserList.add(new ForumUser(15, "User3", 'm', LocalDate.of(1967,3,10),98));
        forumUserList.add(new ForumUser(23, "User4", 'f', LocalDate.of(1981,10,27),14));
        forumUserList.add(new ForumUser(26, "User5", 'm', LocalDate.of(1989,6,20),43));
        forumUserList.add(new ForumUser(30, "User6", 'f', LocalDate.of(1999,8,15),43));
        forumUserList.add(new ForumUser(32, "User7", 'f', LocalDate.of(1992,9,4),53);
        forumUserList.add(new ForumUser(41, "User8", 'm', LocalDate.of(1983,1,9), 15);
        forumUserList.add(new ForumUser(46, "User9", 'f', LocalDate.of(1977,11,21),17));
        forumUserList.add(new ForumUser(47, "User0", 'm', LocalDate.of(1968,7,19),26));
    }
}
