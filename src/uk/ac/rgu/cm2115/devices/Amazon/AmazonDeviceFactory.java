package uk.ac.rgu.cm2115.devices.Amazon;

import uk.ac.rgu.cm2115.devices.IDeviceFactory;
import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.Plug;
import uk.ac.rgu.cm2115.devices.Thermostat;

public class AmazonDeviceFactory implements IDeviceFactory{

    @Override
    public Light createLight(String name) {
        return new AmazonLight(name);
    }

    @Override
    public Plug createPlug(String name) {
        return new AmazonPlug(name);
    }

    @Override
    public Thermostat createThermostat(String name) {
        return new AmazonThermostat(name);
    }
}
