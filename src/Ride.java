public class Ride {
    /**
     * all variables are here initialized
     */
    private Bus bus;
    private String start;
    private String back;
    private int number;
    private String location;

    /**
     *
     * @return
     */
    public String getLocation()
    {
        return location;
    }

    /**
     *
     * @param location
     */
    public void setLocation(String location)
    {
        this.location = location;
    }

    public boolean international;

    /**
     *
     * @return
     */

    public Bus getBus()
    {
        return bus;
    }

    public String getStart()
    {
        return start;
    }

    /**
     *
     * @return
     */

    public String getBack()
    {
        return back;
    }

    /**
     *
     * @return
     */

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

    /**
     *
     * @param bus
     * @param start
     * @param back
     * @param number
     * @param location
     */

    /**
     *This is the constructor for the Class Ride
     */
    public Ride(Bus bus, String start, String back, int number, String location)
    {
        this.bus = bus;
        this.start = start;
        this.back = back;
        this.number = number;
        this.location = location;
    }
}
