package fr.SII.FullCRUDMongoSpring;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;


import fr.SII.FullCRUDMongoSpring.model.Address;
import fr.SII.FullCRUDMongoSpring.model.Gender;
import fr.SII.FullCRUDMongoSpring.model.Student;
import fr.SII.FullCRUDMongoSpring.repository.StudentRepository;

@SpringBootApplication
public class FullCrudMongoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullCrudMongoSpringApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
		return args ->{
			String email="bill@gmail.com";
			Address address = new Address("France", "29200", "Brest");
			Student student = new Student(
					 "Bill",
					 "armistrong",
					 "bill@gmail.com",
					 Gender.MALE, address,
					 List.of("Computer science","Maths"),
					 BigDecimal.TEN,
					 LocalDateTime.now()
					);
			
		//private void usingMongoTemplateAndQuery()
			/*Query query = new Query();
			query.addCriteria(Criteria.where("email").is(email));
			List<Student> students = mongoTemplate.find(query,Student.class );
			
			if (students.size() > 1) {
			 throw new IllegalStateExcepption("found many students with email +" email);
			}
			*/
			/* 
			repository.insert(student);
			System.out.println(student);
			//........................
			repository.findStudentByEmail(email).ifPresentOrElse(s ->{
				System.out.println("Existing student");
			},()->{
				System.out.println("Not Existing student");
			});
			System.out.println(repository.count());
			*/
			//........................
			/*
			repository.deleteStudentByEmail(email).ifPresentOrElse(s ->{
				System.out.println("Deleting student");
			},()->{
				System.out.println("Not Existing student");
			});
			*/
			//.......................
		};
		
	}

}
