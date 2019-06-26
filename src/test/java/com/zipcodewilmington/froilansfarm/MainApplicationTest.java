package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplicationTest {

    @Test
    public void simulateWeekTest(){
        String inputString = "yes\nstart\nwake up\nwake up\nwake up\nwake up\nwake up\nwake up\nwake up\nwake up\n";
        InputStream inputStream = new ByteArrayInputStream(inputString.getBytes());
        Console console = new Console(inputStream, System.out);
        MainApplication.simulateWeek(console);

    }
}
