package com.example.patterns.observer;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileObserver implements Obzerver{
    @Override
    public void handleEvent(int temp, int press) {
        String filename = "meteo.txt";
        File file = new File(filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try
        {
            Files.write(Path.of(filename),
                    ("Weather has changed: " + temp + " " + press + "\r\n")
                            .getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
