package fr.SII.FullCRUDMongoSpring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.SII.FullCRUDMongoSpring.model.Student;
import fr.SII.FullCRUDMongoSpring.repository.StudentRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentService {
    //............................................................ 
	@Autowired
	private final StudentRepository studentRepository;
	//............................................................ 
	//                    |C|  Create
	//............................................................ 
	public void insertStudent(Student student) {
		studentRepository.insert(student);
	}
	//............................................................ 
	//                    |R| Read................................... 
	//............................................................ 
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}	
	//............................................................ 
   /* public Optional<Student> getStudentsById(String id) {		
		return studentRepository.findById(id);
	}	
	//............................................................ 
    public Optional<Student> getStudentsByFirstName(String firstName) {		
		return studentRepository.findByIdFirstName(firstName);
	}	
	//............................................................ 
    public long studentCount ()
    {
    	return studentRepository.count();
    }
    //............................................................
    //                       |U| Update
    //............................................................
    public void UpdateStudent(Student student) {
		studentRepository.save(student);
	}
    //............................................................
	//                       |D| Delete
	//............................................................ 
    public void deleteStudent(Student student) {    	
		studentRepository.delete(student);		
    }
	//............................................................
    public void deleteAllStudent() {    	
		studentRepository.deleteAll();		
    }
    //............................................................ 
    public void deleteStudentById(String id) {    	
		studentRepository.deleteById(id);		
    }
    //............................................................
    public void deleteStudentByFirstName(String firstName) {    	
		studentRepository.deleteByFirstName(firstName);		
    }
    */
    //............................................................
    
}
