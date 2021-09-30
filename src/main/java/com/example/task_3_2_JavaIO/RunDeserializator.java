package com.example.task_3_2_JavaIO;

import java.io.InvalidObjectException;

public class RunDeserializator {
    public static void main(String[] args) {
        Deserializator deserializator = new Deserializator();
        try {
            Person person = deserializator.deserialization();
            System.out.println("Name: " + person.getFirstName());
            System.out.println("LastName: " + person.getLastName());
            System.out.println("Address: " + person.getAddress());
            System.out.println("PostalCode: " + person.getPostalCode());
            System.out.println("Age: " + person.getAge());
            System.out.println("Gender: " + person.getGender());

        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

    }
}