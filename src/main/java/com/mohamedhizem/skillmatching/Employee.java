package com.mohamedhizem.skillmatching;
import java.util.List;

public class Employee {
    private final String name;
    private final List <String> skills;

    public Employee(String name, List <String> skills) {
        this.name = name;
        this.skills = skills;
    }
    public String getName() {
        return name;
    }
    public List <String> getSkills() {
        return skills;
    }
    public boolean hasSkill (String skill) {
        return skills.contains(skill);
    }
}
