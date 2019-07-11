package com.stream.social;

import java.util.HashSet;
import java.util.Set;

public final class SocialNetworkUser {
    private final String userName;
    private final String location;
    private final int age;
    private final Set<SocialNetworkUser> friends = new HashSet<>();

    public SocialNetworkUser(String userName, String location, int age) {
        this.userName = userName;
        this.location = location;
        this.age = age;
    }

    public void addFriend(SocialNetworkUser user){
        friends.add(user);
    }

    public boolean removeFriend(SocialNetworkUser user){
        return friends.remove(user);
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

    public Set<SocialNetworkUser> getFriends() {
        return friends;
    }
}
