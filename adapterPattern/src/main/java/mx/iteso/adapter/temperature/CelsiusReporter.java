package mx.iteso.adapter.temperature;

// Adaptee class named CelsiusReporter. It stores a temperature value in Celsius.

public class CelsiusReporter {

    protected double temperatureInCelsius;

    public CelsiusReporter() {

    }

    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }

    public void setTemperatureInCelsius(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }

}
