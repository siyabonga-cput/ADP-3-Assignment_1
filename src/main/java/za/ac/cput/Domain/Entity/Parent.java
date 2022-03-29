/* Parent.java
Builder Pattern for Parent
Author: Marvin Peter Hope (219445842)
Date: 28 March 2022
*/

package za.ac.cput.Domain.Entity;

public class Parent {
    private int parentID;
    private int studentID;
    private String parName;
    private String parSurname;
    private String cellNumber;
    private String email;

    //====================================================
    //Private Constructor
    private Parent(Builder builder) {
        this.parentID = builder.parentID;
        this.studentID = builder.studentID;
        this.parName = builder.parName;
        this.parSurname = builder.parSurname;
        this.cellNumber = builder.cellNumber;
        this.email = builder.email;
    }

    //====================================================
    //Getters and Setters
    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    public String getParSurname() {
        return parSurname;
    }

    public void setParSurname(String parSurname) {
        this.parSurname = parSurname;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //====================================================
    // toString
    @Override
    public String toString() {
        return "Parent{" +
                "parentID=" + parentID +
                ", studentID=" + studentID +
                ", parName='" + parName + '\'' +
                ", parSurname='" + parSurname + '\'' +
                ", cellNumber='" + cellNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //====================================================
    // Builder Pattern
    public static class Builder {
        private int parentID;
        private int studentID;
        private String parName;
        private String parSurname;
        private String cellNumber;
        private String email;

        public Builder setParentID(int parentID) {
            this.parentID = parentID;
            return this;
        }

        public Builder setStudentID(int studentID) {
            this.studentID = studentID;
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
            this.studentID = parent.getStudentID();
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
