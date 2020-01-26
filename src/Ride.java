public class Ride {
    public Bus bus;
    public String start;
    public String back;
    public int number;
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

    public Ride(Bus bus, String start, String back, int number)
    {
        this.bus = bus;
        this.start = start;
        this.back = back;
        this.number = number;
    }
}
