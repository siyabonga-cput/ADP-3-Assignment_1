/* StudentPrestigeFactory.java
    Factory for Student Prestige
    Author: Kegomoditswe Leshope - 219189048
    Date: 28 March 2022
*/
package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.StudentPrestige;

public class StudentPrestigeFactory {
    public static StudentPrestige createStudentPrestige(int prestigeId, int studentId, int academicId, int sportId, int cultureId, String prestigeType){
       StudentPrestige studentPrestige = new StudentPrestige.Builder().setPrestigeId(prestigeId)
               .setStudentId(studentId)
               .setAcademicId(academicId)
               .setSportId(sportId)
               .setCultureId(cultureId)
               .setPrestigeType(prestigeType)
               .build();
       return  studentPrestige;

    }


}
