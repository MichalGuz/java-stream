package com.stream.social;

import com.stream.forumuser.ForumUser;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SocialNetworkUser that = (SocialNetworkUser) o;
        return userName.equals(that.userName);
    }

    @Override
    public int hashCode() {
        return userName.hashCode();
    }

    @Override
    public String toString() {
        return "SocialNetworkUser{" +
                "userName='" + userName + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                '}';
    }

    public Set<String> getLocationOfFriends(){
        return friends.stream()
                .flatMap(friend -> friend.getFriends().stream())
                .filter(user -> user != this)
                .map(SocialNetworkUser::getLocation)
                .collect(Collectors.toSet());
    }
}
