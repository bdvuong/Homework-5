import static org.junit.Assert.assertEquals;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;

public class Examples {


    public Examples(){

        //TEMPS

        LinkedList<Double> temp = new LinkedList<Double>();

        LinkedList<Double> temp1 = new LinkedList<Double>();
        temp1.add(31.2);
        temp1.add(32.6);
        temp1.add(33.0);
        temp1.add(32.7);
        temp1.add(30.3);
        temp1.add(29.5);

        LinkedList<Double> temp2 = new LinkedList<Double>();
        temp2.add(32.2);
        temp2.add(32.2);
        temp2.add(32.2);
        temp2.add(32.2);
        temp2.add(32.2);
        temp2.add(32.2);

        LinkedList<Double> temp3 = new LinkedList<Double>();
        temp3.add(0.0);
        temp3.add(0.0);
        temp3.add(0.0);

        LinkedList<Double> temp4 = new LinkedList<Double>();
        temp4.add(-12.4);
        temp4.add(-11.3);
        temp4.add(-12.3);
        temp4.add(-13.4);
        temp4.add(-15.6);
        temp4.add(-14.2);

        //RAINFALL

        LinkedList<Double> rainfall = new LinkedList<Double>();

        LinkedList<Double> rainfall1 = new LinkedList<Double>();
        rainfall1.add(1.2);
        rainfall1.add(2.3);
        rainfall1.add(1.5);

        LinkedList<Double> rainfall2 = new LinkedList<Double>();
        rainfall2.add(2.2);
        rainfall2.add(1.6);
        rainfall2.add(1.4);
        rainfall2.add(2.1);
        rainfall2.add(2.3);
        rainfall2.add(3.1);

        LinkedList<Double> rainfall3 = new LinkedList<Double>();
        rainfall3.add(3.2);
        rainfall3.add(2.5);
        rainfall3.add(1.3);
        rainfall3.add(2.1);
        rainfall3.add(2.3);
        rainfall3.add(3.6);

        LinkedList<Double> rainfall4 = new LinkedList<Double>();
        rainfall4.add(5.2);
        rainfall4.add(6.5);
        rainfall4.add(3.3);
        rainfall4.add(4.1);
        rainfall4.add(2.9);
        rainfall4.add(6.6);

        LinkedList<Double> rainfall5 = new LinkedList<Double>();
        rainfall5.add(0.2);
        rainfall5.add(0.5);
        rainfall5.add(0.3);
        rainfall5.add(0.1);
        rainfall5.add(0.9);
        rainfall5.add(0.6);

        LinkedList<Double> rainfall6 = new LinkedList<Double>();
        rainfall6.add(0.0);
        rainfall6.add(0.0);
        rainfall6.add(0.0);
        rainfall6.add(0.0);


        //DAILY WEATHER REPORTS

        DailyWeatherReport DWR1 = new DailyWeatherReport(new GregorianCalendar(2020, 2 , 1) , temp1 , rainfall1);
        DailyWeatherReport DWR2 = new DailyWeatherReport(new GregorianCalendar(2020, 2 , 2) , temp2 , rainfall2);
        DailyWeatherReport DWR3 = new DailyWeatherReport(new GregorianCalendar(2020, 2 , 3) , temp3 , rainfall3);
        DailyWeatherReport DWR4 = new DailyWeatherReport(new GregorianCalendar(2020, 2 , 4) , temp4 , rainfall4);
        DailyWeatherReport DWR5 = new DailyWeatherReport(new GregorianCalendar(2018, 2 , 1) , temp1 , rainfall1);
        DailyWeatherReport DWR6 = new DailyWeatherReport(new GregorianCalendar(2020, 3 , 1) , temp1 , rainfall1);
        DailyWeatherReport DWR7 = new DailyWeatherReport(new GregorianCalendar(2020, 2 , 1) , temp , rainfall1);
        DailyWeatherReport DWR8 = new DailyWeatherReport(new GregorianCalendar(2020, 2 , 1) , temp1 , rainfall);


        //WEATHER REPORT LISTS

        //RP1
        ReportList1.add(DWR1);
        ReportList1.add(DWR2);
        ReportList1.add(DWR3);
        ReportList1.add(DWR4);

//		ReportList1ADDED

        //RL2
        ReportList2.add(DWR1);

        //RL3
        ReportList3.add(DWR5);
        ReportList3.add(DWR2);

        //RL4
        ReportList4.add(DWR1);
        ReportList4.add(DWR2);
        ReportList4.add(DWR5);
        ReportList4.add(DWR6);

        //RL5
        ReportList5.add(DWR8);


        //RL6
        ReportList6.add(DWR7);


        // Reading List for addDailyReport() tests

        Reading reading1 = new Reading(new Time(5 , 24), 31.0, 2.5);
        Reading reading2 = new Reading(new Time(5 , 47), 32.0, 2.5);
        Reading reading3 = new Reading(new Time(6 , 6), 33.0, 2.5);
        Reading reading4 = new Reading(new Time(6 , 24), 34.0, 2.5);
        Reading reading5 = new Reading(new Time(7 , 23), 35.0, 2.5);
        Reading reading6 = new Reading(new Time(7 , 55), 36.0, 2.5);


        readingList.add(reading1);
        readingList.add(reading2);
        readingList.add(reading3);
        readingList.add(reading4);
        readingList.add(reading5);
        readingList.add(reading6);

    }

    LinkedList<Reading> readingList = new LinkedList<Reading>();

    LinkedList<DailyWeatherReport> ReportList1 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> ReportList2 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> ReportList3 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> ReportList4 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> ReportList5 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> ReportList6 = new LinkedList<DailyWeatherReport>();

    //LISTS OF DailyWeatherReports
    DWRLinkedList LDWR1 = new DWRLinkedList(ReportList1);
    DWRLinkedList LDWR2 = new DWRLinkedList(ReportList2);
    DWRLinkedList LDWR3 = new DWRLinkedList(ReportList3);
    DWRLinkedList LDWR4 = new DWRLinkedList(ReportList4);
    DWRLinkedList LDWR5 = new DWRLinkedList(ReportList5);
    DWRLinkedList LDWR6 = new DWRLinkedList(ReportList6);

    //WEATHER MONITORS
    WeatherMonitor WM1 = new WeatherMonitor(LDWR1);
    WeatherMonitor WM2 = new WeatherMonitor(LDWR2);
    WeatherMonitor WM3 = new WeatherMonitor(LDWR3);
    WeatherMonitor WM4 = new WeatherMonitor(LDWR4);
    WeatherMonitor WM5 = new WeatherMonitor(LDWR5);
    WeatherMonitor WM6 = new WeatherMonitor(LDWR6);






    @Test
    public void averageTempTest()
    {
        assertEquals(WM2.averageTempForMonth(2, 2020), 31.55, 0.1);
    }

    @Test
    public void totalRainfallTest()
    {
        assertEquals(WM1.totalRainfallForMonth(2, 2020), 61.3, 0.1);
    }

    @Test
    public void addedDailyReportAvgTempTest()
    {
        WM2.addDailyReport(new GregorianCalendar(2020, 2 , 10), readingList);
        assertEquals(WM2.averageTempForMonth(2, 2020), 32.53, 0.1);
    }

    @Test
    public void addedDailyReportRainfallTest()
    {
        WM1.addDailyReport(new GregorianCalendar(2020, 2 , 10), readingList);

        assertEquals(WM1.totalRainfallForMonth(2, 2020), 76.3, 0.1);
    }

    @Test
    public void wrongDateAvgTempTest()
    {
        assertEquals(WM4.averageTempForMonth(2, 2020), 31.88, 0.1);
    }

    @Test
    public void wrongDateRainfallTest()

    {
        assertEquals(WM4.totalRainfallForMonth(2, 2020), 17.7, 0.1);
    }
}
