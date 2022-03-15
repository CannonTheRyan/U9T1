public class UFO extends Vehicle{

    private int numberOfAliens;
    private double radius;

    public UFO(String name, int wheels, int numberOfAliens, double radius)
    {
        super(name, wheels);
        this.numberOfAliens = numberOfAliens;
        this.radius = radius;
    }

    public void kidnap()
    {
        System.out.println("Beaming someone up!");
    }

    public void flyBy()
    {
        System.out.println("Causing mass confusion to US aircraft!");
    }

    public void crash()
    {
        System.out.println("Crashing into Area 51!");
    }

    public int getNumberOfAliens()
    {
        return numberOfAliens;
    }

    public double getRadius()
    {
        return radius;
    }
}
