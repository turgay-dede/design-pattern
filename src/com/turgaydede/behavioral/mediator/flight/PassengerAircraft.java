package com.turgaydede.behavioral.mediator.flight;

public class PassengerAircraft extends Aircraft {

    public PassengerAircraft(String name, FlightControlMediator controlMediator) {
        super(name, controlMediator);
    }

    @Override
    public void requestLanding() {
        landing = true;
        System.out.println(name + " iniş yapmak istiyor.");
        controlMediator.requestLanding(this);
    }

    @Override
    public void requestTakeOff() {
        landing = false;
        System.out.println(name + " kalkış yapmak istiyor.");
        controlMediator.requestTakeOff(this);
    }

    @Override
    public void completeLanding() {
        controlMediator.notifyLandingComplete(this);
    }

    @Override
    public void completeTakeOff() {
        controlMediator.notifyTakeOffComplete(this);
    }
}
