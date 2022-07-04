package br.com.colegio.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Set;

import br.com.colegio.dto.StudentDto;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "student_user")
public class StudentEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long idStudent;

    @NotBlank
    @Length(min = 5)
    @Column(nullable = false)
    private String nameStudent;

    @NotBlank
    @Column(nullable = false)
    private Integer age;

    @Column()
    private LocalDateTime dateStart = LocalDateTime.now();

    @NotBlank
    @Column(nullable = false, unique = true)
    private String cpf;

    @Column()
    private String sexualOrientation;


    @ManyToMany(fetch = FetchType.EAGER)
    private Set<GuardianEntity> guardianList;

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexualOrientation() {
        return sexualOrientation;
    }

    public void setSexualOrientation(String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }

    public Set<GuardianEntity> getGuardianList() {
        return guardianList;
    }

    public void setGuardianList(Set<GuardianEntity> guardianList) {
        this.guardianList = guardianList;
    }

    public void setEntity(StudentDto studentDto){

        this.age = studentDto.getAge();
        this.cpf =  studentDto.getCpf();
        this.guardianList =   studentDto.getGuardianList();
        this.nameStudent =  studentDto.getNameStudent();
        this.sexualOrientation =  studentDto.getSexualOrientation();


    }
}
