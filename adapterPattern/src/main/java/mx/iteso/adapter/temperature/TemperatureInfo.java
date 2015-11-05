package mx.iteso.adapter.temperature;

// Target interface that will be implemented by our adapter.
// It defines actions that our adapter will perform.

public interface TemperatureInfo {

    double getTemperatureInFahrenheit();

    void setTemperatureInFahrenheit(double temperatureInFahrenheit);

    double getTemperatureInCelsius();

    void setTemperatureInCelsius(double temperatureInCelsius);

}
