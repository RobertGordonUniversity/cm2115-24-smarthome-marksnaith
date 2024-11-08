package uk.ac.rgu.cm2115.devices.apple;

import uk.ac.rgu.cm2115.devices.IDeviceFactory;
import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.Plug;
import uk.ac.rgu.cm2115.devices.Thermostat;

public class AppleDeviceFactory implements IDeviceFactory{

    @Override
    public Light createLight(String name) {
        return new AppleLight(name);
    }

    @Override
    public Plug createPlug(String name) {
        return new ApplePlug(name);
    }

    @Override
    public Thermostat createThermostat(String name) {
        return new AppleThermostat(name);
    }

}