/* Parent.java
Builder Pattern for Parent
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/

package za.ac.cput.domain.ParentDetails;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import za.ac.cput.domain.StudentDetails.Student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.util.Objects;

import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.PERSIST;

@Entity
public class Parent {
    @NotNull @Id private String parentID;
    @ManyToOne(cascade = {PERSIST, MERGE})
    @NotFound(action = NotFoundAction.IGNORE)
    private Student studentID;
    @NotNull private String parName;
    @NotNull private String parSurname;
    @NotNull private String cellNumber;
    @NotNull private String email;

    protected Parent() {
    }

    //====================================================
    //Private Constructor
    private Parent(Builder builder) {
        this.parentID = builder.parentID;
        this.studentID = builder.student;
        this.parName = builder.parName;
        this.parSurname = builder.parSurname;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }

    //====================================================
    //Getters


    public String getParentID() {
        return parentID;
    }

    public Student getStudent() {
        return studentID;
    }

    public String getParName() {
        return parName;
    }

    public String getParSurname() {
        return parSurname;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return parentID.equals(parent.parentID) && studentID.equals(parent.studentID) && parName.equals(parent.parName) && parSurname.equals(parent.parSurname) && cellNumber.equals(parent.cellNumber) && email.equals(parent.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentID, studentID, parName, parSurname, cellNumber, email);
    }

    //====================================================
    // toString


    @Override
    public String toString() {
        return "Parent{" +
                "parentID='" + parentID + '\'' +
                ", student=" + studentID +
                ", parName='" + parName + '\'' +
                ", parSurname='" + parSurname + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //====================================================
    // Builder Pattern
    public static class Builder {
        private String parentID;

        private Student student;
        private String parName;
        private String parSurname;
        private String cellNumber;
        private String email;

        public Parent.Builder setParentID(String parentID) {
            this.parentID = parentID;
            return this;
        }

        public Parent.Builder StudentDetails(Student student) {
            this.student = student;
            return this;
        }

        public Builder setParName(String parName) {
            this.parName = parName;
            return this;
        }

        public Builder setParSurname(String parSurname) {
            this.parSurname = parSurname;
            return this;
        }

        public Builder setCellNumber(String cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder copy(Parent parent) {
            this.parentID = parent.getParentID();
            this.student = parent.studentID;
            this.parName = parent.getParName();
            this.parSurname = parent.getParSurname();
            this.cellNumber = parent.getCellNumber();
            this.email = parent.getEmail();
            return this;
        }
        public Parent build() {
            return new Parent(this);
        }
    }
}
