package uk.ac.rgu.cm2115.devices;

public class Thermostat extends Device implements IAdjustable{

    private int temperature;

    public Thermostat(String name) {
        super(name);
    }

    public void turnUp(){
        if(temperature < 30){ // some code to stop the thermostat going too high
            temperature++;
        }
        System.out.println(this.name + " thermostat is turned up");
    }

    public void turnDown(){
        if(temperature > 0){ // some code to stop the thermostat going too low
            temperature++;
        }
        System.out.println(this.name + " thermostat is turned down");
    }

    @Override
    public String getStatus() {
        return this.toString() + " temperature: " + this.temperature;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

}
