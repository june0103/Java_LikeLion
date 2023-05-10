import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void run() {

		System.out.print("1. 학생정보 입력");
	}

}

class School {

	Scanner scanner;

	ArrayList<Student11> studentList = new ArrayList<Student11>();

}

class Student11 {

	String name;
	String grade;
	String korean;
	String english;
	String math;

	public Student11(String name, String grade, String korean, String english, String math) {
		this.name = name;
		this.grade = grade;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

}
