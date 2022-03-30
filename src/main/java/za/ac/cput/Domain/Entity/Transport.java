/*

 */
package za.ac.cput.Domain.Entity;

public class Transport
{
    // constructors
    private int transportID;
    private int studentID;
    private int suppStaffID;
    private String typeOfTransport;

    //getters and setters

    public int getTransportID()
    {
        return transportID;
    }

    public void setTransportID(int transportID)
    {
        this.transportID = transportID;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }

    public int getSuppStaffID()
    {
        return suppStaffID;
    }

    public void setSuppStaffID(int suppStaffID)
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
        private int transportID;
        private int studentID;
        private int suppStaffID;
        private String typeOfTransport;

        public Builder setTransportID(int transportID) {
            this.transportID = transportID;
            return this;
        }

        public Builder setStudentID(int studentID) {
            this.studentID = studentID;
            return this;
        }

        public Builder setSuppStaffID(int suppStaffID) {
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
