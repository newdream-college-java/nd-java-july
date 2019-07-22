package 第11章作业;
/*
 * 1.1、需求说明
编写管理员 Manager，使用 show()方法返回管理员信息(使用 return 语句实现信息
的返回)
*/
public class Manager {
	String name;
	String password;

	public String show() {
		return "管理员信息用户名为："+name+"\t"+"密码为:"+password;
	}
	
	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.name="张三";
		m1.password="1234";
		System.out.println(m1.show());
	}
}
