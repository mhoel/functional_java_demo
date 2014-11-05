package domain;

import java.util.List;

/**
 * Created by mfhoel on 04.11.14.
 */
public class Employee {
    private String name;
    private List<Skill> skills;

    public Employee(String name, List<Skill> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
