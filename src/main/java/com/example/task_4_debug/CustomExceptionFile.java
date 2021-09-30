package com.example.task_4_debug;

import java.io.FileNotFoundException;

public class CustomExceptionFile extends FileNotFoundException {

    public CustomExceptionFile() {
        super("Error! Wrong operator! Result is undefined");
    }
}