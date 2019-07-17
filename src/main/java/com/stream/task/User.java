package com.stream.task;

public final class User {
    private final String userName;
    private final String realName;

    public User(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }
}
