public class Bus {
    public int number;
    public int passengerSeats;

    public Bus(int number, int passengerSeats)
    {
        this.number = number;
        this.passengerSeats = passengerSeats;
    }

    public int getNumber()
    {
        return number;
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
