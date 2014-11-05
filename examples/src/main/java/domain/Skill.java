package domain;

/**
 * Created by mfhoel on 04.11.14.
 */
public class Skill {
    String skillName;

    public Skill(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillName() {
        return skillName;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skillName='" + skillName + '\'' +
                '}';
    }
}
