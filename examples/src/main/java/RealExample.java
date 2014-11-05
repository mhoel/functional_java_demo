import domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demo 4:
 * Attempting to demo what might be a real world example of imperative functional Java in light of the classical Java
 * declerative style
 * <p>
 * Created by mfhoel on 04.11.14.
 */
public class RealExample {

    public static void main(String[] args) {
        OfficeFactory factory = new OfficeFactory();

        List<Office> offices = Arrays.asList(
                factory.createOffice(Location.OSLO),
                factory.createOffice(Location.HAMAR),
                factory.createOffice(Location.TRONDHEIM)
        );

        offices.stream().map(Office::toString).forEach(System.out::println);

        imperative(offices);
        declerative(offices);
    }

    private static void declerative(List<Office> offices) {
        List<Employee> employees = new ArrayList<>();
        for (Office office : offices) {
            if (office.getLocation() == Location.OSLO) {
                for (Employee employee : office.getEmployees()) {
                    for (Skill skill : employee.getSkills()) {
                        if (skill.getSkillName().equals("Java")) {
                            employees.add(employee);
                            break;
                        }
                    }
                }
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void imperative(List<Office> offices) {
        Office office = offices.stream().filter(o -> o.getLocation() == Location.OSLO).findFirst().get();

        office.getEmployees().stream().filter(emp -> emp.getSkills().stream().anyMatch(s -> s.getSkillName().equals("Java")))
                .forEach(System.out::println);
    }
}
