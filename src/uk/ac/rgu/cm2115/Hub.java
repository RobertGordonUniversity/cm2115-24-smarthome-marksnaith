package uk.ac.rgu.cm2115;

import uk.ac.rgu.cm2115.devices.Device;
import uk.ac.rgu.cm2115.devices.DeviceVisitor;
import uk.ac.rgu.cm2115.devices.Light;
import uk.ac.rgu.cm2115.devices.Plug;
import uk.ac.rgu.cm2115.devices.Thermostat;
import uk.ac.rgu.cm2115.logging.ILogger;
import uk.ac.rgu.cm2115.speakers.Speaker;

public class Hub implements DeviceVisitor {

    private static Hub instance = null;

    public static Hub getInstance(){
        if(instance == null){
            instance = new Hub();
        }
        return instance;
    }

    private ILogger logger = null;


    private Device[] devices;
    private int numDevices;

    private Speaker[] speakers;
    private int numSpeakers;

    private String[] userCommands;
    private Command[] commands;
    private int numCommands;

    private Hub(){
        this.devices = new Device[50];
        this.numDevices = 0;

        this.speakers = new Speaker[50];
        this.numSpeakers = 0;

        this.userCommands = new String[10];
        this.commands = new Command[10];
        this.numCommands = 0;
    }

    public void addDevice(Device device){
        if(numDevices < this.devices.length){
            this.devices[this.numDevices] = device;

            /* We now want to add this device's commands
             * This uses the visitor pattern - our Device abstract class
             * has been updated with an abstract method that accepts a DeviceVisitor
             * A DeviceVisitor is an interface with visit methods that accept each
             * specific type of device as a parameter.
             * We've made this class (Hub) implement DeviceVisitor, so the device
             * can accept this as its parameter
             */
            this.devices[this.numDevices].accept(this);

             this.numDevices++;
        }
    }

    public void addSpeaker(Speaker speaker){
        if(this.numSpeakers < this.speakers.length){
            this.speakers[this.numSpeakers] = speaker;
            this.numSpeakers++;
        }
    }

    public void addCommand(String text, Command command){
        if(this.numCommands < this.commands.length){
            this.userCommands[this.numCommands] = text;
            this.commands[this.numCommands] = command;
            this.numCommands++;
        }
    }

    public void executeCommand(String command){
        int index = -1;
        for(int i=0;i<this.userCommands.length;i++){
            if(command.equalsIgnoreCase(this.userCommands[i])){
                index = i;
            }
        }

        if(index != -1){
            this.commands[index].execute();

            /* if there's a logger...log! */
            if(this.logger != null){
                this.logger.log("Executed command: " + command);
            }
        }
    }

    public Device[] getDevices(){
        return this.devices;
    }

    public Speaker[] getSpeakers(){
        return this.speakers;
    }

    /** 
     * Below are the visit methods for specific types of device
     * When this hub is passed to the accept() method of a device (see addDevice() above),
     * the relevant specific visit() method below is called depending on the type of device
     */

    @Override
    public void visit(Light light) {
        /* We know a light can be turned on and off, and dimmed up and down */
        this.addCommand("Switch on " + light, light::switchOn);
        this.addCommand("Switch off " + light, light::switchOff);
        this.addCommand("Dim up " + light, light::dimUp);
        this.addCommand("Dim down " + light, light::dimDown);
    }

    @Override
    public void visit(Thermostat thermostat) {
        /* A thermostat can be adjusted up and down */
        this.addCommand("Turn up " + thermostat, thermostat::turnUp);
        this.addCommand("Turn down " + thermostat, thermostat::turnDown);
    }

    @Override
    public void visit(Plug plug) {
        /* A plug can be switched on and off */
        this.addCommand("Switch on " + plug, plug::switchOn);
        this.addCommand("Switch off " + plug, plug::switchOff);       
    }

    public void setLogger(ILogger logger){
        this.logger = logger;
    }
}
