package com.company.EX12.Task2;

import java.util.Arrays;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String building;
    String apartNum;
    public Address(String address){
        String[] arrAddress = address.split("\\,");
        country = arrAddress[0];
        region = arrAddress[1];
        city = arrAddress[2];
        street = arrAddress[3];
        house = arrAddress[4];
        building = arrAddress[5];
        apartNum = arrAddress[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartNum='" + apartNum + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("Russia,Moscow region,Moscow,Glavmosstroya,5,3,43");
        Address address1 = new Address("Russia,Kirov region,Kirov,Agronomicheskaya,9,-,65");
        Address address2 = new Address("Russia,Penza region,Penza,Lenina,32,3,342");
        System.out.println(address);
        System.out.println(address1);
        System.out.println(address2);
    }
}
