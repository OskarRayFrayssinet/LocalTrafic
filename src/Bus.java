// Oskar Ray-Frayssinet, oskar.ray.frayssinet@iths.se
public class Bus implements Drivable{
    private int busNumber;
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void drive() {

        System.out.println("DRIVING BUS#" + this.busNumber);
    }

    public void stop() {

        System.out.println("STOPING BUS#" + this.busNumber);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                '}';
    }
}
