package com.turgaydede.behavioral.mediator.flight;

public class AirportSimulation {
    public static void main(String[] args) {
        FlightControlMediator controlMediator = new FlightControlCenter();

        Aircraft passengerAircraft1 = new PassengerAircraft("Yolcu Uçağı 1", controlMediator);
        Aircraft passengerAircraft2 = new PassengerAircraft("Yolcu Uçağı 2", controlMediator);
        Aircraft cargoAircraft = new CargoAircraft("Kargo Uçağı", controlMediator);

        passengerAircraft1.requestLanding();
        cargoAircraft.requestLanding();
        passengerAircraft2.requestTakeOff();

        passengerAircraft1.completeLanding();
        cargoAircraft.completeLanding();
        passengerAircraft2.completeTakeOff();
    }
}
