package com.stream.forumuser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Collectors;

public class ForumMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultsMap = forum.getForumUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOBirth().getYear() - LocalDate.now().getYear() > 19)
                .filter(user -> user.getPostsQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

    }
}
