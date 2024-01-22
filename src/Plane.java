public class Plane implements Drivable {
    private String planeNr;

    public Plane(String planeNr) {
        this.planeNr = planeNr;
    }

    public String getPlaneNr() {
        return planeNr;
    }

    public void setPlaneNr(String planeNr) {
        this.planeNr = planeNr;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeNr='" + planeNr + '\'' +
                '}';
    }

    @Override
    public void drive() {
        System.out.println("depature#" + this.planeNr);
    }

    @Override
    public void stop() {
        System.out.println("arrive#" + this.planeNr);

    }
}
