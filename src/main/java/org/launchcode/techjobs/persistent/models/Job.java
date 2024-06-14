package org.launchcode.techjobs.persistent.models;




import jakarta.persistence.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
public class Job extends AbstractEntity {




    @ManyToOne
    private Employer employer;

    @ManyToMany
    @JoinTable(
            name = "job_skill",
            joinColumns = @JoinColumn(name = "job_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )

    private List<Skill> skills;


    public Job() {
    }



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Job(Employer employer, List<Skill> skills) {
        this.employer = employer;
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }



    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
