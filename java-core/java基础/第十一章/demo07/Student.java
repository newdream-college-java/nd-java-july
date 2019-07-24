/*1.7、编写一个 Student 类，其中包括(姓名，学号，班级，性别，年龄，家庭住址)，
再增加一 个 sayHello()方法，输出学生信息*/
package demo07;

public class Student {
	String name;
	int no;
	String clas;
	String sex;
	int age;
	String address;
	public void sayHello(){
		System.out.println("姓名："+name+"\n学号："+no+"\n班级："+clas+"\n性别："+sex+"\n年龄："+age+"\n家庭住址："+address);
	}
}
