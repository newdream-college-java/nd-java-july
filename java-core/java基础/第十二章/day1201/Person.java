package work;
/**
 *1.2、需求说明
		创建 Person 类和带参数构造方法，参数分别是姓名，性别和年龄
		使用带参数的构造实例化对象显示人员信息
 */

public class Person {
	public void persons(String name,String sex,int age) {
		System.out.println("人员信息如下：");
		System.out.println("姓名-->"+name+"\n性别-->"+sex+"\n年龄-->"+age);
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.persons("李二狗", "男", 46);
		
	}

}
