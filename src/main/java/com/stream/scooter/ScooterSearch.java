package com.stream.scooter;

import java.util.ArrayList;
import java.util.List;

public final class ScooterSearch {
    private final List<Scooter> list = new ArrayList<>();

    public ScooterSearch(){
        list.add(new Scooter(001, "X", "Regular", 75, true, 5, "free"));
        list.add(new Scooter(002, "X", "Regular", 45, true,2,"free"));
        list.add(new Scooter(003, "X", "Big", 60, false, 3, "free"));
        list.add(new Scooter(004, "Y", "Regular", 85, false, 1, "free"));
        list.add(new Scooter(005, "Y", "Regular", 60, false, 4, "rented"));
        list.add(new Scooter(006, "Y", "Big", 95, true, 1,"free'"));
    }

    public List<Scooter> getList(){
        return new ArrayList<>(list);
    }
}
