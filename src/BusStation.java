public class BusStation {
    private String name;
    private Gate[] gates;

    public void setGates(Gate[] gates) {
        this.gates = gates;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object[] getGates() {
        return gates;
    }

    public String getName() {
        return name;
    }

    public BusStation(String name, Gate[] gates) {
        this.name = name;
        this.gates = gates;
    }

    public void arrive(Ride ride){

    }

    public void start(int gateNumber){

    }

    public void gateStatus(int gateNumber){

    }
}
