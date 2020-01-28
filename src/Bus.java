public class Bus extends Car {
    private int number;
    private int passengerSeats;

    public Bus(int number, int passengerSeats)
    {
        this.number = number;
        this.passengerSeats = passengerSeats;
    }

    public int getNumber()
    {
        return number;
    }

    public String isTuned() {
        if (passengerSeats >= 200) {
            return "This Bus is tuned";
        } else return "This Bus is not tuned";
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getPassengerSeats()
    {
        return passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats)
    {
        this.passengerSeats = passengerSeats;
    }
}
