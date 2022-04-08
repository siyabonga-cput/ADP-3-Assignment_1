/*
Fees.java
Entity for Fees
Author: Tiffany Kiwiets (219322732)
 */
package za.ac.cput.Domain.Entity;

public class Fees {
    private String feeID;
    private int studentID;
    private int adminID;
    private int parentID;
    private double amount;

    //Private constructor
    private Fees(Builder builder) {
        this.feeID = builder.feeID;
        this.studentID = builder.studentID;
        this.adminID = builder.adminID;
        this.parentID = builder.parentID;
        this.amount = builder.amount;
    }

    public String getFeeID() {
        return feeID;
    }

    public void setFeeID(String feeID) {
        this.feeID = feeID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getadminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
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

