/* StudentPrestigeFactory.java
    Factory package for StudentPrestige
    Author: Kegomoditswe Leshope - 219189048
    Date: 7 August 2022
*/
package za.ac.cput.factory.StudentDetails;


import za.ac.cput.domain.StaffDetails.Subject;
import za.ac.cput.domain.StudentDetails.Culture;
import za.ac.cput.domain.StudentDetails.Sport;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.domain.StudentDetails.StudentPrestige;
import za.ac.cput.util.Helper;

public class StudentPrestigeFactory {
    public static StudentPrestige build(String prestigeId, String prestigeType, Student student, Sport sport, Culture culture, Subject subject){

        Helper.isEmptyOrNull("prestigeId");
        Helper.isEmptyOrNull("prestigeType");
        Helper.isEmptyOrNull("student");
        Helper.isEmptyOrNull("sport");
        Helper.isEmptyOrNull("culture");
        Helper.isEmptyOrNull("subject");

        Helper.CheckStringParm("prestigeId", prestigeId);
        Helper.CheckStringParm("prestigeType", prestigeType);

        return new StudentPrestige.Builder().prestigeId(prestigeId).prestigeType(prestigeType).student(student).sport(sport).culture(culture).build();

    }

}
