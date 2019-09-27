package com.company;
import java.awt.*;

public enum Country {
    USA,
    POLAND,
    BRAZIL,
    EGYPT;
    private final String continent;
}
    Country country; //Error:(11, 5) java: class, interface, or enum expected
	country = Country.USA;

            String name = "USA"; 
            Country country = Country.valueOf(name);
    }