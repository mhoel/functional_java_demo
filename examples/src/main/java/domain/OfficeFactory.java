package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mfhoel on 04.11.14.
 */
public class OfficeFactory {

    public Office createOffice(Location location) {
        Office office = new Office(Location.OSLO, createEmployees(location));
        return office;
    }

    private List<Employee> createEmployees(Location location) {
        switch (location) {
            case OSLO:
                return Arrays.asList(
                        new Employee("Kari", Arrays.asList(new Skill("Java"), new Skill("Spring"))),
                        new Employee("Ole", Arrays.asList(new Skill("JavaScript"), new Skill("CSS"))),
                        new Employee("Gunnar", Arrays.asList(new Skill("Scala"), new Skill("Java")))

                );
            case TRONDHEIM:
                return Arrays.asList(
                        new Employee("Kari", Arrays.asList(new Skill("Scala"))),
                        new Employee("Petter", Arrays.asList(new Skill("JavaScript")))

                );
            case HAMAR:
                return Arrays.asList(
                        new Employee("Kjell", Arrays.asList(new Skill("Java"))),
                        new Employee("Gudrund", Arrays.asList(new Skill("JavaScript")))

                );
            default:
                return new ArrayList<>();
        }
    }


}
