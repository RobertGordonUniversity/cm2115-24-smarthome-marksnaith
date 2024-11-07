package uk.ac.rgu.cm2115.speakers;

public class Bluetooth4Functionality implements IBluetoothFunctionality {

    @Override
    public boolean connectBluetooth() {
        System.out.println("Connected to BT4");
        return true;
    }

}
