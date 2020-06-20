package day_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IfElse {

	public static void main(String[] args) {
		int student1 = 90;
		int student2 = 80;
		int student3 = 100;

		String grade = "";

		// 만약 학생의 점수가 95정 이상이면 A, 85점 이상이면 B, 70점 이상이면 C

		if (student1 >= 95) {
			grade = "A";
		} else if (student1 >= 85) {
			grade = "B";
		} else if (student1 >= 70) {
			grade = "C";
		} else
			grade = "D";
		System.out.println("student1의 학점은 " + grade + "입니다.");

		int[] students = { student1, student2, student3 };

		for (int i = 0; i < students.length; i++) {
			int student = students[i];

			if (student >= 95) {
				grade = "A";
			} else if (student >= 85) {
				grade = "B";
			} else if (student >= 70) {
				grade = "C";
			} else
				grade = "D";
			System.out.println("student" + (i + 1) + "의 학점은 " + grade + "입니다.");
		}
		System.out.println();
		List<Integer> list = new ArrayList<Integer>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		for (int i = 0; i < list.size(); i++) {
			int student = list.get(i);
			if (student >= 95) {
				grade = "A";
			} else if (student >= 85) {
				grade = "B";
			} else if (student >= 70) {
				grade = "C";
			} else
				grade = "D";
			System.out.println("student" + (i + 1) + "의 학점은 " + grade + "입니다.");


		}
		System.out.println();
		List<Member> list1 = new ArrayList<Member>();
		list1.add(new Member("홍길동", student1));
		list1.add(new Member("김자바", student2));
		list1.add(new Member("스트림", student3));

		Stream<Member>  stream = list1.stream();
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			
			if (score >= 95) {
				System.out.println( name +"의 학점은 A입니다.");
			} else if (score >= 85) {
				System.out.println(name +"의 학점은 B입니다.");
			} else if (score >= 70) {
				System.out.println(name + "의 학점은 C입니다.");
			} else
				System.out.println(name +"의 학점은 D입니다.");
		});

	}

}
