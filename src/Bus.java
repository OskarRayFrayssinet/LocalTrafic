// Oskar Ray-Frayssinet, oskar.ray.frayssinet@iths.se
public class Bus extends PublicTransport{
    private int busNumber;
    public Bus(String vehicleNumber, int busNumber){
        super(vehicleNumber);
        this.busNumber = busNumber;
    }

    public void drive() {
        System.out.println("DRIVING BUS#" + this.busNumber);
    }

    public void stop() {
        System.out.println("STOPING BUS#" + this.busNumber);
    }

    public void setTotalSeats(int totalSeats){
        setTotalSeats(totalSeats);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber=" + busNumber +
                '}';
    }
}
