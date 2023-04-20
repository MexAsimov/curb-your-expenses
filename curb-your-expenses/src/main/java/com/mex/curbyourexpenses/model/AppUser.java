package com.mex.curbyourexpenses.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String email;

    // have to hold it securely
    private String password;

}
