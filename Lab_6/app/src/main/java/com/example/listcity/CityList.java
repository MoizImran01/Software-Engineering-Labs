package com.example.listcity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects.
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist.
     * @param city This is a candidate city to add.
     * @throws IllegalArgumentException if the city already exists in the list.
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities.
     * @return Return the sorted list.
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * This checks if a city object is present in the list.
     *
     * @param city This is the candidate city to search for
     * @return boolean True if the city is present, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }
    /**
     * This removes a city from the list.
     *
     * @param city This is the candidate city to remove
     * @throws IllegalArgumentException if the city is not in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City does not exist");
        }
        cities.remove(city);
    }
    /**
     * This returns the total count of cities in the list.
     *
     * @return int The total number of cities
     */
    public int countCities() {
        return cities.size();
    }
}
