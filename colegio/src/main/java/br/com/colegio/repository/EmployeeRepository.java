package br.com.colegio.repository;

import br.com.colegio.entity.EmployeeEntity;
import br.com.colegio.entity.StudentEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository <EmployeeEntity,Integer> {

    StudentEntity findById(Long id);
}
