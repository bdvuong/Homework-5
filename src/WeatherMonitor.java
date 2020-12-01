import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    private IWeatherSet weatherReports;

    public WeatherMonitor(IWeatherSet weatherReports) {
        this.weatherReports = weatherReports;
    }

    /**
     * Adds a daily report to the list of reports
     * @param date date of the report
     * @param readings readings of the weather from that day
     */
    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
        this.weatherReports.add(date, readings);
    }

    /**
     * given a month and year, find the average of the recorded temperatures from that month
     * @param month the month we are looking for
     * @param year the year we are looking for
     * @return the average of the temperature for that month
     */
    public double averageTempForMonth(int month, int year) {
        return this.weatherReports.monthAverage(month, year);
    }

    /**
     * find the total rainfall of a given month and year
     * @param month the month where we are looking for data
     * @param year the year where we are looking for data
     * @return the total rainfall for the month
     */
    public double totalRainfallForMonth(int month, int year) {
        return this.weatherReports.sumOfAllRainfall(month, year);
    }
}
