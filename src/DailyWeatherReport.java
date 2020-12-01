import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * Contains two sets of data from a given date:
 *  temperature readings
 *  rainfall readings
 */
public class DailyWeatherReport {

    private GregorianCalendar date;
    private LinkedList<Double> tempReadings;
    private LinkedList<Double> rainReadings;

    public DailyWeatherReport(GregorianCalendar date, LinkedList<Double> tempReadings, LinkedList<Double> rainReadings) {
        this.date = date;
        this.tempReadings = tempReadings;
        this.rainReadings = rainReadings;
    }


    /**
     * checks to see if the given date is the same as this object
     * @param month month that we are looking for
     * @param year year we are looking for
     * @return true if it is the same
     */
    public boolean dateEquals(int month, int year) {
        return this.date.get(GregorianCalendar.YEAR) == year && this.date.get(GregorianCalendar.MONTH) == month;
    }

    /**
     * the sum of everything within the data
     * @return the sum of everything in the rainfall list
     */
    public double sumOfRainfall() {
        double total = 0;
        for(double report : this.rainReadings) {
            total += report;
        }
        return total;
    }

    /**
     * finds the average temperature for the day
     * @return the average temperature of the day
     */
    public double dayTotalTemp() {
        double total = 0;
        for(double report : this.tempReadings) {
            total += report;
        }
        return total;
    }

    /**
     * produces the size of a given temperature report
     * @return the size of the given report
     */
    public int dayTempCounter() {
        return this.tempReadings.size();
    }
}
