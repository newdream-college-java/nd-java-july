package chapter_11;

public class Student {
	String names;
	String num;
	String classes;
	String sex;
	int age;
	String address;
	
	public void sayHello(){
		System.out.println("学生姓名："+names+"\t学号："+num+"\t班级："+"\t性别："+"\t年龄："+age+"\t家庭住址："+address);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.names="陈良财";
		stu.num="35";
		stu.classes="Java3班";
		stu.sex="18";
		stu.address="天马小区66栋";
		stu.sayHello();

	}

}
