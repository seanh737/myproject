package oo.stati;

public class Tester {

	public static void main(String[] args) {
		Student stu1 = new Student(58, 96 , 67);
		Student stu2 = new Student(56, 66 , 60);
//		stu1.pass = 70;
		stu1.print();
		stu2.print();
		GraduateStudent gstu = new GraduateStudent(68,85,89);
		gstu.print();
	}

}
