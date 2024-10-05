package org.iesvdm.annotation.ejericioN4.model;

import lombok.*;


/**
 * La clase Person representa a una persona con atributos básicos como nombre, apellido, email, teléfono y DNI.
 * Utiliza anotaciones de Lombok para generar código  como getters, setters, constructores, y el método toString.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Person {
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String dni;

}
