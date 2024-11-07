package uk.ac.rgu.cm2115.speakers;

public class Wifi5Functionality implements IWifiFunctionality {

    @Override
    public boolean connectWifi(String SSID, String password) {
        System.out.println("Connecting to Wifi5");
        return true;
    }

    public void someMethod(){

    }
}
