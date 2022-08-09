/*
Fees.java
Entity for Fees
Author: Tiffany Kiwiets (219322732)
*/

package za.ac.cput.domain.ParentDetails;

import org.hibernate.annotations.*;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.domain.Admin.Admin;
import za.ac.cput.domain.ParentDetails.Parent;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Fees {
    @NotNull @Id private String feeID;
    private Student studentID;
    private Admin adminID;
    private Parent parentID;
    @NotNull private double amount;

    //Private constructor
    private Fees(Builder builder) {
        this.feeID = builder.feeID;
        this.studentID = builder.studentID;
        this.adminID = builder.adminID;
        this.parentID = builder.parentID;
        this.amount = builder.amount;
    }

    //getters
    public String getFeeID() {
        return feeID;
    }
//

    public int getStudentID() {
        return studentID;
    }

    public int getadminID() {
        return adminID;
    }

    public int getParentID() {
        return parentID;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fees fees = (Fees) o;
        return feeID.equals(fees.feeID) && studentID.equals(fees.studentID) && adminID.equals(fees.adminID)
                && parentID.equals(fees.parentID) && amount.equals(fees.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeID, studentID, adminID, parentID, amount);
    }

    @Override
    public String toString() {
        return "Fees{" +
                "feeID=" + feeID +
                ", studentID=" + studentID +
                ", adminID=" + adminID +
                ", parentID=" + parentID +
                ", amount=" + amount +
                '}';
    }

    public static class Builder {
        private String feeID;
        private int studentID;
        private int adminID;
        private int parentID;
        private double amount;

        public Builder setfeeID(String feeID) {
            this.feeID = feeID;
            return this;
        }

        public Builder setStudentID(int studentID) {
            this.studentID = studentID;
            return this;
        }

        public Builder setAdminID(int adminID) {
            this.adminID = adminID;
            return this;
        }

        public Builder setParentID(int parentID) {
            this.parentID = parentID;
            return this;
        }

        public Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }


        public Builder copy(Fees fees) {
            this.feeID = fees.getFeeID();
            this.studentID = fees.getStudentID();
            this.adminID = fees.getadminID();
            this.parentID = fees.getParentID();
            this.amount = fees.getAmount();
            return this;
        }

        public Fees build() { return new Fees( this); }

    }
}

