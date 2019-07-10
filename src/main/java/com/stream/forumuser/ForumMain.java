package com.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultsMap = forum.getForumUserList().stream()
                .filter(user -> user.getSex() == 'm')
                .filter(user -> LocalDate.now().getYear() - user.getDateOBirth().getYear()  > 19)
                .filter(user -> user.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        System.out.println("Numbers of specific users (male, over 19 year, with post/posts published on the forum): \n" + resultsMap.size());
        resultsMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " +  entry.getValue())
                .forEach(System.out::println);
    }
}
