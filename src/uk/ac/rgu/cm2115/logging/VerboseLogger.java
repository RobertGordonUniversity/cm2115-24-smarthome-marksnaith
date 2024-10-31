package uk.ac.rgu.cm2115.logging;

public class VerboseLogger implements ILogger{

    private static VerboseLogger instance = null;

    public static VerboseLogger getInstance(){
        if(instance == null){
            instance = new VerboseLogger();
        }
        return instance;
    }

    private VerboseLogger(){

    }


    @Override
    public void log(String message) {
        System.out.println("Logged message: " + message);
    }
}
