package com.stream.social;

import org.junit.Test;

public class SocialNetworkUserTestSuite {
    @Test
    public void testGetLocationsOfFriends(){
        // given
        // create users
        SocialNetworkUser user1 = new SocialNetworkUser("user1", "location1", 20);
        SocialNetworkUser user2 = new SocialNetworkUser("user2", "location2", 30);
        SocialNetworkUser user3 = new SocialNetworkUser("user3", "location3", 25);
        SocialNetworkUser user4 = new SocialNetworkUser("user4", "location4", 20);
        SocialNetworkUser user5 = new SocialNetworkUser("user5", "location1", 27);
        SocialNetworkUser user6 = new SocialNetworkUser("user6", "location2", 30);
        SocialNetworkUser user7 = new SocialNetworkUser("user7", "location3", 40);
        SocialNetworkUser user8 = new SocialNetworkUser("user8", "location4", 35);
        SocialNetworkUser user9 = new SocialNetworkUser("user9", "location1", 25);
        SocialNetworkUser user10 = new SocialNetworkUser("user10", "location2", 44);

        // when
        // create relations for user1
    }
}
