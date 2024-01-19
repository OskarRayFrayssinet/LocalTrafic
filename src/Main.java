// Oskar Ray-Frayssinet, oskar.ray.frayssinet@iths.se
public class Main {
    public static void main(String[] args) {
        PublicTransport b1 = new Bus("AAA111", 60);
        System.out.println(b1);
        System.out.println(b1.getVehicleNumber());

        printIfPublicTransport(b1);

    }

    public static void printIfPublicTransport(PublicTransport pb){
        System.out.println("WOHOOO this is a public transport: " + pb.toString());
    }
}