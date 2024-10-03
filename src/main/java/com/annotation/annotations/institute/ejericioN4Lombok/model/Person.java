package com.annotation.annotations.institute.ejericioN4Lombok.model;
import lombok.*;

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
