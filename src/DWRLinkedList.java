import sun.awt.image.ImageWatched;

import java.util.GregorianCalendar;
import java.util.LinkedList;

public class DWRLinkedList implements IWeatherSet {

    private LinkedList<DailyWeatherReport> dailyReports;

    public DWRLinkedList(LinkedList<DailyWeatherReport> dailyReports) {
        this.dailyReports = dailyReports;
    }

    /**
     * adds a given data set from a specific date to the list of reports
     * @param date date of the readings
     * @param readings list of readings from the given date
     */
    public void add(GregorianCalendar date, LinkedList<Reading> readings) {
        LinkedList<Double> temperatures = new LinkedList<>();
        LinkedList<Double> rainfalls = new LinkedList<>();
        for (Reading reading : readings) {
            temperatures.add(reading.getTemperature());
            rainfalls.add(reading.getRainfall());
        }
        dailyReports.add(new DailyWeatherReport(date, temperatures, rainfalls));
    }

    /**
     * Sums all of the data from the entirety of the month and year
     * @param month month of the readings we are looking for
     * @param year year of the readings we are looking for
     * @return sum from the entirety of the given date
     */
    public double sumOfAllRainfall(int month, int year) {
        double total = 0;
        for(DailyWeatherReport report : dailyReports) {
            if(report.dateEquals(month, year)) {
                total += report.sumOfRainfall();
            }
        }
        return total;
    }

    /**
     * finds the average temperature for a given month and year
     * @param month month we are looking for
     * @param year year we are looking for
     * @return the average temperature over the given month and year
     */
    public double monthAverage(int month, int year) {
        double total = 0;
        int accumulator = 0;
        for(DailyWeatherReport report : dailyReports) {
            if(report.dateEquals(month, year)) {
                total += report.dayTotalTemp();
                accumulator += report.dayTempCounter();
            }
        }
        return total / accumulator;
    }


}
