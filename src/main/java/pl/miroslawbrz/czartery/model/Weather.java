package pl.miroslawbrz.czartery.model;

import lombok.Data;

@Data
public class Weather {

    private double minTemperature;
    private double maxTemperature;
    private double windSpeed;
    private double windDirection;
    private double humidity;
    private double cloudiness;
    private String weatherDescription;

}


