package br.com.colegio.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@Table(name = "guardian_student")
public class GuardianEntity {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idGuardian;

    @NotBlank
    @Length(min = 5)
    @Column(nullable = true)
    private String nameGuardian;

    @Length(min = 11,max = 11)
    @NotBlank
    @Column(unique = true)
    private String cpf;

    @NotBlank
    private String email;

    @NotBlank
    @Column(unique = true)
    private String phoneNumber;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<StudentEntity> studentList;


}
