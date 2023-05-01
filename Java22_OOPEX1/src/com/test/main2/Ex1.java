package com.test.main2;
import java.util.Scanner;


public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Cal cal = new Cal();

		System.out.println("학생1 이름 입력 : ");
		st1.StudentName = sc.nextLine();
		System.out.println("학생1 학년 입력 : ");
		st1.student_grade = sc.nextInt();
		System.out.println("학생1 국어점수 입력 : ");
		st1.korean_score = sc.nextInt();
		System.out.println("학생1 영어점수 입력 : ");
		st1.english_score = sc.nextInt();
		System.out.println("학생1 수학점수 입력 : ");
		st1.math_score = sc.nextInt();

		System.out.println("학생2 이름 입력 : ");
		st2.StudentName = sc.next();
		System.out.println("학생2 학년 입력 : ");
		st2.student_grade = sc.nextInt();
		System.out.println("학생2 국어점수 입력 : ");
		st2.korean_score = sc.nextInt();
		System.out.println("학생2 영어점수 입력 : ");
		st2.english_score = sc.nextInt();
		System.out.println("학생2 수학점수 입력 : ");
		st2.math_score = sc.nextInt();

		System.out.println("학생3 이름 입력 : ");
		st3.StudentName = sc.next();
		System.out.println("학생3 학년 입력 : ");
		st3.student_grade = sc.nextInt();
		System.out.println("학생3 국어점수 입력 : ");
		st3.korean_score = sc.nextInt();
		System.out.println("학생3 영어점수 입력 : ");
		st3.english_score = sc.nextInt();
		System.out.println("학생3 수학점수 입력 : ");
		st3.math_score = sc.nextInt();
		
		sc.close();

		st1.print();
		System.out.println();
		st2.print();
		System.out.println();
		st3.print();
		System.out.println();
		
		int korean_sum = cal.sum(st1.korean_score, st2.korean_score, st3.korean_score);
		int eng_sum = cal.sum(st1.english_score, st2.english_score, st3.english_score);
		int math_sum = cal.sum(st1.math_score, st2.math_score, st3.math_score);

		System.out.println("과목별 총점");
		System.out.printf("국어 : %d\n", korean_sum);
		System.out.printf("영어 : %d\n", eng_sum);
		System.out.printf("수학 : %d\n", math_sum);
		System.out.println();

		int korean_avg = cal.avg(korean_sum);
		int eng_avg = cal.avg(eng_sum);
		int math_avg = cal.avg(math_sum);

		System.out.println("과목별 평균");
		System.out.printf("국어 : %d\n", korean_avg);
		System.out.printf("영어 : %d\n", eng_avg);
		System.out.printf("수학 : %d\n", math_avg);
		System.out.println();

	}

}

class Student {
	String StudentName;
	int student_grade;
	int korean_score;
	int english_score;
	int math_score;
	
	public void print() {
		System.out.printf("이름 : %s\n", StudentName);
		System.out.printf("학년 : %d\n", student_grade);
		System.out.printf("국어 : %d\n", korean_score);
		System.out.printf("영어 : %d\n", english_score);
		System.out.printf("수학 : %d\n", math_score);
	}


}

class Cal{
	
	public int sum(int score1,int score2,int score3) {
		return score1 + score2 + score3;
	}
	
	public int avg(int sum) {
		return (sum) / 3;
	}
	
	
}
