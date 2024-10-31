package uk.ac.rgu.cm2115.devices;

public abstract class Device {

    protected String name;

    public Device(String name){
        this.name = name;
    }

    @Override
    public final String toString(){
        return name + " " + this.getClass().getSimpleName();
    }

    public abstract String getStatus();

    public abstract void accept(DeviceVisitor visitor);

}
