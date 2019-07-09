package com.stream.forumuser;

import java.util.Map;

public class ForumMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultsMap = forum.getForumUserList().stream()
                .filter(user -> user.getSex() == 'M')

    }
}
