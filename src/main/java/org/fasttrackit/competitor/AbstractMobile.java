package org.fasttrackit.competitor;

public abstract class AbstractMobile implements Mobile {

    @Override
    public int compareTo(Mobile o) {
        if (this == o) {
            return 0;
        }

        if (o == null) {
            return 1;
        }

        return Double.compare(this.getTotalTraveledDistance(), o.getTotalTraveledDistance());
    }
}
