package models;

import enums.WindingType;

import java.time.LocalDate;
import java.util.Date;

public class MechanicalWatch extends Watch {

    String powerReserve;
    int jewels;
    WindingType windingType;


    public MechanicalWatch(String manufacturer, String model, String serialNumber, int yearOfProduction, String caliber, String powerReserve, int jewels, WindingType windingType, double marketprice, LocalDate lastService) {
        super(manufacturer, model, serialNumber, yearOfProduction, caliber, marketprice, lastService);
        this.powerReserve = powerReserve;
        this.jewels = jewels;
        this.windingType = windingType;
    }

    public WindingType getWindingType() {
        return windingType;
    }

    public void setWindingType(WindingType windingType) {
        this.windingType = windingType;
    }

    public String getPowerReserve() {
        return powerReserve;
    }

    public void setPowerReserve(String powerReserve) {
        this.powerReserve = powerReserve;
    }

    public int getJewels() {
        return jewels;
    }

    public void setJewels(int jewels) {
        this.jewels = jewels;
    }

    @Override
    public void service() {
        System.out.println("\nWatch " + getManufacturer() + " has been oiled and mainspring was changed");
        setLastService(LocalDate.now());
    }

    @Override
    public String toString() {
        return super.toString() +
                "Power Reserve - " + powerReserve + ",\n" +
                "Jewels - " + jewels + ",\n" +
                "WindingType - " + windingType + "\n";
    }
}
