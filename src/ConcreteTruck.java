//Robert Tronhage, robert.tronhage@iths.se
public class ConcreteTruck implements Drivable{
    private String name;
    private String brand;
    private double weight;

    //loading capacity in kg
    private double loadingCapacity;

    public ConcreteTruck(String name, String brand, double weight, double loadingCapacity) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.loadingCapacity = loadingCapacity;
    }

    @Override
    public void drive(){
        System.out.println("vromvrom");
    }

    @Override
    public void stop() {
        System.out.println("*tyres squeeling");
    }
}