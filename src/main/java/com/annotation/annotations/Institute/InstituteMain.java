package org.iesvdm.annotations.Institute;
import org.iesvdm.annotations.GetAnnotationsValues;


public class Main {
    public static void main(String[] args) {


        Classroom classroom = new Classroom()
                .setStudents(GetAnnotationsValues.chargeStudents());
        System.out.println(classroom);


    }
}
