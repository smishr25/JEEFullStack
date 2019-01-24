package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.bl.StudentSchedular;
import com.capgemini.beans.Courses;

public class View {

	private static Scanner sc = new Scanner(System.in);

	private static StudentSchedular studSch = new StudentSchedular();

	public static void main(String[] args) {
		showMenu();
	}

	private static void showMenu() {

		int choice;

		while (true) {
			System.out.println();
			System.out.println("1. Add student");
			System.out.println("2. Show all students");
			System.out.println("3. Show student by Roll Number");
			System.out.println("4. Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addStudentDetails();
				break;
			case 2:
				showAllStudents();
				break;
			case 3:
				showStudentByRoll();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Sorry you entered wrong choice!");

			}

		}

	}

	private static void addStudentDetails() {
		String courseTemp;
		boolean temp;
		System.out.println("Enter roll number: ");
		int rollNumber = sc.nextInt();

		temp = studSch.checkRoll(rollNumber);
		while (!temp) {
			System.out.println("Roll No. exist! ");
			System.out.println("Enter different roll number: ");
			rollNumber = sc.nextInt();
			temp = studSch.checkRoll(rollNumber);
		}

		System.out.println("Enter name: ");
		String name = sc.next();

		System.out.println("Enter the number of courses: ");

		int numOfCourses = sc.nextInt();
		Courses[] courses = new Courses[numOfCourses];

		System.out.println("Enter " + numOfCourses + " number of courses: ");
		for (int i = 0; i < numOfCourses; i++) {
			courseTemp = sc.next();
			courses[i] = new Courses(i + 1, courseTemp);
		}

		System.out.println(studSch.addStudent(rollNumber, name, courses));

	}

	private static void showAllStudents() {
		String res;
		res=studSch.showAllStudents();
		System.out.println(res);

	}

	private static void showStudentByRoll() {
		int rollNo;
		String res;
		System.out.println("Enter the Roll No.: ");
		rollNo = sc.nextInt();
		res=studSch.showStudentByRoll(rollNo);
		System.out.println(res);


	}

}