public class BusStation {
    public String name;
    public int number;
    public boolean buisness;
    public boolean occupied;

    public BusStation(String name, int number, boolean buisness, boolean occupied)
    {
        this.name = name;
        this.number = number;
        this.buisness = buisness;
        this.occupied = occupied;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public boolean isBuisness()
    {
        return buisness;
    }

    public void setBuisness(boolean buisness)
    {
        this.buisness = buisness;
    }

    public boolean isOccupied()
    {
        return occupied;
    }

    public void setOccupied(boolean occupied)
    {
        this.occupied = occupied;
    }
}
