public class Parking {
    public Ride ride;
    public BusStation busStation;

    public Parking(Ride ride, BusStation busStation)
    {
        this.ride = ride;
        this.busStation = busStation;
    }

    public Ride getRide()
    {
        return ride;
    }

    public void setRide(Ride ride)
    {
        this.ride = ride;
    }

    public BusStation getBusStation()
    {
        return busStation;
    }

    public void setBusStation(BusStation busStation)
    {
        this.busStation = busStation;
    }
}
