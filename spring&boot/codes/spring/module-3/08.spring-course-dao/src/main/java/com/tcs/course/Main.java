package com.tcs.course;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tcs.course.dao.CourseDao;
import com.tcs.course.entity.Course;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("course-beans.xml");
		
		CourseDao dao = (CourseDao)context.getBean("coursebean");
		
		while(true) {
			System.out.println("1. New Course");
			System.out.println("2. List All Courses");
			System.out.println("3. Exit");
			
			System.out.print("\nenter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			 case 1:
				Course course = generateCourse(); 
				dao.saveCourse(course);
				break;
			 case 2:
				List<Course> courses = dao.findAllCourses();
					
				for(Course c : courses) {
				  System.out.println(c);
				  try {
					Thread.sleep(2000);
				   }catch(Exception ex) {}
				}				 
				break;
			 case 3:
				System.out.println("----- Thanks -----");
				sc.close();
				System.exit(0);
				break;
			 default:
				System.out.println("$$$--- INVALID OPTION --- TRY AGAIN ---$$$");
			}//switch
			System.out.println("-----------------------------------------------------------------\n");
		}
	}

	private static Course generateCourse() {
		System.out.print("enter courseid: ");
		int cid = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter course name: ");
		String cname = sc.nextLine();
		
		System.out.print("enter course fees: ");
		float fees= sc.nextFloat();
		
		return new Course(cid, cname, fees);
	}
}
