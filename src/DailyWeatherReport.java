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
}
