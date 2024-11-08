package uk.ac.rgu.cm2115.devices;

public interface IDeviceFactory {

    /* Because the devices have common base functionality
     * we can use classes instead of interfaces - but we've made the
     * classes abstract, so we now always need to use
     * manufacturer-specific devices
     * 
     * We also provide a String parameter to each method
     * because our devices have a mandatory name parameter
     * in their constructors
     */
    public Light createLight(String name);
    public Plug createPlug(String name);
    public Thermostat createThermostat(String name);

}
