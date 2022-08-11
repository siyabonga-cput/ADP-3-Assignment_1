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
  public static Parent createParent (Student student,
                                     String parName,
                                     String parSurname,
                                     String cellNumber,
                                     String email) {
      String parentID = Helper.generateParentID();
      Parent parent = new Parent.Builder()
              .StudentDetails(student)
              .setParentID(parentID)
              .setParName(parName).
              setParSurname(parSurname).
              setCellNumber(cellNumber).
              setEmail(email).
              build();
      return parent;
  }
}
