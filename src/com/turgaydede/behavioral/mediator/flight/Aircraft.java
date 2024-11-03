package com.turgaydede.behavioral.mediator.flight;

public abstract class Aircraft {
    protected FlightControlMediator controlMediator;
    protected String name;
    protected boolean landing;

    public Aircraft(String name, FlightControlMediator controlMediator) {
        this.name = name;
        this.controlMediator = controlMediator;
    }

    public String getName() {
        return name;
    }

    public boolean isLanding() {
        return landing;
    }

    public abstract void requestLanding();
    public abstract void requestTakeOff();
    public abstract void completeLanding();
    public abstract void completeTakeOff();
}
