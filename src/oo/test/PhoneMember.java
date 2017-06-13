package oo.test;

public class PhoneMember extends Member{
	public PhoneMember(String name) {
		super(name);
	}
	public PhoneMember() {
		super();
	}
	String phone;
	boolean vertified = false;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isVertified() {
		return vertified;
	}
	public void setVertified(boolean vertified) {
		this.vertified = vertified;
	}
	
}
