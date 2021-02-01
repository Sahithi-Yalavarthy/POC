package com.spring.student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//import com.spring.student.Student;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/{studentId}")
	 public List<Student> getStudent(@PathVariable("studentId")String studentId) {
		List <Student> student=Arrays.asList(
				new Student("Kranthi","785","CSE"),
				new Student("Kanth","123","EEE")
				);
		return (student); 
	 }
	@RequestMapping("/111")
	public List<Student> getStudent() {
		return Collections.singletonList( new Student( "ravi","123", "CSE") ); 
	 }
}
