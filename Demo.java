package com.eval;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Total number of Student");
		int total_num = scanner.nextInt();
		
		Student[] students = new Student[total_num];
		
		for(int i = 0; i<students.length; i++) {
			System.out.println("Enter roll");
			int roll = scanner.nextInt();
			
			System.out.println("Enter name");
			String name = scanner.next();
			
			System.out.println("Enter address");
			String address = scanner.next();
			
			System.out.println("Enter marks obtain");
			int marks = scanner.nextInt();
			
			students[i] = new Student(roll,name,address,marks);
		}
		int sum = 0;
		for(Student student: students) {
			System.out.println("Student roll: " + student.getRoll());
			System.out.println("Student name: " + student.getName());
			System.out.println("Student address: " + student.getAddress());
			System.out.println("Student marks: " + student.getMarks());
			sum += student.getMarks();
		}
		int average = sum/students.length;
		System.out.println(average);
	}

}
