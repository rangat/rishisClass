/**
 * Created by ranga_000 on 12/21/13.
 */
public abstract class Vehicle {
    private int numWheels;
    private int numWindows;
    private int numWings;

    Vehicle(int numWheels, int numWindows, int numWings){
        this.numWheels = numWheels;
        this.numWindows = numWindows;
        this.numWings = numWings;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public int getNumWindows() {
        return this.numWindows;
    }

    public int getNumWings() {
        return this.numWings;
    }
}
