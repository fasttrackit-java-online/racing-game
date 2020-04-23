package org.fasttrackit.vehicles.cheater;

import org.fasttrackit.vehicles.Vehicle;

public class CheatingVehicle extends Vehicle {

    public void cheat() {
        totalTraveledDistance *= 2;
    }
}
