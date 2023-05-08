package com.test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {

		System.out.print("1. 학생정보 입력");
	}

}

public class School {

	Scanner scanner;

	ArrayList<Student> studentList = new ArrayList<Student>();

}

public class Student {

	String name;
	String grade;
	String korean;
	String english;
	String math;

	public Student(String name, String grade, String korean, String english, String math) {
		this.name = name;
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

}
