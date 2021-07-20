package observer;

import jdk.swing.interop.SwingInterOpUtils;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatDisplay heatDisplay = new HeatDisplay(weatherData);

        System.out.println("*****   WEATHER DISPLAY  *****");
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        System.out.println("*****   WEATHER DISPLAY  *****");
        weatherData.setMeasurements(82,70,29.2f);
        System.out.println();
        System.out.println("*****   WEATHER DISPLAY  *****");
        weatherData.setMeasurements(78,90,29.2f);
    }
}
