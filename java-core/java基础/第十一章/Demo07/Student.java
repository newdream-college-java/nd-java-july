package chapter11;

public class Student {
	String name;
	String no;
	String classs;
	String sex;
	String address;
	String age;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", classs=" + classs
				+ ", sex=" + sex + ", age=" + age + ", address=" + address
				+ "]";
	}
}
