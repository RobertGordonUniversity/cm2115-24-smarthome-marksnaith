package uk.ac.rgu.cm2115.devices;

public abstract class Plug extends Device implements ISwitch{

    private boolean on;

    public Plug(String name) {
        super(name);
    }

    public void switchOn(){
        this.on = true;
        System.out.println(this.name + " plug is switched on");
    }

    public void switchOff(){
        this.on = false;
        System.out.println(this.name + " plug is switched off");
    }

    @Override
    public String getStatus() {
        if(this.on){
            return this.toString() + " is on";
        }else{
            return this.toString() + " is off";
        }
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

}
