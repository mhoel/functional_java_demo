package domain;

import java.util.List;

/**
 * Created by mfhoel on 04.11.14.
 */
public class Office {
    Location location;
    List<Employee> employees;

    public Office(Location location, List<Employee> employees) {
        this.location = location;
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Office{" +
                "location=" + location +
                ", employees=" + employees +
                '}';
    }
}
