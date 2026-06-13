package models;

import enums.WindingType;

import java.time.LocalDate;
import java.util.Date;

public class MechanicalWatch extends Watch {

    private String powerReserve;
    private int jewels;
    private WindingType windingType;
    private final int serviceInterval = 72;

    //constructor-getters-setters
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

    //service checking method
    @Override
    public void service() {
        System.out.println("Watch " + getManufacturer() + " has been oiled and mainspring was changed\n");
        setLastService(LocalDate.now());
    }

    @Override
    public int getServiceInterval(){
        return serviceInterval;
    };

    //check watch winding
    private String manualOrAutomatic(){
        switch (windingType){
            case WindingType.MANUAL:
                return "Manual Winding";
            case WindingType.AUTOMATIC:
                return "Automatic Winding";
            default:
                return "";
        }
    }

    //print all watches and their service status
    @Override
    public String toString() {
        return super.toString() +
                "Power Reserve - " + powerReserve + ",\n" +
                "Jewels - " + jewels + ",\n" +
                "WindingType - " + manualOrAutomatic() + "\n";
    }
}
