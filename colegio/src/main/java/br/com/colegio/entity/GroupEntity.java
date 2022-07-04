package br.com.colegio.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "student_group")
public class GroupEntity {


    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGroup;

    @OneToMany(mappedBy = "nameStudent")
    private Set<StudentEntity> studentList;



}
