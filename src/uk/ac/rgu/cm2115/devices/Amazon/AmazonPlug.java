package uk.ac.rgu.cm2115.devices.Amazon;

import uk.ac.rgu.cm2115.devices.Plug;

public class AmazonPlug extends Plug{

    public AmazonPlug(String name){
        super(name);
    }

    @Override
    public String getManufacturer() {
        return "Amazon";
    }

}
