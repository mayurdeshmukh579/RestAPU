package com.springrest.springrest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entities.Course;
import com.springrest.springrest.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseServices;

	@GetMapping("/home")
	public String home() {
		return  "Welcome to Courses Application";
	}
	
	@GetMapping("/courses")
	public List<Course>getCourses(){
		return this.courseServices.getCourse();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){
		return this.courseServices.getCourseId(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course) {
		return this.courseServices.addCourse(course);
	}

}
