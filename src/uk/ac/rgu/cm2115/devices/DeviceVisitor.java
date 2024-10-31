package uk.ac.rgu.cm2115.devices;

public interface DeviceVisitor {

    /* A visit method is required for each specific type of device */
    public void visit(Light light);
    public void visit(Thermostat thermostat);
    public void visit(Plug plug);
}
