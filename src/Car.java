public class Car {
    private String motor;
    private String type;
    private int wheel;

    public String getMotor()
    {
        return motor;
    }

    public void setMotor(String motor)
    {
        this.motor = motor;
    }

    public String isTuned() {
        if (wheel >= 4) {
            return "This car is tuned";
        } else return "This car is not tuned";
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public boolean isTunned()
    {
        return tunned;
    }

    public void setTunned(boolean tunned)
    {
        this.tunned = tunned;
    }

    private boolean tunned;
}
