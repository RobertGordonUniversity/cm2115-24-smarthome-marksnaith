package uk.ac.rgu.cm2115.devices;

public abstract class Light extends Device implements ISwitch, IDim, IColour{

    private boolean on;
    private int level;
    private int r, g, b;

    public Light(String name) {
        super(name);
        // set rgb to be bright white
        this.r = 255;
        this.g = 255;
        this.b = 255;
    }

    public void switchOn(){
        this.on = true;
        this.level = 3;
        System.out.println(this.name + " light is switched on");
    }

    public void switchOff(){
        this.on = false;
        this.level = 0;
        System.out.println(this.name + " light is switched off");
    }

    public void dimUp(){
        this.level++;
        System.out.println(this.name + " light is dimmed up");
    }

    public void dimDown(){
        if(this.level > 0){
            this.level--;
        }
        System.out.println(this.name + " light is dimmed down");
    }

    @Override
    public String getStatus() {
        if(this.on){
            return this.toString() + " is on (level " + this.level + ")";
        }else{
            return this.toString() + " is of (level " + this.level + ")";
        }
    }

    @Override
    public void setColour(int r, int g, int b) {
        if(r >=0 && r <= 255){
            this.r = r;
        }

        if(g >=0 && g <= 255){
            this.g = g;
        }

        if(g >=0 && g <= 255){
            this.g = g;
        }
    }

    @Override
    public int getR() {
       return this.r;
    }

    @Override
    public int getG() {
        return this.g;
    }

    @Override
    public int getB() {
        return this.b;
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }
}
