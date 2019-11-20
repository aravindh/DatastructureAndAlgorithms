package com.aravindh.dsa.design.elevator;

import java.util.ArrayList;
import java.util.List;

public class Building {
    int numberOfFloors;
    List<Elevator> elevators;

    public Building(int numberOfFloors, int numberOfElevators){
        this.numberOfFloors = numberOfFloors;
        this.elevators = new ArrayList<>(numberOfElevators);
    }
}
