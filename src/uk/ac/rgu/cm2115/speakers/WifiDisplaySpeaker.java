package uk.ac.rgu.cm2115.speakers;

public class WifiDisplaySpeaker extends Speaker implements IWifiCapable, IDisplayCapable {

    private IWifiFunctionality wifi;
    private IDisplayFunctionality display;

    public WifiDisplaySpeaker(String name, IWifiFunctionality wifi, IDisplayFunctionality display){
        super(name);
        this.wifi = wifi;
        this.display = display;
    }

    @Override
    public void show(String content) {
        // delegate to the IDisplayFunctionality object
        this.display.show(content);
    }

    @Override
    public boolean connectWifi(String SSID, String password) {
        // delegate to  the IWifiFunctionality object
        return this.wifi.connectWifi(SSID, password);
    }
}
