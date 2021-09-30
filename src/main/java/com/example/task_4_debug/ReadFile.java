package com.example.task_4_debug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private static Logger logger = LoggerFactory.getLogger(ReadFile.class);

    public static void readFile() throws IOException {

        try {
            File file = new File("src/main/resources/operator_and_operation.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            while (line != null) {
                logger.info("line from file {}", line);
                String[] line1 = line.split(",");
                try {
                    logger.info(Calculator.calculation(line1[0], line1[1], line1[2]));
                } catch (Exception e) {
                    logger.warn("Wrong number input! Result is undefined!");
                }
                line = reader.readLine();
            }
        } catch (CustomExceptionFile e) {
            logger.warn("File Not Found! Please verify entered path!");
            e.printStackTrace();
        } catch (CustomExceptionIO e) {
            logger.warn("You can't read a closed file!");
            e.printStackTrace();
        }

    }

}