package chapter_13_1;
/*创建 Person 类和带参数构造方法，参数分别是姓名，性别和年龄*/
public class Person {
	public void show(String name,int age,String sex){
		System.out.println("---------------人员信息-------------");
		System.out.println("人员信息如下：");
		System.out.println("姓名--->"+name);
		System.out.println("年龄--->"+age);
		System.out.println("性别--->"+sex);
	}
	public static void main(String[] args) {
		Person p1=new Person();
		p1.show("陈良财",19 , "男");
	}

}
