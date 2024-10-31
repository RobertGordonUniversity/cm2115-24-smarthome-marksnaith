package uk.ac.rgu.cm2115.logging;


public class MinimalLogger implements ILogger{

    private static MinimalLogger instance = null;

    public static MinimalLogger getInstance(){
        if(instance == null){
            instance = new MinimalLogger();
        }
        return instance;
    }

    private MinimalLogger(){
        
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }

}
