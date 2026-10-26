package com.joaopedro.gestaoVagas.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "company")
@AllArgsConstructor
@NoArgsConstructor
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    @Email(message = "o email deve ser válido")
    private String email;

    @Length(min = 8, message = "a senha deve conter entre 8 e 20 caracteres")
    private String password;
    private String website;

    @Pattern(regexp = "^[^\\s]+$", message = "o campo [username] não deve conter espaço")
    private String username;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
