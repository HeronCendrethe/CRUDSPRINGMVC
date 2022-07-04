package br.com.colegio.repository;

import br.com.colegio.entity.StudentEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<StudentEntity, Integer> {

    Optional<StudentEntity> findByIdStudent(Long idStudent);




}
