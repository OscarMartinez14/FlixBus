public class Gate {
    private int id;
    private boolean national;
    private boolean big;
    private Ride ride;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNational() {
        return national;
    }

    public void setNational(boolean national) {
        this.national = national;
    }

    public boolean isBig() {
        return big;
    }

    public void setBig(boolean big) {
        this.big = big;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public Gate(int id, boolean national, boolean big) {
        super();
        this.id = id;
        this.national = national;
        this.big = big;
    }

    public Bus getBus(){
        if(this.ride != null){
            return ride.getBus();
        }
        return null;
    }

    public void arrive(Ride ride){

    }

    public void start(){

    }

    public Boolean isOccupied(){
        return (this.ride == null);
    }
}



