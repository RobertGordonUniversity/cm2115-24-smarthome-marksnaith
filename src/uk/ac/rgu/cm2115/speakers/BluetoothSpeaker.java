package uk.ac.rgu.cm2115.speakers;

public class BluetoothSpeaker extends Speaker implements IBluetoothCapable{

    IBluetoothFunctionality bt;

    public BluetoothSpeaker(String name, IBluetoothFunctionality bt){
        super(name);
        this.bt = bt;
    }

    @Override
    public boolean connectBluetooth() {
        return this.bt.connectBluetooth();    
    }
}
