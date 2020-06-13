package org.fasttrackit.competitor;

public interface Mobile extends Comparable<Mobile> {

    double accelerate(double speed, double durationInHours);

    double getTotalTraveledDistance();

    boolean canMove();

    String getName();
}
