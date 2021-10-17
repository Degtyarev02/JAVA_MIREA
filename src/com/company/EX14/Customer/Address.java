package com.company.EX14.Customer;

public final class Address {

    private static final Address EMPTY_ADDRESS = new Address();

    private final String cityName;
    private final String streetName;
    private final int zipCode;
    private final int buildingNumber;
    private final int apartmentNumber;
    private final char buildingLetter;

    public Address(String cityName, String streetName, int zipCode, int buildingNumber, int apartmentNumber, char buildingLetter) {
        this.cityName = cityName;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.buildingNumber = buildingNumber;
        this.apartmentNumber = apartmentNumber;
        this.buildingLetter = buildingLetter;
    }

    public Address() {
        this.cityName = "cityName";
        this.streetName = "streetName";
        this.zipCode = 0;
        this.buildingNumber = 0;
        this.apartmentNumber = 0;
        this.buildingLetter = 'l';
    }

    public String getCityName() {
        return cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public char getBuildingLetter() {
        return buildingLetter;
    }
}
