// Oskar Ray-Frayssinet, oskar.ray.frayssinet@iths.se , Emanuel sleyman
public class CarE implements Drivable{
    private String regNr;

    public CarE(String regNr){
        this.regNr = regNr;
    }

    public void drive() {
        System.out.println("Car is Driving" + this.regNr);
    }

    public void stop() {
        System.out.println("Car is Stopping" + this.regNr);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNr='" + regNr + '\'' +
                '}';
    }
}
