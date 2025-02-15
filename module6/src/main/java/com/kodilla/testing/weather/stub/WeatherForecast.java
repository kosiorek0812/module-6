package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }
    public Double getAverageTemperature() {
        System.out.println(temperatures.getTemperatures().entrySet().stream());
        return temperatures.getTemperatures().values().stream().mapToDouble(aDouble -> aDouble).average().orElse(0);
    }
    public Double findMedian() {
        List valueList = new ArrayList<String>();
        valueList.addAll(temperatures.getTemperatures().values());
        valueList.sort(Comparator.naturalOrder());

        return (Double) valueList.get(valueList.size() / 2);
    }

}