package mx.iteso.adapter.temperature.adapters;

import mx.iteso.adapter.temperature.CelsiusReporter;
import mx.iteso.adapter.temperature.TemperatureInfo;

// TemperatureClassReporter is a class adapter.
// It extends CelciusReporter (the adaptee) and implements TemperatureInfo (the target interface).
// If a temperature is in Celcius, TemperatureClassReporter utilizes the temperatureInC value from CelciusReporter.
// Fahrenheit requests are internally handled in Celcius.

public class TemperatureClassReporter extends CelsiusReporter implements TemperatureInfo {

    public double getTemperatureInFahrenheit() {
        return cToF(temperatureInCelsius);
    }

    public void setTemperatureInFahrenheit(double temperatureInFahrenheit) {
        this.temperatureInCelsius = fToC(temperatureInFahrenheit);
    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }

}
