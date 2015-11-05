package mx.iteso.adapter.temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;

public class TemperatureAdapterDemo {

    public static void main(String[] args) {

        // class adapter
        System.out.println("Class Adapter Test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);

        // object adapter
        System.out.println("\nObject Adapter Test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);

    }

    public static void testTempInfo(TemperatureInfo tempInfo) {
        tempInfo.setTemperatureInCelsius(0);
        System.out.println("Temperature in Celsius:" + tempInfo.getTemperatureInCelsius());
        System.out.println("Temperature in Fahrenheit:" + tempInfo.getTemperatureInFahrenheit());

        tempInfo.setTemperatureInFahrenheit(85);
        System.out.println("Temperature in Celsius:" + tempInfo.getTemperatureInCelsius());
        System.out.println("Temperature in Fahrenheit:" + tempInfo.getTemperatureInFahrenheit());
    }

}
