package uk.ac.rgu.cm2115.devices.apple;

import uk.ac.rgu.cm2115.devices.Plug;

public class ApplePlug extends Plug{

    public ApplePlug(String name){
        super(name);
    }

    @Override
    public String getManufacturer() {
        return "Apple";
    }

}
