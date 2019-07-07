package com.stream.rooms;

import java.util.Map;

public class RoomMain {
    public static void main(String[] args) {
        RoomCheck roomCheck = new RoomCheck();

        Map<Integer, Room> roomMap = roomCheck.getList().stream()
                .filter(room -> room.isRoomAvailable() == false)
                .filter(room -> room.getReservation() == "")
                .map(Room::toString)
    }
}
