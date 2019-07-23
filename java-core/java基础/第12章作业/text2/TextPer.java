package job01.text2;

/*创建 Person 类和带参数构造方法，参数分别是姓名，性别和年龄
使用带参数的构造实例化对象
显示人员信息(如下图)*/
public class TextPer {
	public static void main(String[] args) {
		Person person=new Person();
		String name="张三";
		String sex="男";
		int age=18;
		person.show(name, sex, age);
	}
}
