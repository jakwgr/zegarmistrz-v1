package models;

import java.time.LocalDate;
import java.util.Date;

public class QuartzWatch extends Watch{
    String battery;

    public QuartzWatch(String manufacturer, String model, String serialNumber, int yearOfProduction, String caliber, String battery, double marketprice, LocalDate lastService) {
        super(manufacturer, model, serialNumber, yearOfProduction, caliber, marketprice, lastService);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public void service() {
        System.out.println("\nBattery has been changed in " + getManufacturer() + " watch");
        setLastService(LocalDate.now());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Battery - " + battery + "\n";
    }
}
