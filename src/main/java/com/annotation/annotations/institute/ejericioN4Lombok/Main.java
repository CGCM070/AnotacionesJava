package com.annotation.annotations.institute.ejericioN4Lombok;

import com.annotation.annotations.institute.ejericioN4Lombok.model.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Juan");
        person.setLastName("Perez");
        person.setEmail("testgmail.com");
        person.setPhone("123456789");
        person.setDni("12345678");

        System.out.println("Data : " + person);

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
