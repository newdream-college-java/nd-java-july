package Chapter11_类的无参方法;

/*
编写管理员 Manager，使用 show()方法返回管理员信息(使用 return 语句实现信息的返回)
方法的定义和调用;循环结构
*/

public class Manager {
	/**
	 *定义类的属性
	 */
	String 用户名;
	String 密码;
	
	
	/**
	 * 返回属性值
	 */
	public String show() {
		return "用户名：" + 用户名 + ",密码:" + 密码;

	}
	/**
	 *
	 *主函数
	 */
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.用户名 = "newdream";
		manager.密码 = "0000";
		System.out.println(manager.show());
	}

}
