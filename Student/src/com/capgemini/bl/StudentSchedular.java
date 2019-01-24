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
		int c = 0;
		for (int i = 0; i < counterStudent; i++) {
			if (students[i].getRollNumber() == rollNumber) {
				c = 0;
				return false;
			} else {
				c = 1;
			}
		}
		if (c == 1) {
			return true;
		}
		return (true);

	}

	public String showAllStudents() {
		String result = "";
		for (int i = 0; i < counterStudent; i++) {
			result += "Roll Number: " + students[i].getRollNumber() + "\n";
			result += "Name: " + students[i].getName() + "\n";
			result += "Courses: ";
			cTemp = students[i].getCourses();
			for (int j = 0; j < cTemp.length; j++) {
				System.out.println();
				result += cTemp[j].getCourseName() + " ";
			}
			result += "\n";
		}
		return result;

	}

	public String showStudentByRoll(int rollNo) {
		String result = "";
		int c = 0;
		for (int i = 0; i < counterStudent; i++) {
			if (students[i].getRollNumber() == rollNo) {
				result += "Roll Number: " + students[i].getRollNumber() + "\n";
				result += "Name: " + students[i].getName() + "\n";
				result += "Courses: ";
				cTemp = students[i].getCourses();
				for (int j = 0; j < cTemp.length; j++) {
					System.out.println();
					result += cTemp[j].getCourseName() + " ";
				}
				result += "\n";
			} else {
				c++;
				if (c == counterStudent)
					return ("Student not found with Roll No. " + rollNo);
			}

		}
		return result;

	}
}