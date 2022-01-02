package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.Entities.Course;

public interface CourseServices {
	
	public List<Course>getCourse();
	
	public Course getCourseId(long courseId);

	public Course addCourse(Course course);

}
