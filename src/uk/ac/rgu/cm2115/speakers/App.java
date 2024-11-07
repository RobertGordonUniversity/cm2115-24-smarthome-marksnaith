package uk.ac.rgu.cm2115.speakers;

public class App {
    public static void main(String[] args) {
        Bluetooth4Functionality bt = new Bluetooth4Functionality();
        Wifi5Functionality wifi = new Wifi5Functionality();

        BluetoothWifiSpeaker speaker1 = new BluetoothWifiSpeaker("BTWIFI", bt, wifi);

        speaker1.connectBluetooth();
        speaker1.connectWifi("SSID", "PASSWORD");

        BluetoothSpeaker speaker2 = new BluetoothSpeaker("BT speaker", bt);
        speaker2.connectBluetooth();

    }
}
