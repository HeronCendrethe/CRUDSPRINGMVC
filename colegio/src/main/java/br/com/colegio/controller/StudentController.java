package br.com.colegio.controller;

import br.com.colegio.dto.StudentDto;
import br.com.colegio.service.StudentService;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("registration")
    public ResponseEntity<?> registration(@RequestBody StudentDto studentDto){

        studentService.registration(studentDto);

        return ResponseEntity.ok("ok");


    }
    @GetMapping("find/{id}")
    public ResponseEntity<?> findStudent(@PathVariable("id") Long id){

        try{

            return ResponseEntity.ok(studentService.findStudent(id));

        }catch(ObjectNotFoundException ex){
            return ResponseEntity.ok(ex.getMessage());

        }

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){

        try{

             studentService.deleteStudent(id);


        }catch(ObjectNotFoundException ex){
            return ResponseEntity.ok(ex.getMessage());

        }

        return ResponseEntity.ok("Student black is deleted");

    }

    @PostMapping("update")
    public ResponseEntity<?> update(@RequestBody StudentDto studentDto){

        studentService.updateStudent(studentDto);

        return ResponseEntity.ok("ok");


    }

}
