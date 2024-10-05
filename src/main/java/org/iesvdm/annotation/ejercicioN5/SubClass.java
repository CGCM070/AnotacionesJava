package org.iesvdm.annotation.ejercicioN5;


import lombok.Getter;
import lombok.Setter;
import org.iesvdm.annotation.ejercicioN5.annotations.SuperBuilder;


@SuperBuilder
public class SubClass extends SuperClass {
    private String name;  // no debe incluirse en el builder
    protected int age; //debe incluirse en el builder

    public SubClass(int age, String superField) {
        super(superField);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public SubClass setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubClass setName(String name) {
        this.name = name;
        return this;
    }
}
