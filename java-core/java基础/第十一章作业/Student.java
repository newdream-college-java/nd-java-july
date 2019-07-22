package 第11章作业;
/*1.7、编写一个 Student 类，其中包括(姓名，学号，班级，性别，年龄，家庭住址)，
再增加一 个 sayHello()方法，输出学生信息*/
public class Student {
	String name;
	int classNum;
	String banJi;
	String sex;
	int age;
	String addreas;
	
	public String sayHellow(){
		return "姓名:"+name+"\n学号:"+classNum+"\n班级:"+banJi+"\n性别:"+sex+"\n年龄:"+age+"\n家庭住址:"+addreas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.name="张三";
		stu.classNum=12345;
		stu.banJi="java3班";
		stu.sex="男";
		stu.age=22;
		stu.addreas="湖南长沙";
		System.out.println(stu.sayHellow());		
	}

}
