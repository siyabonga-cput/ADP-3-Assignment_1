/* Transport.java
   Entity for the Transport
   Author: Raeesah Williams (219091498)
   Date: 30 March 2022
*/

package za.ac.cput.Domain.Entity;

public class Transport
{
    // constructors
    private String transportID;
    private String studentID;
    private String suppStaffID;
    private String typeOfTransport;

    //getters and setters

    public String getTransportID()
    {
        return transportID;
    }

    public void setTransportID(String transportID)
    {
        this.transportID = transportID;
    }

    public String getStudentID()
    {
        return studentID;
    }

    public void setStudentID(String studentID)
    {
        this.studentID = studentID;
    }

    public String getSuppStaffID()
    {
        return suppStaffID;
    }

    public void setSuppStaffID(String suppStaffID)
    {
        this.suppStaffID = suppStaffID;
    }

    public String getTypeOfTransport()
    {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport)
    {
        this.typeOfTransport = typeOfTransport;
    }

    // toString

    @Override
    public String toString() {
        return "Transport{" +
                "transportID=" + transportID +
                ", studentID=" + studentID +
                ", suppStaffID=" + suppStaffID +
                ", typeOfTransport='" + typeOfTransport + '\'' +
                '}';
    }

    // private constructors
    private Transport (Builder builder)
    {
        this.transportID = builder.transportID;
        this.studentID = builder.studentID;
        this.suppStaffID = builder.suppStaffID;
        this.typeOfTransport = builder.typeOfTransport;
    }

    // builder pattern
    public static class Builder
    {
        private String transportID;
        private String studentID;
        private String suppStaffID;
        private String typeOfTransport;

        public Builder setTransportID(String transportID) {
            this.transportID = transportID;
            return this;
        }

        public Builder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public Builder setSuppStaffID(String suppStaffID) {
            this.suppStaffID = suppStaffID;
            return this;
        }

        public Builder setTypeOfTransport(String typeOfTransport) {
            this.typeOfTransport = typeOfTransport;
            return this;
        }

        public Builder copy(Transport transport)
        {
            this.transportID = transport.getTransportID();
            this.studentID = transport.getStudentID();
            this.suppStaffID = transport.getSuppStaffID();
            this.typeOfTransport = transport.getTypeOfTransport();
            return this;
        }

        public Transport build()
        {
            return new Transport(this);
        }
    }
}
