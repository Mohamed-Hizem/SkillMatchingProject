package com.mohamedhizem.skillmatching;
import java.util.ArrayList;
import java.util.List;

public class SkillMatcher {
     private final List <String> requiredSkills;

     public SkillMatcher(List <String> requiredSkills) {
         this.requiredSkills = requiredSkills;
     }

     public void match(List <Employee> employees) {
         for (Employee employee : employees) {
             List<String> missingSkills = new ArrayList<>();
             for (String skill : requiredSkills) {
                 if (! employee.hasSkill(skill)) {
                     missingSkills.add(skill);
                 }
             }
             if (missingSkills.isEmpty()) {
                 System.out.println(employee.getName()+ " already has all required skills");
             }
             else {
                 System.out.println(employee.getName() + " needs training in " + missingSkills);
             }
         }
     }
}
