package com.example.listcity;

/**
 * This is a class that defines a City.
 * @author Moiz Imran
 * @version 1.0
 */
public class City implements Comparable<City> {
/**
 * This is a private variable of type string.
 * It holds the city's name
 * */
    private String city;
    /**
     * This is a private variable of type string.
     * It holds the province's name to which the city belongs to
     * */
    private String province;
    /**
     * This is a constructor
     * @param city: represents city's name
     * @param province: represent's city's province
     * */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This is a getter method
     * @return city: returns city's name
     * */
String getCityName() {
    return this.city;
}
    /**
     * This is a getter method
     * @return province: returns city's province
     * */
    String getProvinceName() {
        return this.province;
    }
    /**
     * Compares this city to another city alphabetically by city name.
     * @param city The other city object to compare to.
     * @return A negative integer, zero, or positive integer as this city
     *         is less than, equal to, or greater than the specified city.
     */
    @Override

    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
    /**
     * Checks equality based on city name and province.
     * @param o The object to compare.
     * @return true if both city name and province name match.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return city.equals(city1.city) && province.equals(city1.province);
    }
    /**
     * Returns a hash code based on city name and province.
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return city.hashCode() + province.hashCode();
    }
}
