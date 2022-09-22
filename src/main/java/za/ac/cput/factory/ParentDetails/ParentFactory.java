/* ParentFactory.java
Factory package for ParentFactory
Author: Marvin Peter Hope (219445842)
Date: 7 August 2022
*/

package za.ac.cput.factory.ParentDetails;

import za.ac.cput.domain.ParentDetails.Parent;
import za.ac.cput.domain.StudentDetails.Student;
import za.ac.cput.util.Helper;
public class ParentFactory {
  public static Parent build (String parentID, String parName, String parSurname, String cellNumber, String email, Student student) {

      Helper.isEmptyOrNull("parentID");
      Helper.isEmptyOrNull("parName");
      Helper.isEmptyOrNull("parSurname");
      Helper.isEmptyOrNull("cellNumber");
      Helper.isEmptyOrNull("email");
      Helper.isEmptyOrNull("student");

      Helper.CheckStringParm("parentID", parentID);
      Helper.CheckStringParm("parName", parName);
      Helper.CheckStringParm("parSurname", parSurname);
      Helper.CheckStringParm("cellNumber", cellNumber);
      Helper.CheckStringParm("email", email);

      return new Parent.Builder()
              .setParentID(parentID)
              .setParentID(parentID)
              .setParName(parName)
              .setParSurname(parSurname)
              .setCellNumber(cellNumber)
              .setEmail(email)
              .Student(student)
              .build();
  }
}