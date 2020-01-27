public class Ride {
    public Bus bus;
    public String start;
    public String back;
    public int number;
    public String location;

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public boolean international;



    public Bus getBus()
    {
        return bus;
    }

    public String getStart()
    {
        return start;
    }

    public String getBack()
    {
        return back;
    }

    public int getNumber()
    {
        return number;
    }
    public String getInternational()
    {
        if (number <= 1000) {
            return "International";
        } else {
            return "National";
        }
    }

    public Ride(Bus bus, String start, String back, int number, String location)
    {
        this.bus = bus;
        this.start = start;
        this.back = back;
        this.number = number;
        this.location = location;
    }
}
