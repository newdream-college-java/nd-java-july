package 第十三章作业1;

/*
 1.2、需求说明
 创建 Person 类和带参数构造方法，参数分别是姓名，性别和年龄
使用带参数的构造实例化对象
显示人员信息
*/
public class Person {
	public String toString(String name,String sex,int age) {
		return "姓名-->"+name+"\n"+"性别-->"+sex+"\n"+"年龄-->"+age;
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------人员信息--------------------");
		System.out.println("人员信息如下：");
		Person person=new Person();
		String string=person.toString("张三","男",23);
		System.out.println(string);
	}
}
