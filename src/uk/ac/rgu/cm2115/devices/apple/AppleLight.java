package uk.ac.rgu.cm2115.devices.apple;

import uk.ac.rgu.cm2115.devices.Light;

public class AppleLight extends Light {

    public AppleLight(String name){
        super(name);
    }

    @Override
    public String getManufacturer() {
        return "Apple";
    }

}
