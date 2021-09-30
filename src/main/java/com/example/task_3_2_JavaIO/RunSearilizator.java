package com.example.task_3_2_JavaIO;

import java.io.FileNotFoundException;

public class RunSearilizator {
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Serghei");
        person.setLastName("Bejenari");
        person.setAddress("Chisinau");
        person.setAge(23);
        person.setGender('M');

        Serializator serializator = new Serializator();
        try {
            serializator.searilization(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}