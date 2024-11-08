package uk.ac.rgu.cm2115.logging;

import uk.ac.rgu.cm2115.ui.UIObserver;

public class SmartHomeLogger implements UIObserver{

    @Override
    public void update(String message) {
        System.out.println("Entered command: " + message);
    }
}
