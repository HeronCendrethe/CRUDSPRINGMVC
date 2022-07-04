package br.com.colegio.repository;

import br.com.colegio.entity.GuardianEntity;
import br.com.colegio.entity.StudentEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuardianRepository  extends PagingAndSortingRepository< GuardianEntity,Integer>  {
}
