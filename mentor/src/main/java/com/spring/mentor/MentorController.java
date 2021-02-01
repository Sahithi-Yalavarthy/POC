package com.spring.mentor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/mentor")
public class MentorController {

			@RequestMapping("/{mentorId}")
		 public List<Mentor> getStudent(@PathVariable("mentorId")String mentorId) { 
				
RestTemplate rest=new RestTemplate();
				
				List <Student> student=Arrays.asList(
						new Student("Kranthi","785","CSE"),
						new Student("Kanth","123","EEE")
						);
				return student.stream().map(t -> {
					//Student stu=rest.getForObject("http://localhost:8080/student/"+t.getStudentID(),Student.class);
					Student stu=rest.getForObject("http://localhost:8080/student/111",Student.class);
					//return new Mentor(t.getName(),t.getAddr(),t.getBranch(),t.getStudentID());
					return new Mentor(stu.getName(),stu.getBranch(), t.getAddr(), t.getRollno());
				})
				
						.collect(Collectors.toList());
				
			}			
				//return Collections.singletonList( new Mentor( "ravi","Hyd", "CSE",123) ); 
		 }
