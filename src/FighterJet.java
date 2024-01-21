public class FighterJet implements Drivable{
    private String brand;
    private int noMissiles;
    private String countryOfOrigin;

    public FighterJet(String brand, int noMissiles, String countryOfOrigin) {
        this.brand = brand;
        this.noMissiles = noMissiles;
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoMissiles() {
        return noMissiles;
    }

    public void setNoMissiles(int noMissiles) {
        this.noMissiles = noMissiles;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }


    public void drive() {

    }

    public void stop() {

    }

    @Override
    public String toString() {
        return "FighterJet{" +
                "brand='" + brand + '\'' +
                ", noMissiles=" + noMissiles +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
