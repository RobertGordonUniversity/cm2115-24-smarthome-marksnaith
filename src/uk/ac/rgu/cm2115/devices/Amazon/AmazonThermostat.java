package uk.ac.rgu.cm2115.devices.Amazon;

import uk.ac.rgu.cm2115.devices.Thermostat;

public class AmazonThermostat extends Thermostat{

    public AmazonThermostat(String name){
        super(name);
    }

    @Override
    public String getManufacturer() {
        return "Amazon";
    }

}