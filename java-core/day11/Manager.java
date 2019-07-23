/**编写管理员 Manager，使用 show()方法返回管理员信息(使用 return 语句实现信息
*的返回)
*/

public class Manager {
	String[] test={"newdream","0000"};
	public String[] show(){
		return test;
	} 
	public static void main(String[] args) {
		Manager test=new Manager();
		//test.show();
		System.out.println("管理员信息用户名为"+test.show()[0]+"密码为"+test.show()[1]);
	}
}
