package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDelete() {
        CustomList list = new CustomList();
        City c = new City("Edmonton", "AB");
        list.addCity(c);
        list.removeCity(c);
        assertFalse(list.hasCity(c));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(1, list.citiesCount());
        City c = new City("England", "IsMyCity");
        list.addCity(c);
        assertEquals(2, list.citiesCount());
        list.removeCity(c);
        assertEquals(1, list.citiesCount());
    }
}
