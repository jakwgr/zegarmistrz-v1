package models;

import java.time.LocalDate;
import java.util.Date;

public class QuartzWatch extends Watch{
    private String battery;
    private final int serviceInterval = 24;

    //constructor-getters-setters
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

    //service checking method
    @Override
    public int getServiceInterval(){
        return serviceInterval;
    };

    @Override
    public void service() {
        System.out.println("Battery has been changed in " + getManufacturer() + " watch\n");
        setLastService(LocalDate.now());
    }

    //print all watches and their service status
    @Override
    public String toString() {
        return super.toString() +
                "Battery - " + battery + "\n";
    }
}
