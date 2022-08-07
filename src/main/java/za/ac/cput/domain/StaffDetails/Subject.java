/* Subject.java
Builder Pattern for Subject
Author: Jayden Johnson (219086796)
Date: 7 August 2022
*/

package za.ac.cput.domain.StaffDetails;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Subject {
    @NotNull
    @Id
    private String subjectID;
    @NotNull
    private String modules;
    @NotNull
    private double subAverage;
    @NotNull
    private double stuAverage;

    protected Subject(){

    }

    private Subject(Builder builder){
        this.subjectID = builder.subjectID;
        this.modules = builder.modules;
        this.subAverage = builder.subAverage;
        this.stuAverage = builder.stuAverage;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getModules() {
        return modules;
    }

    public double getSubAverage() {
        return subAverage;
    }

    public double getStuAverage() {
        return stuAverage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Double.compare(subject.subAverage, subAverage) == 0 && Double.compare(subject.stuAverage, stuAverage) == 0 && subjectID.equals(subject.subjectID) && modules.equals(subject.modules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectID, modules, subAverage, stuAverage);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectID=" + subjectID +
                ", modules='" + modules + '\'' +
                ", subAverage=" + subAverage +
                ", stuAverage=" + stuAverage +
                '}';
    }

    public static class Builder{
        private String subjectID;
        private String modules;
        private double subAverage;
        private double stuAverage;

        public Subject.Builder setSubjectID(String subjectID) {
            this.subjectID = subjectID;
            return this;
        }

        public Subject.Builder setModules(String modules) {
            this.modules = modules;
            return this;
        }

        public Subject.Builder setSubAverage(double subAverage) {
            this.subAverage = subAverage;
            return this;
        }

        public Subject.Builder setStuAverage(double stuAverage) {
            this.stuAverage = stuAverage;
            return this;
        }

        public Builder copy(Subject subject){
            this.subjectID = subject.getSubjectID();
            this.modules = subject.getModules();
            this.subAverage = subject.getSubAverage();
            this.stuAverage = subject.getStuAverage();
            return this;
        }
        public Subject build(){
            return new Subject( this);
        }
    }
}

