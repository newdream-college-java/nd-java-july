package proJob11.text1;

/*编写管理员 Manager，使用 show()方法返回管理员信息(使用 return 语句实现信息
的返回)*/
public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
	}
	
	public static String names(){
		String name="newdream";
		return name;
	}
	
	public static String password(){
		String psw="0000";
		return psw;
	}
	public static void show() {
		System.out.println("管理员信息用户名为："+names()+"\t密码为："+password());
	}
}
