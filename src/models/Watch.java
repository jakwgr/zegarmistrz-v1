package models;

import interfaces.Serviceable;

import java.time.LocalDate;


abstract public class Watch implements Serviceable {
    private final String manufacturer;
    private final String model;
    private final int yearOfProduction;
    private final String caliber;
    private double marketprice;
    private LocalDate lastService;
    private final String serialNumber;

    //constructor-getters-setters
    public Watch(String manufacturer, String model, String serialNumber, int yearOfProduction, String caliber, double marketprice, LocalDate lastService){
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.caliber = caliber;
        this.marketprice = marketprice;
        this.lastService = lastService;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCaliber() {
        return caliber;
    }

    public double getMarketprice() {
        return marketprice;
    }

    public LocalDate getLastService() {
        return lastService;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public void setMarketprice(double marketprice) {
        this.marketprice = marketprice;
    }

    public void setLastService(LocalDate lastService) {
        this.lastService = lastService;
    }

    //service checking method
    public abstract int getServiceInterval();

    @Override
    public boolean needsService() {
        return getLastService().plusMonths(getServiceInterval()).isBefore(LocalDate.now());
    };

    //print all watches and their service status
    @Override
    public String toString() {
        return "\nWatch informations: \nManufacturer - " + manufacturer + ",\n" +
                "Model - " + model + ",\n" +
                "Year Of Production - " + yearOfProduction + ",\n" +
                "Caliber - " + caliber + ",\n" +
                "Marketprice - " + marketprice + ",\n" +
                "Last Service - " + lastService + ",\n" +
                "Serial Number - " + serialNumber + ",\n";
    }
}
