public class BusStation {

    /**
     * all variables are here initialized
     */
    private String name;
    private int number;
    private boolean buisness;
    private boolean occupied;

    /**
     *
     * @param name
     * @param number
     * @param buisness
     * @param occupied
     */
    public BusStation(String name, int number, boolean buisness, boolean occupied)
    {
        this.name = name;
        this.number = number;
        this.buisness = buisness;
        this.occupied = occupied;
    }

    /**
     *
     * @return
     */

    public String getName()
    {
        return name;
    }

    /**
     *
     * @param name
     */

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getNumber()
    {
        return number;
    }

    /**
     *
     * @param number
     */

    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     *
     * @return
     */

    public boolean isBuisness()
    {
        return buisness;
    }

    /**
     *
     * @param buisness
     */

    public void setBuisness(boolean buisness)
    {
        this.buisness = buisness;
    }

    /**
     *
     * @return
     */

    public boolean isOccupied()
    {
        return occupied;
    }

    /**
     *
     * @param occupied
     */
    public void setOccupied(boolean occupied)
    {
        this.occupied = occupied;
    }
}
