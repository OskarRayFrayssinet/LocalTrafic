public class Plane implements Drivable {
    private String planeNr;

    @Override
    public void drive() {
        System.out.println("depature#" + this.planeNr);
    }

    @Override
    public void stop() {
        System.out.println("arrive#" + this.planeNr);

    }
}
