package com.example.task_4_debug;

import java.io.IOException;

public class CustomExceptionIO extends IOException {

    public CustomExceptionIO(String message) {
        super(message);
    }
}