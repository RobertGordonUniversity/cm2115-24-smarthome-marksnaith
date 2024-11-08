package uk.ac.rgu.cm2115.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class SmartHomeUI {

    private ArrayList<UIObserver> observers = new ArrayList<>();

    public void addObserver(UIObserver observer) {
        this.observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (int i = 0; i < this.observers.size(); i++) {
            this.observers.get(i).update(message);
        }
    }

    public void getInput() {
        Scanner in = new Scanner(System.in);

        /* Wrapping the prompt in while(true) then break-ing when "exit"
         * is entered will keep the application running to accept more commands
         */
        while (true) {
            System.out.print("What do you want to do? ");
            
            String input = in.nextLine();
            this.notifyObservers(input);            

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }
        in.close();
    }
}
