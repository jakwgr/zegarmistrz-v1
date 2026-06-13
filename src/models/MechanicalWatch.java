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
}
