package com.example.task_3_2_JavaIO;

import java.io.*;


public class Serializator {

    public boolean searilization(Person person) throws FileNotFoundException {

        boolean flag = false;

        boolean newDirectory = new File("src/main/resources/persons").mkdirs();

        File file = new File("src/main/resources/persons/Person.date");

        ObjectOutputStream output = null;
        try {

            FileOutputStream str = new FileOutputStream(file);

            output = new ObjectOutputStream(str);
            output.writeObject(person);
            flag = true;

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }
}