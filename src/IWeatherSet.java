import java.util.GregorianCalendar;
import java.util.LinkedList;

public interface IWeatherSet {

    //adds a given data set from a specific date to a list of reports
    void add(GregorianCalendar date, LinkedList<Reading> readings);

    // get the average temperature of a given month and year
    double monthAverage(int month, int year);

    // get the sum of rainfall for a given month and year
    double sumOfAllRainfall(int month, int year);
}
