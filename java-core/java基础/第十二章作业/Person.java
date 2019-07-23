package chapter12;

/*
	创建 Person 类和带参数构造方法，参数分别是姓名，性别和年龄
	使用带参数的构造实例化对象
*/

public class Person {

	public static void main(String[] args) {
		System.out.println("----------人员信息------------");
		String name="张三";
		String sex="男";
		int age=18;
		Person person=new Person();
		person.Show(name, sex, age);
	}
	
	public void Show(String name,String sex,int age) {
		System.out.println("人员信息如下：");
		System.out.println("姓名-->"+name);
		System.out.println("性别-->"+sex);
		System.out.println("年龄-->"+age);
	}

}
