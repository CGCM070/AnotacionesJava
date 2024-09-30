package org.iesvdm.annotations;

import org.iesvdm.annotations.Institute.Classroom;
import org.iesvdm.annotations.Institute.StudentClass;

import java.util.*;

public class GetAnnotationsValues {

    public static List<StudentAnnotation> valuesOfStudentAnnotation() {
        return Arrays.asList(Classroom.class.getAnnotationsByType(StudentAnnotation.class));
    }

    public static List<StudentClass> chargeStudents() {
        List<StudentClass> students = new ArrayList<>();
        for (StudentAnnotation studentAnnotation : valuesOfStudentAnnotation()) {
            students.add(new StudentClass()
                    .setName(studentAnnotation.name())
                    .setLastName(studentAnnotation.lastName())
                    .setDateOfBirth(studentAnnotation.dateOfBirth())
                    .setCurrentCourse(studentAnnotation.currentCourse())
                    .setNameOfCourse(studentAnnotation.nameOfCourse()));
        }
        return students;
    }
}
