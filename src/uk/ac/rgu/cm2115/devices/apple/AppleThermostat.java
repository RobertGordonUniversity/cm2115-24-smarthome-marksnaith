package uk.ac.rgu.cm2115.devices.apple;

import uk.ac.rgu.cm2115.devices.Thermostat;

public class AppleThermostat extends Thermostat {

    public AppleThermostat(String name){
        super(name);
    }

    @Override
    public String getManufacturer() {
        return "Apple";
    }

}
