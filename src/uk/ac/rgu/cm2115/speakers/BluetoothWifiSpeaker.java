package uk.ac.rgu.cm2115.speakers;

public class BluetoothWifiSpeaker extends Speaker implements IBluetoothCapable, IWifiCapable {

    private IBluetoothFunctionality bluetooth;
    private IWifiFunctionality wifi;

    public BluetoothWifiSpeaker(String name, IBluetoothFunctionality bluetooth, IWifiFunctionality wifi){
        super(name);
        this.bluetooth = bluetooth;
        this.wifi = wifi;
    }

    @Override
    public boolean connectWifi(String SSID, String password) {
        // delegate to the IWifiFunctionality object
        return this.wifi.connectWifi(SSID, password);
    }

    @Override
    public boolean connectBluetooth() {
        // deleted to the IBluetoothFunctionality object
        return this.bluetooth.connectBluetooth();
    }

}
