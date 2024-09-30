package com.annotation.annotations.Institute;
import com.annotation.annotations.Institute.model.Classroom;
import org.iesvdm.annotations.GetAnnotationsValues;


public class InstituteMain {
    public static void main(String[] args) {


        Classroom classroom = new Classroom()
                .setStudents(GetAnnotationsValues.chargeStudents());
        System.out.println(classroom);


    }
}
