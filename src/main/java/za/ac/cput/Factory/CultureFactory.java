/* CultureFactory.java
    Factory for Culture
    Author: Kegomoditswe Leshope - 219189048
    Date: 28 March 2022
*/
package za.ac.cput.Factory;

import za.ac.cput.Domain.Entity.Culture;

public class CultureFactory {
    public static Culture createCulture(int cultureId, int studentId, String cultureType){
        Culture culture = new Culture.Builder().setCultureId(cultureId)
                .setStudentId(studentId)
                .setCultureType(cultureType)
                .build();
        return culture;
    }
}
