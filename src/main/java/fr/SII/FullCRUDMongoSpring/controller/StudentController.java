package fr.SII.FullCRUDMongoSpring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.SII.FullCRUDMongoSpring.model.Student;
import fr.SII.FullCRUDMongoSpring.service.StudentService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {
	
	@Autowired
	private final StudentService studentService;
	//............................................................ 
	//                    |C|  Create
	//............................................................ 
	/*@PostMapping()
	public void insertStudent(Student student) {
		studentService.insertStudent(student);		
	}
	*/
	//.............................
	@GetMapping()
	public List<Student> fetchAllStudents(){
		return studentService.getAllStudents();
		}
	//.............................

}
