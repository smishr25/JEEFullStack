package com.capgemini.bl;

import com.capgemini.beans.Courses;
import com.capgemini.beans.Student;

public class StudentSchedular {

	private Student[] students = new Student[10];
	private Courses[] cTemp;

	private int counterStudent;
	// private int cNum;

	public String addStudent(int rollNumber, String name, Courses[] courses) {
		// cNum = courses.length;
		students[counterStudent++] = new Student(rollNumber, name, courses);
		return "Student added successfully";

	}

	public boolean checkRoll(int rollNumber) {
		// cNum = courses.length;
		int c=0;
		for (int i = 0; i < counterStudent; i++) {
			if (students[i].getRollNumber() == rollNumber) {
				c=0;
				return false;
			}
			else {
				c=1;
			}
		}
		if(c==1) {
			return true;
		}
		return(true);

	}

	public void showAllStudents() {
		for (int i = 0; i < counterStudent; i++) {
			System.out.println("Roll Number: " + students[i].getRollNumber());
			System.out.println("Name: " + students[i].getName());
			System.out.println("Courses: ");
			cTemp = students[i].getCourses();
			for (int j = 0; j < cTemp.length; j++) {
				System.out.println(cTemp[j].getCourseName());
			}
		}

	}

	public void showStudentByRoll(int rollNo) {
		for (int i = 0; i < counterStudent; i++) {
			if (students[i].getRollNumber() == rollNo) {
				System.out.println("Roll Number: " + students[i].getRollNumber());
				System.out.println("Name: " + students[i].getName());
				System.out.println("Courses: ");
				cTemp = students[i].getCourses();
				for (int j = 0; j < cTemp.length; j++) {
					System.out.println(cTemp[j].getCourseName());
				}
			} else {
				System.out.println("Student not found with Roll No. " + rollNo);
			}

		}

	}
}