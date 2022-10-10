/* Culture.java
   Entity for Culture
   Author: Kegomoditswe Leshope - 219189048
   Date: 7 August 2022
*/

package za.ac.cput.domain.StudentDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
public class Culture implements Serializable {
    @Id
    @Column (name = "culture_Id")
    private String cultureId;
    @NotNull private String cultureType;

    @ManyToOne
    @JoinColumn (name = "student_ID", referencedColumnName = "student_ID")
    private Student student;

    protected Culture(){
    }

    //Private Constructor====

    private Culture (Builder builder){
        this.cultureId = builder.cultureId;
        this.cultureType = builder.cultureType;
        this.student = builder.student;
     }

     //Getters ====

    public String getCultureId() {
        return cultureId;
    }

    public String getCultureType() {
        return cultureType;
    }

    public Student getStudent() {
        return student;
    }

    //toString ====

    @Override
    public String toString() {
        return "Culture{" +
                "cultureId='" + cultureId + '\'' +
                ", cultureType='" + cultureType + '\'' +
                ", student=" + student +
                '}';
    }

    //Builder ====
    public static class Builder{
        private String cultureId;
        private String cultureType;
        private Student student;

        public Builder cultureId(String cultureId){
            this.cultureId = cultureId;
            return this;
        }

        public Builder cultureType(String cultureType){
            this.cultureType = cultureType;
            return this;
        }

        public Builder student (Student student){
            this.student = student;
            return this;
        }

        public Builder copy(Culture culture){
            this.cultureId = culture.cultureId;
            this.cultureType = culture.cultureType;
            this.student = culture.student;
            return this;
        }

        public Culture build(){
            return new Culture(this);
        }
    }
}
