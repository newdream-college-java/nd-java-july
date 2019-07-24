/**
 * 创建 Person 类和带参数构造方法，参数分别是姓名，性别和年
 *		使用带参数的构造实例化对象
 *		显示人员信息(如下图)
 * @author 54975
 *
 */
public class Person {
	String name;
	String sex;
	int age;
	public void show(Person s){
		System.out.println("-----------------人员信息-------------");
		System.out.println("人员信息如下:");
		System.out.print("姓名--->"+s.name+"\n性别--->"+s.sex+"\n年龄--->"+s.age);
	}
	public static void main(String[] args) {
		Person s=new Person();
		s.name="张三";
		s.sex="男";
		s.age=20;
		s.show(s);
	}
}
