package models;

import interfaces.Serviceable;

import java.time.LocalDate;


abstract public class Watch implements Serviceable {
    private String manufacturer;
    private String model;
    private int yearOfProduction;
    private String caliber;
    private double marketprice;
    private LocalDate lastService;
    private String serialNumber;

    public Watch(String manufacturer, String model, String serialNumber, int yearOfProduction, String caliber, double marketprice, LocalDate lastService){
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.caliber = caliber;
        this.marketprice = marketprice;
        this.lastService = lastService;
        this.serialNumber = serialNumber;
    }
    //----GETTERY
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
    //----SETTER

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setCaliber(String caliber) {
        this.caliber = caliber;
    }

    public void setMarketprice(double marketprice) {
        this.marketprice = marketprice;
    }

    public void setLastService(LocalDate lastService) {
        this.lastService = lastService;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public void service(){};

    @Override
    public boolean needsService(int months) {
        return getLastService().plusMonths(months).isBefore(LocalDate.now());
    };
}
