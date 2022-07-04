package br.com.colegio.dto;
import br.com.colegio.entity.StudentEntity;
import java.util.Set;

public class GuardianDto {

    private Long idGuardian;

    private String nameGuardian;

    private String cpf;

    private String email;

    private String phoneNumber;

    private Set<StudentEntity> studentList;
}
