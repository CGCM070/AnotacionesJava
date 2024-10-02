package com.annotation.annotations.institute.classroom.annotation;
import com.annotation.annotations.institute.classroom.annotation.model.Classroom;
import com.annotation.annotations.institute.classroom.annotation.model.GetAnnotationsValues;


public class InstituteMain {
    public static void main(String[] args) {


        Classroom classroom = new Classroom()
                .setStudents(GetAnnotationsValues.chargeStudents());
        System.out.println(classroom);


    }
}
