package com.stream.forumuser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

public class ForumMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> resultsMap = forum.getForumUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getDateOBirth().getYear() - LocalDate.now().getYear() > 19)
                .filter(user -> user.getPostsQuantity() > 0)

    }
}
