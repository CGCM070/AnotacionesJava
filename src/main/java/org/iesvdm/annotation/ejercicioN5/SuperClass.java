package org.iesvdm.annotation.ejercicioN5;

public class SuperClass {
    protected String superField;

    public SuperClass(String superField) {
        this.superField = superField;
    }

    public String getSuperField() {
        return superField;
    }

    public SuperClass setSuperField(String superField) {
        this.superField = superField;
        return this;
    }


}
