package com.stream.scooter;

import java.util.Map;
import java.util.stream.Collectors;

public class ScooterMain {
    public static void main(String[] args) {
        ScooterSearch scooterSearch = new ScooterSearch();

        Map<Integer, Scooter> theResultMap = scooterSearch.getList().stream()
                .filter(scooter -> scooter.getPowerLevel() > 50)
                .filter(scooter -> scooter.getLocationDistance() < 2)
                .filter(scooter -> scooter.getStatus() == "free")
                .collect(Collectors.toMap(Scooter::getId, scooter -> scooter));

        System.out.println("Number of found scooters: " + theResultMap.size());
        theResultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry. getValue())
                .forEach(System.out::println);
    }
}
