public class Plane implements Drivable {
    private String planeNr;

    @Override
    public void drive() {
        System.out.println("fly#" + this.planeNr);
    }

    @Override
    public void stop() {
        System.out.println("fly#" + this.planeNr);

    }
}
