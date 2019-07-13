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
        user1.addFriend(user2);
        user1.addFriend(user6);
        user1.addFriend(user9);
        // create relations for user 2
        user2.addFriend(user1);
        user2.addFriend(user4);
        user2.addFriend(user10);
        // create relations for user 3
        user3.addFriend(user5);
        user3.addFriend(user7);
        user3.addFriend(user9);
        // create relations for user 4
        user4.addFriend(user2);
        user4.addFriend(user10);
        // create relations for user 5
        user5.addFriend(user3);
        user5.addFriend(user6);
        user5.addFriend(user8);
        // create relations for user 6
        user6.addFriend(user1);
        user6.addFriend(user5);
        user6.addFriend(user9);
        // create relations for user 7
        user7.addFriend(user3);
        user7.addFriend(user8);
        user7.addFriend(user9);
        // create relations for user 8
        user8.addFriend(user5);
        user8.addFriend(user7);
        user8.addFriend(user10);
        // create relations for user 9
        user9.addFriend(user1);
        user9.addFriend(user3);
        user9.addFriend(user6);
        user9.addFriend(user7);
        // create relations for user 10
        user9.addFriend(user2);
        user9.addFriend(user4);
        user9.addFriend(user8);
    }
}
