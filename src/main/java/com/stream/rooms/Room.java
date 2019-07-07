package com.stream.rooms;

public final class Room {
    private final int roomNumber;
    private final String roomSize;
    private final boolean roomAvailable;
    private final String reservation;

    public Room(final int roomNumber, final String roomSize, final boolean roomAvailable, final String reservation) {
        this.roomNumber = roomNumber;
        this.roomSize = roomSize;
        this.roomAvailable = roomAvailable;
        this.reservation = reservation;
    }
}
