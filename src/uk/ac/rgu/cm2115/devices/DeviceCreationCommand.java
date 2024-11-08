package uk.ac.rgu.cm2115.devices;

/**
 * Functional interface for wrapping device creation methods
 * Allows factory methods to be mapped to device types
 */
public interface DeviceCreationCommand {
    public Device create(String name);
}
