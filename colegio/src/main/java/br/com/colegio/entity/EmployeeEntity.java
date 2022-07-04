package br.com.colegio.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
public class EmployeeEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    @Length(min = 5)
    private String nameEmployee;

    @NotBlank
    @Column(nullable = false)
    @Length(min = 11, max = 11)
    private String cpf;

    private LocalDateTime dateAdmission = LocalDateTime.now();

    private String phoneNumber;

    private boolean activeOrDisabled;


}
