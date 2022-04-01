/*
SupportStaff.java
Entity for Support staff
Author: Tiffany Kiwiets (219322732)
 */

package za.ac.cput.Domain.Entity;

public class SupportStaff {
    private int suppStaffID;
    private int adminID;
    private String suppStaffName;
    private String suppStaffSurname;
    private int cellNumber;
    private String importHealthInfo;
    private String qualification;
    private String typeOfWork;

    private SupportStaff(Builder builder) {
        this.suppStaffID = builder.suppStaffID;
        this.adminID = builder.adminID;
        this.suppStaffName = builder.suppStaffName;
        this.suppStaffSurname = builder.suppStaffSurname;
        this.cellNumber = builder.cellNumber;
        this.importHealthInfo = builder.importHealthInfo;
        this.qualification = builder.qualification;
        this.typeOfWork = builder.typeOfWork;
    }

    public int getSuppStaffID() { return suppStaffID; }

    public void setSuppStaffID(int suppStaffID) { this.suppStaffID = suppStaffID; }

    public int getAdminID() { return adminID; }

    public void setAdminID(int adminID) { this.adminID = adminID; }

    public String getSuppStaffName() { return suppStaffName; }

    public void setSuppStaffName(String suppStaffName) { this.suppStaffName = suppStaffName; }

    public String getSuppStaffSurname() { return suppStaffSurname; }

    public void setSuppStaffSurname(String suppStaffSurname) { this.suppStaffSurname = suppStaffSurname; }

    public int getCellNumber() { return cellNumber; }

    public void setCellNumber(int cellNumber) { this.cellNumber = cellNumber; }

    public String getImportHealthInfo() { return importHealthInfo; }

    public void setImportHealthInfo(String importHealthInfo) { this.importHealthInfo = importHealthInfo; }

    public String getQualification() { return qualification; }

    public void setQualification(String qualification) { this.qualification = qualification; }

    public String getTypeOfWork() { return typeOfWork; }

    public void setTypeOfWork(String typeOfWork) { this.typeOfWork = typeOfWork; }

    @Override
    public String toString() {
        return "SupportStaff{" +
                "suppStaffID=" + suppStaffID +
                ", adminID=" + adminID +
                ", suppStaffName='" + suppStaffName + '\'' +
                ", suppStaffSurname='" + suppStaffSurname + '\'' +
                ", cellNumber=" + cellNumber +
                ", importHealthInfo='" + importHealthInfo + '\'' +
                ", qualification='" + qualification + '\'' +
                ", typeOfWork='" + typeOfWork + '\'' +
                '}';
    }

    public static class Builder {
        private int suppStaffID;
        private int adminID;
        private String suppStaffName;
        private String suppStaffSurname;
        private int cellNumber;
        private String importHealthInfo;
        private String qualification;
        private String typeOfWork;

        public Builder setSuppStaffID(int suppStaffID) {
            this.suppStaffID = suppStaffID;
            return this;
        }

        public Builder setAdminID(int adminID) {
            this.adminID = adminID;
            return this;
        }

        private Builder suppStaffName(String suppStaffID) {
            this.suppStaffName = suppStaffName;
            return this;
        }

        public Builder suppStaffSurname(String suppStaffSurname) {
            this.suppStaffSurname = suppStaffSurname;
            return  this;
        }

        public Builder cellNumber(int cellNumber) {
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder importHealthInfo(String importHealthInfo) {
            this.importHealthInfo = importHealthInfo;
            return this;
        }

        public Builder qualification(String qualification) {
            this.qualification = qualification;
            return this;
        }

        public Builder typeOfWork(String typeOfWork) {
            this.typeOfWork = typeOfWork;
            return this;
        }

        public Builder copy(SupportStaff supportStaff) {
            this.suppStaffID = supportStaff.getSuppStaffID();
            this.adminID = supportStaff.getAdminID();
            this.suppStaffName = supportStaff.getSuppStaffName();
            this.suppStaffSurname = supportStaff.getSuppStaffSurname();
            this.cellNumber = supportStaff.getCellNumber();
            this.importHealthInfo = supportStaff.getImportHealthInfo();
            this.qualification = supportStaff.getQualification();
            this.typeOfWork = supportStaff.getTypeOfWork();
            return this;
        }
        public SupportStaff build() { return new SupportStaff( this); }

    }

}

