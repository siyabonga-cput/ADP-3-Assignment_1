///*
//SupportStaff.java
//Entity for Support staff
//Author: Tiffany Kiwiets (219322732)
// */
//
//package za.ac.cput.domain.StaffDetails;
//
//import za.ac.cput.domain.Admin.Admin;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.validation.constraints.NotNull;
//import java.util.Objects;
//
//@Entity
//public class SupportStaff {
//    @NotNull @Id
//    private String suppStaffID;
//    private int adminID;
//    @NotNull private String suppStaffName;
//    @NotNull private String suppStaffSurname;
//    @NotNull private int cellNumber;
//    @NotNull private String importHealthInfo;
//    @NotNull private String qualification;
//    @NotNull private String typeOfWork;
//
//    //Private constructor
//    private SupportStaff(Builder builder) {
//        this.suppStaffID = builder.suppStaffID;
//        this.adminID = builder.adminID;
//        this.suppStaffName = builder.suppStaffName;
//        this.suppStaffSurname = builder.suppStaffSurname;
//        this.cellNumber = builder.cellNumber;
//        this.importHealthInfo = builder.importHealthInfo;
//        this.qualification = builder.qualification;
//        this.typeOfWork = builder.typeOfWork;
//    }
//
//    public String getSuppStaffID() { return suppStaffID; }
//
//    public int getAdminID() { return adminID; }
//
//    public String getSuppStaffName() { return suppStaffName; }
//
//    public String getSuppStaffSurname() { return suppStaffSurname; }
//
//    public int getCellNumber() { return cellNumber; }
//
//    public String getImportHealthInfo() { return importHealthInfo; }
//
//    public String getQualification() { return qualification; }
//
//    public String getTypeOfWork() { return typeOfWork; }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SupportStaff supportStaff = (SupportStaff) o;
//        return suppStaffID.equals(supportStaff.suppStaffID) && adminID.equals(supportStaff.adminID) && suppStaffName.equals(supportStaff.suppStaffName)
//                && suppStaffSurname.equals(supportStaff.suppStaffSurname) && cellNumber.equals(supportStaff.cellNumber) && importHealthInfo.equals(supportStaff.importHealthInfo)
//                && qualification.equals(supportStaff.qualification) && typeOfWork.equals(supportStaff.typeOfWork);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(suppStaffID, adminID, suppStaffName, suppStaffSurname, cellNumber, importHealthInfo, qualification, typeOfWork);
//    }
//
//    @Override
//    public String toString() {
//        return "SupportStaff{" +
//                "suppStaffID=" + suppStaffID +
//                ", adminID=" + adminID +
//                ", suppStaffName='" + suppStaffName + '\'' +
//                ", suppStaffSurname='" + suppStaffSurname + '\'' +
//                ", cellNumber=" + cellNumber +
//                ", importHealthInfo='" + importHealthInfo + '\'' +
//                ", qualification='" + qualification + '\'' +
//                ", typeOfWork='" + typeOfWork + '\'' +
//                '}';
//    }
//
//    public static class Builder {
//        private String suppStaffID;
//        private int adminID;
//        private String suppStaffName;
//        private String suppStaffSurname;
//        private int cellNumber;
//        private String importHealthInfo;
//        private String qualification;
//        private String typeOfWork;
//
//        public Builder setSuppStaffID(String suppStaffID) {
//            this.suppStaffID = suppStaffID;
//            return this;
//        }
//
//        public Builder setAdminID(int adminID) {
//            this.adminID = adminID;
//            return this;
//        }
//
//        public Builder setSuppStaffName(String suppStaffName) {
//            this.suppStaffName = suppStaffName;
//            return this;
//        }
//
//        public Builder setSuppStaffSurname(String suppStaffSurname) {
//            this.suppStaffSurname = suppStaffSurname;
//            return  this;
//        }
//
//        public Builder setCellNumber(int cellNumber) {
//            this.cellNumber = cellNumber;
//            return this;
//        }
//
//        public Builder setImportHealthInfo(String importHealthInfo) {
//            this.importHealthInfo = importHealthInfo;
//            return this;
//        }
//
//        public Builder setQualification(String qualification) {
//            this.qualification = qualification;
//            return this;
//        }
//
//        public Builder setTypeOfWork(String typeOfWork) {
//            this.typeOfWork = typeOfWork;
//            return this;
//        }
//
//        public Builder copy(SupportStaff supportStaff) {
//            this.suppStaffID = supportStaff.getSuppStaffID();
//            this.adminID = supportStaff.getAdminID();
//            this.suppStaffName = supportStaff.getSuppStaffName();
//            this.suppStaffSurname = supportStaff.getSuppStaffSurname();
//            this.cellNumber = supportStaff.getCellNumber();
//            this.importHealthInfo = supportStaff.getImportHealthInfo();
//            this.qualification = supportStaff.getQualification();
//            this.typeOfWork = supportStaff.getTypeOfWork();
//            return this;
//        }
//        public SupportStaff build() { return new SupportStaff( this); }
//
//    }
//
//}
//
