package com.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pramod_dilshan on 8/29/18.
 */
public class ConcretePublisher implements Publisher {
    List<Subscriber> listOfSubscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber s) {
        listOfSubscribers.add(s);
    }

    @Override
    public void unsubscribe(Subscriber s) {
        listOfSubscribers.remove(s);
    }

    @Override
    public void start() {
        Scanner inputScanner = new Scanner(System.in);
        while(inputScanner.hasNextLine()){
            String input = inputScanner.nextLine();

            for (Subscriber s: listOfSubscribers) {
                s.receive(input);
            }
        }

   }
}
