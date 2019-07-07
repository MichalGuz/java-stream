package com.stream.rooms;

import java.util.ArrayList;
import java.util.List;

public final class RoomCheck {
    private final List<Room> roomList = new ArrayList<>();

    public RoomCheck(){
        roomList.add(new Room(1, "double", false, "Mr John Smith"));
        roomList.add(new Room(2, "double", false, "Ms Mia Jackson"));
        roomList.add(new Room(3, "single", false, "Mr Toby Jones"));
        roomList.add(new Room(4, "double", false, "Ms Helen Osborn"));
        roomList.add(new Room(5, "double", false, "Ms Lisa Parker"));
        roomList.add(new Room(6, "single", true, ""));
    }
}
