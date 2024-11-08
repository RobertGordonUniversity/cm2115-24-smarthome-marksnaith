package uk.ac.rgu.cm2115;

import uk.ac.rgu.cm2115.devices.Device;
import uk.ac.rgu.cm2115.devices.Amazon.AmazonDeviceFactory;
import uk.ac.rgu.cm2115.logging.SmartHomeLogger;
import uk.ac.rgu.cm2115.ui.SmartHomeUI;

public class App {
    public static void main(String[] args){
        Hub hub = Hub.getInstance(new AmazonDeviceFactory());

        hub.addDevice("light", "Living room");
        hub.addDevice("thermostat", "Whole house");
        hub.addDevice("plug","laptop");

        Device[] devices = hub.getDevices();

        for(int i=0;i<devices.length;i++){
            if(devices[i]==null){
                break;
            }
            System.out.println(devices[i].getManufacturer() + ": " + devices[i]);
        }

        SmartHomeUI ui = new SmartHomeUI();
        ui.addObserver(hub);

        SmartHomeLogger logger = new SmartHomeLogger();
        ui.addObserver(logger);

        ui.getInput();        
    }
}
