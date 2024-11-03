package com.turgaydede.behavioral.mediator.flight;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FlightControlCenter implements FlightControlMediator {
    private Queue<Aircraft> aircraftQueue = new ArrayDeque<>();
    private boolean runwayAvailable = true;

    @Override
    public void requestLanding(Aircraft aircraft) {
        if (runwayAvailable) {
            System.out.println(aircraft.getName() + " iniş izni aldı.");
            runwayAvailable = false;
        } else {
            System.out.println(aircraft.getName() + " iniş için sıraya alındı.");
            aircraftQueue.add(aircraft);
        }
    }

    @Override
    public void requestTakeOff(Aircraft aircraft) {
        if (runwayAvailable) {
            System.out.println(aircraft.getName() + " kalkış izni aldı.");
            runwayAvailable = false;
        } else {
            System.out.println(aircraft.getName() + " kalkış için sıraya alındı.");
            aircraftQueue.add(aircraft);
        }
    }

    @Override
    public void notifyLandingComplete(Aircraft aircraft) {
        System.out.println(aircraft.getName() + " inişi tamamladı.");
        runwayAvailable = true;
        processNextAircraft();
    }

    @Override
    public void notifyTakeOffComplete(Aircraft aircraft) {
        System.out.println(aircraft.getName() + " kalkışı tamamladı.");
        runwayAvailable = true;
        processNextAircraft();
    }

    private void processNextAircraft() {
        if (!aircraftQueue.isEmpty()) {
            Aircraft nextAircraft = aircraftQueue.poll();
            if (nextAircraft.isLanding()) {
                requestLanding(nextAircraft);
            } else {
                requestTakeOff(nextAircraft);
            }
        }
    }
}
