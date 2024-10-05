package org.iesvdm.annotation.ejercicioN5.util;

import javax.lang.model.element.Element;
import javax.lang.model.element.Modifier;

public class ReflectionUtils {

    public static void showClassInfo(Class<?> clazz) {
        System.out.println("Nombre de la clase: " + clazz.getName());
        System.out.println("Nombre simple de la clase: " + clazz.getSimpleName());
        System.out.println("Nombre del paquete: " + clazz.getPackage().getName());
        System.out.println("Nombre del superclase: " + clazz.getSuperclass().getName());
    }

    public static  boolean isNonPrivate (Element element) {
        return !element.getModifiers().contains(Modifier.PRIVATE);
    }

    public static boolean isNonStatic (Element element) {
        return !element.getModifiers().contains(Modifier.STATIC);
    }

}
