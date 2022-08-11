/* Culture.java
   Entity for Culture
   Author: Kegomoditswe Leshope - 219189048
   Date: 7 August 2022
*/

package za.ac.cput.domain.StudentDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


@Entity
public class Culture {

    @Id
    @Column(name = "culture_id")
    private String cultureId;
    @NotNull private int studentId;
    @NotNull private String cultureType;

    protected Culture(){
    }

    //private constructor
   private Culture(Builder builder){
       this.cultureId = builder.cultureId;
       this.studentId = builder.studentId;
       this.cultureType = builder.cultureType;
   }

    //getters
    public String getCultureId() {
        return cultureId;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCultureType() {
        return cultureType;
    }

    //toString
    @Override
    public String toString() {
       return "Culture{" +
               "cultureId=" + cultureId +
                ", studentId=" + studentId +
                ", cultureType='" + cultureType + '\'' +
                '}';
   }

    //builder pattern
   public static class Builder {
        private String cultureId;
        private int studentId;
        private String cultureType;

        public Builder setCultureId(String cultureId) {
            this.cultureId = cultureId;
            return this;
        }

        public Builder setStudentId(int studentId) {
            this.studentId = studentId;
            return this;
       }

        public Builder setCultureType(String cultureType) {
            this.cultureType = cultureType;
            return this;
        }

        public Builder copy (Culture culture){
           this.cultureId = culture.cultureId;
            this.studentId = culture.studentId;
            this.cultureType = culture.cultureType;
            return this;
        }

        public Culture build(){
            return new Culture(this);
        }
   }
}
