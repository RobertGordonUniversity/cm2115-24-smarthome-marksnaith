package uk.ac.rgu.cm2115;

import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.Plug;
import uk.ac.rgu.cm2115.devices.Thermostat;

public class App {
    public static void main(String[] args){
        Hub hub = Hub.getInstance();

        Light light = new Light("Living room");
        Thermostat therm = new Thermostat("Whole house");
        Plug plug = new Plug("Laptop");

        hub.addDevice(light);
        hub.addDevice(therm);
        hub.addDevice(plug);

        hub.executeCommand("Switch on Living room light");
        hub.executeCommand("Turn down whole house thermostat");
        hub.executeCommand("Dim down Living room light");
        hub.executeCommand("Switch off laptop plug");
    }
}
