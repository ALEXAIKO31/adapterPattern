package mx.iteso.adapter.temperature.adapters;

import mx.iteso.adapter.temperature.CelsiusReporter;
import mx.iteso.adapter.temperature.TemperatureInfo;

// TemperatureObjectReporter is an object adapter.
// It is similar in functionality to TemperatureClassReporter,
// except that it utilizes composition for the CelciusReporter
// rather than inheritance.

public class TemperatureObjectReporter implements TemperatureInfo {

    CelsiusReporter celsiusReporter;

    public TemperatureObjectReporter() {
        celsiusReporter = new CelsiusReporter();
    }

    public double getTemperatureInFahrenheit() {
        return cToF(celsiusReporter.getTemperatureInCelsius());
    }

    public void setTemperatureInFahrenheit(double temperatureInFahrenheit) {
        celsiusReporter.setTemperatureInCelsius(fToC(temperatureInFahrenheit));
    }

    public double getTemperatureInCelsius() {
        return celsiusReporter.getTemperatureInCelsius();
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        celsiusReporter.setTemperatureInCelsius(temperatureInCelsius);
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }

}
