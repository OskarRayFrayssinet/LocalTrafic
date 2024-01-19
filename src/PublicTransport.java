// Oskar Ray-Frayssinet, oskar.ray.frayssinet@iths.se
abstract class PublicTransport implements Drivable{
    private String vehicleNumber;
    private int totalSeats;
    public PublicTransport(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String newVehicleNumber) {
        this.vehicleNumber = newVehicleNumber;
    }

    public abstract void setTotalSeats(int totalSeats);

    @Override
    public String toString() {
        return "PublicTransport{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                '}';
    }
}
