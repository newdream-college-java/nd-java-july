package Work;

/**
 * 1.7、编写一个 Student 类，其中包括(姓名，学号，班级，性别，年龄，家庭住址)，
	再增加一 个 sayHello()方法，输出学生信息
 */
public class Student {
	String name = "陈二狗";
	int ID =25;
	String class1 = "java 03班";
	String sex = "男";
	int age = 22;
	String address = "湖南长沙天马小区66栋";
	public void syaHello() {
		System.out.println("姓名："+name+"\n学号："+ID+"\n班级："+class1+"\n性别："+sex+"\n年龄："+age+"\n家庭住址："+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.syaHello();
	}

}
