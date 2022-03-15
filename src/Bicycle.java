public class Bicycle extends Vehicle{

    private int gearCount;

    public Bicycle(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public void ringBells()
    {
        System.out.println("RING RING");
    }

    public int getGearCount()
    {
        return gearCount;
    }
}
