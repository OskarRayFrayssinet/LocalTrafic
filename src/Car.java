//Depinder Kaur, 2024-01-19, depinder.kaur@iths.se
public class Car implements Drivable{

    private int regNum;

    public Car(int regNum) {
        this.regNum = regNum;
    }

    @Override
    public void drive() {
        System.out.println("Driving Car #" + regNum);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car #" + regNum);
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNum=" + regNum +
                '}';
    }
}
