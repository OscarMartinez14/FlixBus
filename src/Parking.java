public class Parking {
    /**
     * all variables are here initialized
     */
    public Ride ride;
    public BusStation busStation;

    /**
     *
     * @param ride
     * @param busStation
     */

    public Parking(Ride ride, BusStation busStation)
    {
        this.ride = ride;
        this.busStation = busStation;
    }

    /**
     *
     * @return
     */

    public Ride getRide()
    {
        return ride;
    }

    /**
     *
     * @param ride
     */

    public void setRide(Ride ride)
    {
        this.ride = ride;
    }

    /**
     *
     * @return
     */

    public BusStation getBusStation()
    {
        return busStation;
    }

    /**
     *
     * @param busStation
     */

    public void setBusStation(BusStation busStation)
    {
        this.busStation = busStation;
    }
}
