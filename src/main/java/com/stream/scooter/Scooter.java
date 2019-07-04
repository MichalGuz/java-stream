package com.stream.scooter;

public final class Scooter {
    private final int id;
    private final String brand;
    private final String model;
    private final int powerLevel;
    private final boolean docked;
    private final int locationDistance;
    private final String status;

    public Scooter(int id, String brand, String model, int powerLevel, boolean docked, int locationDistance, String status) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.powerLevel = powerLevel;
        this.docked = docked;
        this.locationDistance = locationDistance;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public boolean isDocked() {
        return docked;
    }

    public int getLocationDistance() {
        return locationDistance;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", powerLevel=" + powerLevel +
                ", docked=" + docked +
                ", locationDistance=" + locationDistance +
                ", status='" + status + '\'' +
                '}';
    }
}


