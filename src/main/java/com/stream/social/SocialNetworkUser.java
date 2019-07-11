package com.stream.social;

import java.util.HashSet;
import java.util.Set;

public final class SocialNetworkUser {
    private final String userName;
    private final String location;
    private final int age;
    private final Set<SocialNetworkUser> friends = new HashSet<>();
}
