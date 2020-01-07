public class Ride {
    private int id;
    private String start;
    private String arrival;
    private Bus bus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Ride(int id, String start, String arrival, Bus bus) {
        this.id = id;
        this.start = start;
        this.arrival = arrival;
        this.bus = bus;
    }
}
