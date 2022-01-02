package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Course;

@Service
public class CourseServiceImpl implements CourseServices {
	
	List<Course>list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Course(1,"course_1","Abc"));
		list.add(new Course(2,"course_2","Efg"));
	}

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourseId(long courseId) {
		// TODO Auto-generated method stub
		
		Course c =null;
		for(Course course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
