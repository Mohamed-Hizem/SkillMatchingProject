package com.mohamedhizem.skillmatching;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> requiredSkills = Arrays.asList( "Excel", "Java", "Python" );

        Employee e1 = new Employee("Sara", Arrays.asList("Excel","SAP"));
        Employee e2 = new Employee("John", Arrays.asList("Java","Python","SQL","Excel"));
        Employee e3 = new Employee("Samuel", Arrays.asList("Java","Python"));

        SkillMatcher matcher = new SkillMatcher(requiredSkills);
        matcher.match(Arrays.asList(e1,e2,e3));
    }
}
