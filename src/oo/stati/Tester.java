package oo.stati;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(58, 96 , 67);
		Student stu2 = new Student(56, 66 , 60);
		Student stu3 = new Student(70, 86 , 48);
//		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu1 = new GraduateStudent(68,85,89);
		GraduateStudent gstu2 = new GraduateStudent(79,89,60);
		gstu1.print();
		gstu2.print();
		
//		
		ArrayList<Student> list = new ArrayList<>();
		list.add(stu1);
		list.add(stu2);
		list.add(new Student(70, 86 , 48));
		list.add(gstu1);
		list.add(new GraduateStudent(79,89,60));
		for (int i = 0 ;i<list.size() ; i++){
			Student stu = list.get(i);
			stu.print();
		}
		
	}

}
