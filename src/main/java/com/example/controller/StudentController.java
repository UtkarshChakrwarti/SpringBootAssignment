package com.example.controller;



//Define controller class – Rest APIs
/*@RestController annotation is used with
class and combined form of @Controller and
 @ResponseBody.

@PostMapping is short form of
@RequestMapping(method = RequestMethod.POST).

@PutMapping is short form of
@RequestMapping(method = RequestMethod.PUT).

@GetMapping is short form of
@RequestMapping(method = RequestMethod.GET).

@DeleteMapping is short form of
@RequestMapping(method = RequestMethod.DELETE)

 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        Student createResponse = studentService.save(student);
        return createResponse;
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        Student updateResponse = studentService.update(student);
        return updateResponse;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {
        Student getResponse = studentService.get(id);
        return getResponse;
    }

    @DeleteMapping("/delete")
    public String deleteStudent(@RequestBody Student student) {
        studentService.delete(student);
        return "Record deleted successfully";
    }
}