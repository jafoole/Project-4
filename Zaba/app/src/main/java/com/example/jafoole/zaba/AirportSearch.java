package com.example.jafoole.zaba;

/**
 * Created by
 * /\     /\      __        _____              __                /\      /\
 * \ \    \ \     |__|____ _/ ____\____   ____ |  |   ____       / /     / /
 * \ \    \ \     |  \__  \\   __\/  _ \ /  _ \|  | _/ __ \     / /     / /
 * \ \    \ \     |  |/ __ \|  | (  <_> |  <_> )  |_\  ___/    / /     / /
 * \ \    \ \ /\__|  (____  /__|  \____/ \____/|____/\___  >  / /     / /
 * \/     \/  \______|    \/                             \/   \/      \/
 * on 3/28/16.
 */
public class AirportSearch {
    private String airportCode;
    private String airportName;
    private String cityName;
    private String countryName;

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "AirportSearch{" +
                "airportCode='" + airportCode + '\'' +
                ", airportName='" + airportName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
