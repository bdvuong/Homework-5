import java.util.GregorianCalendar;
import java.util.LinkedList;

public class WeatherMonitor {

    LinkedList<DailyWeatherReport> weatherReports;

    public WeatherMonitor() {
        this.weatherReports = new LinkedList<>();
    }


    /**
     * Adds a daily report to the list of reports
     * @param date date of the report
     * @param readings readings of the weather from that day
     */
    public void addDailyReport(GregorianCalendar date, LinkedList<Reading> readings) {
        LinkedList<Double> temperatures = new LinkedList<>();
        LinkedList<Double> rainfalls = new LinkedList<>();
        for (Reading reading : readings) {
            temperatures.add(reading.temperature);
            rainfalls.add(reading.temperature);
        }
        this.weatherReports.add(new DailyWeatherReport(date, temperatures, rainfalls));
    }

    /**
     * given a month and year, find the average of the recorded temperatures from that month
     * @param month the month we are looking for
     * @param year the year we are looking for
     * @return the average of the temperature for that month
     */
    public double averageTempForMonth(int month, int year) {
        for (DailyWeatherReport report : this.weatherReports) {
            if (report.date.get(GregorianCalendar.YEAR) == year) {
                if (report.date.get(GregorianCalendar.MONTH) == month) {
                    double avg = 0;
                    for (double temp : report.tempReadings) {
                        avg += temp;
                    }
                    return avg / report.tempReadings.size();
                }
            }
        }
        return 0;
    }

    /**
     * find the total rainfall of a given month and year
     * @param month the month where we are looking for data
     * @param year the year where we are looking for data
     * @return the total rainfall for the month
     */
    public double totalRainfallForMonth(int month, int year) {
        for (DailyWeatherReport report : this.weatherReports) {
            if (report.date.get(GregorianCalendar.YEAR) == year) {
                if (report.date.get(GregorianCalendar.MONTH) == month) {
                    double totalRainfall = 0;
                    for (double rainfall : report.rainReadings) {
                        totalRainfall += rainfall;
                    }
                    return totalRainfall;
                }
            }
        }
        return 0;
    }
}
