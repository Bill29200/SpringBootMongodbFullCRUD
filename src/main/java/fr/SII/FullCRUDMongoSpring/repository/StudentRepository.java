package fr.SII.FullCRUDMongoSpring.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.SII.FullCRUDMongoSpring.model.Student;

public interface StudentRepository extends MongoRepository<Student, String>{

	Optional<Student> findStudentByEmail(String email);
	
	Optional<Student> deleteStudentByEmail(String email);
	/*Optional<Student> deleteByFirstName(String firstName);
	
	Optional<Student> findByIdFirstName(String firstName);*/
	
	
}
