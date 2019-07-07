package com.stream.rooms;

import java.util.Map;
import java.util.stream.Collectors;

public class RoomMain {
    public static void main(String[] args) {
        RoomCheck roomCheck = new RoomCheck();

        String resultsOfStream = roomCheck.getList().stream()
                .filter(room -> room.isRoomAvailable() == false)
                .filter(room -> room.getReservation() == "")
                .map(Room::toString)
                .collect(Collectors.joining(",\n", "Start list of rooms :", "List is finished and ready."));
    }
}
