///*
//Fees.java
//Entity for Fees
//Author: Tiffany Kiwiets (219322732)
//*/
//
////// You just require admins ID
//
//package za.ac.cput.domain.ParentDetails;
//
//import com.sun.istack.NotNull;
//import org.hibernate.annotations.NotFound;
//import org.hibernate.annotations.NotFoundAction;
//import za.ac.cput.domain.StudentDetails.Student;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//import static javax.persistence.CascadeType.MERGE;
//import static javax.persistence.CascadeType.PERSIST;
//
//@Entity
//public class Fees implements Serializable {
//    @NotNull
//    @Id
//    private String feeID;
//    @ManyToOne(cascade = {PERSIST, MERGE})
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Student studentID;
//    //    private Admin adminID;
//    @ManyToOne(cascade = {PERSIST, MERGE})
//    @NotFound(action = NotFoundAction.IGNORE)
//    private Parent parentID;
//    @NotNull private double amount;
//
//    protected Fees() {
//    }
//
//    //Private constructor
//    private Fees(Builder builder) {
//        this.feeID = builder.feeID;
//        this.studentID = builder.studentID;
////        this.adminID = builder.adminID;
//        this.parentID = builder.parentID;
//        this.amount = builder.amount;
//    }
//
//    //getters
//
//
//    public String getFeeID() {
//        return feeID;
//    }
//
//    public Student getStudentID() {
//        return studentID;
//    }
//
//    public Parent getParentID() {
//        return parentID;
//    }
//
//    public double getAmount() {
//        return amount;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fees fees = (Fees) o;
//        return Double.compare(fees.amount, amount) == 0 && feeID.equals(fees.feeID) && studentID.equals(fees.studentID) && parentID.equals(fees.parentID);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(feeID, studentID, parentID, amount);
//    }
//
//    @Override
//    public String toString() {
//        return "Fees{" +
//                "feeID='" + feeID + '\'' +
//                ", studentID=" + studentID +
//                ", parentID=" + parentID +
//                ", amount=" + amount +
//                '}';
//    }
//
//    public static class Builder {
//        private String feeID;
//        private Student studentID;
//      //  private int adminID;
//        private Parent parentID;
//        private double amount;
//
//        public Builder setfeeID(String feeID) {
//            this.feeID = feeID;
//            return this;
//        }
//
//        public Builder setStudentID(Student studentID) {
//            this.studentID = studentID;
//            return this;
//        }
//
////        public Builder setAdminID(int adminID) {
////            this.adminID = adminID;
////            return this;
////        }
//
//        public Builder setParentID(Parent parentID) {
//            this.parentID = parentID;
//            return this;
//        }
//
//        public Builder setAmount(double amount) {
//            this.amount = amount;
//            return this;
//        }
//
//
//        public Builder copy(Fees fees) {
//            this.feeID = fees.getFeeID();
//            this.studentID = fees.getStudentID();
////            this.adminID = fees.getadminID();
//            this.parentID = fees.getParentID();
//            this.amount = fees.getAmount();
//            return this;
//        }
//
//        public Fees build() { return new Fees( this); }
//
//    }
//
//
//}
