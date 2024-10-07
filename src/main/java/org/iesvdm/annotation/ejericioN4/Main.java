package org.iesvdm.annotation.ejericioN4;

import org.iesvdm.annotation.ejericioN4.model.Person;

public class Main {
    public static void main(String[] args) {

        /**
         *  La anotación @Value para crear una clase inmutable
         *  Person personImmutable = new Person("Juan", "Perez", ..etc);
         *  y no se pueden modificar sus atributos una vez creada la instancia
         */

        // Crea una instancia de Person y establece sus atributos utilizando setters
        Person person = new Person();
        person.setName("Juan");
        person.setLastName("Perez");
        person.setEmail("testgmail.com");
        person.setPhone("123456789");
        person.setDni("12345678");
        System.out.println("Data : " + person);

        // Crea una instancia de Person utilizando el constructor del patrón Builder
        Person personBuilder = Person.builder()
                .name("Juan")
                .lastName("Perez")
                .email("test@gamail.com")
                .phone("123456789")
                .dni("12345678")
                .build();
        System.out.println("Builder " + personBuilder);
    }
}
