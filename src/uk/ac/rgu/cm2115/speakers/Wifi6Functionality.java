package uk.ac.rgu.cm2115.speakers;

public class Wifi6Functionality implements IWifiFunctionality{

    @Override
    public boolean connectWifi(String SSID, String password) {
        System.out.println("Connected to Wifi6");
        return true;
    }

}
