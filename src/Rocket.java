/**
 * Drivable rocket
 *
 * @version	0.1 2024-01-19
 * @author	Johannes Randén
 */
public class Rocket implements Drivable{
    private String name;

    public Rocket(String name) {
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Raketen " + name + " åker!");
    }

    @Override
    public void stop() {
        System.out.println("Raketen " + name + " har stannat!");
    }
}
