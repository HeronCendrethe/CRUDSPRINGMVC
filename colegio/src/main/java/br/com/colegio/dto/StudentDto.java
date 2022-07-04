package br.com.colegio.dto;
import br.com.colegio.entity.GuardianEntity;
import java.util.Set;

public class StudentDto {


    private Long idStudent;

    private String nameStudent;

    private Integer age;

    private String cpf;

    private String sexualOrientation;

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
}
