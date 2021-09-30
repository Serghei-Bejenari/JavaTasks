package com.example.OOP.interfaceExample;

public class RunSmartHome {

    public static void main(String[] args) {

        SmartHome arduino = new SmartHome();
        arduino.openDoor();
        arduino.closeDoor();

        Closing closing = new Closing() {
            @Override
            public void closeDoor() {
                System.out.println("Attention dor is closing");
            }
        };

        closing.closeDoor();
    }
}