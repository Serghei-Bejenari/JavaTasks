package com.example.task_3_2_JavaIO;

import java.io.*;

public class Deserializator {

    public Person deserialization() throws InvalidObjectException {
        File file = new File("src/main/resources/persons/Person.date");
        ObjectInputStream inputObj = null;

        try {
            FileInputStream inputFile = new FileInputStream(file);

            inputObj = new ObjectInputStream(inputFile);
            Person person = (Person) inputObj.readObject();
            return person;

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputObj.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object fail");
    }

}