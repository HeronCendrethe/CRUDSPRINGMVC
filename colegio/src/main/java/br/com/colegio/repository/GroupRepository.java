package br.com.colegio.repository;

import br.com.colegio.entity.GroupEntity;
import br.com.colegio.entity.StudentEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends PagingAndSortingRepository<GroupEntity, Integer> {
}
