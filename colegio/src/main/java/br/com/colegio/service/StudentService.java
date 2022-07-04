package br.com.colegio.service;

import br.com.colegio.dto.StudentDto;
import br.com.colegio.entity.StudentEntity;
import br.com.colegio.repository.StudentRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;


@Service
public class StudentService {

    public static final Logger LOGGER = Logger.getLogger(StudentService.class.getName());

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentEntity studentEntity;

    public void registration(StudentDto studentDto){

        try{

            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setEntity(studentDto);
            studentRepository.save(studentEntity);

        }catch (Exception ex){


            LOGGER.log(Level.SEVERE,"not possible registration in the system");
            System.out.println(ex.getMessage());


        }

    }

    public Optional<StudentEntity> findStudent(Long idStudent){

        if(studentRepository.findByIdStudent(idStudent).isPresent()){
            return studentRepository.findByIdStudent(idStudent);
        }

        throw new ObjectNotFoundException(idStudent,"-> Student not found");

    }


    public void deleteStudent(Long idStudent){

        if(studentRepository.findByIdStudent(idStudent).isPresent()){
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setIdStudent(idStudent);
            studentRepository.delete(studentEntity);
        }

        throw new ObjectNotFoundException(idStudent,"-> Student not found");

    }

    @Transactional
    public void updateStudent(StudentDto studentDto){

        try{

            studentEntity.setEntity(studentDto);
            studentRepository.save(studentEntity);

        }catch (Exception ex){


            LOGGER.log(Level.SEVERE,"not possible update in the system");
            System.out.println(ex.getMessage());


        }

    }

}
