package com.mustafasalem.technikum_wien.softwarekomponentensysteme.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @SequenceGenerator(name = "user_id_sequence", sequenceName = "user_id_sequence")
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "user_id_sequence")
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
