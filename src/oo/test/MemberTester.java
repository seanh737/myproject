package oo.test;

public class MemberTester {

	public static void main(String[] args) {
		Member m = new Member("Sean");
		m.setAge(-4);
		System.out.println(m.getAge());
		
		//Phonemember
		PhoneMember m2 = new PhoneMember();
		PhoneMember m3 = new PhoneMember("Sean");
	}

}
