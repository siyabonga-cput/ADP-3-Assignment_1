/*
Fees.java
Entity for Fees
Author: Tiffany Kiwiets (219322732)
 */
package za.ac.cput.Domain.Entity;

public class Fees {
    private int feeID;
    private int studentID;
    private int adminID;
    private int parentID;
    private double amount;


    private Fees(Builder builder) {
        this.feeID = builder.feeID;
        this.studentID = builder.studentID;
        this.adminID = builder.adminID;
        this.parentID = builder.parentID;
        this.amount = builder.amount;
    }

    public int getFeeID() {
        return feeID;
    }

    public void setFeeID(int feeID) {
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
        private int feeID;
        private int studentID;
        private int adminID;
        private int parentID;
        private double amount;

        public Fees.Builder setfeeID(int feeID) {
            this.feeID = feeID;
            return this;
        }

        public Fees.Builder setStudentID(int studentID) {
            this.studentID = studentID;
            return this;
        }

        public Fees.Builder setAdminID(int adminID) {
            this.adminID = adminID;
            return this;
        }

        public Fees.Builder setParentID(int parentID) {
            this.parentID = parentID;
            return this;
        }

        public Fees.Builder setAmount(double amount) {
            this.amount = amount;
            return this;
        }


        public Fees.Builder copy(Fees fees) {
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

