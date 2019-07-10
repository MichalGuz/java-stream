package com.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(10, "User1", 'f', 1988,6,20,10));
        forumUserList.add(new ForumUser(13, "User2", 'm', 1998,5,24,45));
        forumUserList.add(new ForumUser(15, "User3", 'm', 1967,3,10,98));
        forumUserList.add(new ForumUser(23, "User4", 'f', 1981,10,27,14));
        forumUserList.add(new ForumUser(26, "User5", 'm', 1989,6,20,43));
        forumUserList.add(new ForumUser(30, "User6", 'f', 1999,8,15,39));
        forumUserList.add(new ForumUser(32, "User7", 'f', 1992,9,4,53));
        forumUserList.add(new ForumUser(41, "User8", 'm', 1983,1,9, 15));
        forumUserList.add(new ForumUser(46, "User9", 'f', 1977,11,21,17));
        forumUserList.add(new ForumUser(47, "User0", 'm', 1968,7,19,26));
    }

    public List<ForumUser> getForumUserList(){
        return new ArrayList<>(forumUserList);
    }
}
