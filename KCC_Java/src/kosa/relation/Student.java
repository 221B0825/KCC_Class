package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private List<Course> courses; // 학생이 수강신청한 과목들

	public Student() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
	}

	public void register(Course course) {
		course.addStudent(this);
		courses.add(course);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			course.removeStudent(this);
			courses.remove(course);
		}
	}
	
	public void printMember() {
		System.out.println("학생 이름: "+name);
		for(Course course : courses) {
			System.out.println("수강 과목: "+course.getName());
		}
	}
	
	
}
