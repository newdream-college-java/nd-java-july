	/**
	 * 1.1、需求说明
		编写管理员 Manager，使用 show()方法返回管理员信息(使用 return 语句实现信息
		的返回)
	 */
package Work;

public class Manager {
	String name = "admin";
	String passWord = "0000";
	public String returnName() {
		return name;
	}
	public String returnPassWord() {
		return passWord;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		System.out.println("管理员用户名："+manager.returnName()+"\t用户密码："+manager.returnPassWord());
	}

}
