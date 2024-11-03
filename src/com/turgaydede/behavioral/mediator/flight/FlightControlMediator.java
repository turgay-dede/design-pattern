package com.turgaydede.behavioral.mediator.flight;

public interface FlightControlMediator {
    void requestLanding(Aircraft aircraft);
    void requestTakeOff(Aircraft aircraft);
    void notifyLandingComplete(Aircraft aircraft);
    void notifyTakeOffComplete(Aircraft aircraft);
}
