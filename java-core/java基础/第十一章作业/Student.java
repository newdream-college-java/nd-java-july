package Chapter11_类的无参方法;

/*
	编写一个 Student 类，其中包括(姓名，学号，班级，性别，年龄，家庭住址)，
	再增加一 个 sayHello()方法，输出学生信息

*/

public class Student {
	String 姓名="王二狗";
	String 学号="1号";
	String 班级="java3班";
	String 性别="男";
	String 年龄="21";
	String 家庭住址="新梦想";
	
	public static void main(String[] args) {
			Student student=new Student();
			student.sayHello();
	}
	
	public void sayHello() {
		System.out.println("姓名："+姓名+"，学号："+学号+"，班级："+班级+"，性别："+性别+"，年龄："+年龄+",家庭住址："+家庭住址);
	}
	
	

}
