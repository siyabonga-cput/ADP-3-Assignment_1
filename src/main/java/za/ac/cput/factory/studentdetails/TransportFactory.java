/* TransportFactory.java
   Factory class for Transport
   Author: Raeesah Williams (219091498)
   Date: 1 April 2022
*/
package za.ac.cput.factory.studentdetails;

import za.ac.cput.domain.studentdetails.Transport;
import za.ac.cput.util.Helper;

public class TransportFactory
{
    public static Transport Build(String transportID, String typeOfTransport)
    {
        Helper.isEmptyOrNull("transportID");
        Helper.isEmptyOrNull("typeOfTransport");

        Helper.CheckStringParm("transportID", transportID);
        Helper.CheckStringParm("typeOfTransport", typeOfTransport);

        return new Transport.Builder()
                .TransportID(transportID)
                .TypeOfTransport(typeOfTransport)
                .build();
    }
}