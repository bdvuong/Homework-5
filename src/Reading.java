/**
 * A reading from the sensor.
 * Contains:
 *  time of the reading
 *  temperature at the time of reading
 *  amount of rainfall at the time of reading
 */
public class Reading {

    private Time time;
    private double temperature;
    private double rainfall;

    public Reading(Time time, double temperature, double rainfall) {
        this.time = time;
        this.temperature = temperature;
        this.rainfall = rainfall;
    }

    //Getters
    public Time getTime() {
        return time;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getRainfall() {
        return rainfall;
    }
}
