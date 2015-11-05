package mx.iteso.temperature;

import mx.iteso.adapter.temperature.TemperatureInfo;
import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 04/11/2015.
 */
public class TemperatureAdapterTest {

    TemperatureInfo temperatureInfoClass;
    TemperatureInfo temperatureInfoObject;

    @Test
    public void testTemperatureAdapter(){
        temperatureInfoClass = new TemperatureClassReporter();
        temperatureInfoObject = new TemperatureObjectReporter();
        temperatureInfoObject.setTemperatureInCelsius(20);
        temperatureInfoClass.setTemperatureInCelsius(20);
        assertEquals(temperatureInfoClass.getTemperatureInCelsius(),20, 1);
        assertEquals(temperatureInfoClass.getTemperatureInFahrenheit(),68,1);
        assertEquals(temperatureInfoClass.getTemperatureInCelsius(), temperatureInfoObject.getTemperatureInCelsius(), 1);
        assertEquals(temperatureInfoClass.getTemperatureInFahrenheit(),temperatureInfoObject.getTemperatureInFahrenheit(),1);
        temperatureInfoObject.setTemperatureInFahrenheit(86);
        temperatureInfoClass.setTemperatureInFahrenheit(86);
        assertEquals(temperatureInfoClass.getTemperatureInCelsius(),30, 1);
        assertEquals(temperatureInfoClass.getTemperatureInFahrenheit(),86,1);
        assertEquals(temperatureInfoClass.getTemperatureInCelsius(),temperatureInfoObject.getTemperatureInCelsius(),1);
        assertEquals(temperatureInfoClass.getTemperatureInFahrenheit(),temperatureInfoObject.getTemperatureInFahrenheit(),1);

    }
}
