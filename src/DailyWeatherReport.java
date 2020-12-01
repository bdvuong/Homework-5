import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 * Contains two lists of data from a given date:
 *  temperature readings
 *  rainfall readings
 */
public class DailyWeatherReport {

    GregorianCalendar date;
    LinkedList<Double> tempReadings;
    LinkedList<Double> rainReadings;

    public DailyWeatherReport(GregorianCalendar date,LinkedList<Double> tempReadings,LinkedList<Double> rainReadings) {
        this.date = date;
        this.tempReadings = tempReadings;
        this.rainReadings = rainReadings;
    }
}
