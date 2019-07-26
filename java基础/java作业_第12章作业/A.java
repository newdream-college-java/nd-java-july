import java.util.Scanner;

public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A p = new A();
		p.show();
	}

	String[] c = new String[5];

	public void show() {
		Scanner input = new Scanner(System.in);
		int d = 0;
		for (int i = 0; i < c.length; i++) {

			System.out.print("请输入客户的姓名：");
			String a = input.next();
			c[i] = a;
			d++;
			System.out.print("继续输入吗？（y/n）：");
			String b = input.next();

			if (b.equals("n")) {

				break;
			}
		}

		System.out.println("*****************************");
		System.out.println("\t客户姓名列表");
		System.out.println("*****************************");
		for (int i = 0; i < d; i++) {
			System.out.print(c[i] + "\t");
		}
	}

	public void xg(String name) {
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		for (int i = 0; i < c.length; i++) {
		
			if (c[i].equals(name)) {
				flag = true;
				System.out.println("请输入新的客户姓名：");
				String n = input.next();
				c[i]=n;
				System.out.println("******修改结果******");
				System.out.println("找到并修改成功！");
				break;
			}
		}
		if (!flag) {
			System.out.println("未找到这个人！");
		}
	}
	public void cx(){
		System.out.println("*****************************");
		System.out.println("\t客户姓名列表");
		System.out.println("*****************************");
		for(int i=0;i<c.length;i++){
			if(c[i]!=null){
				System.out.println(c[i]+"\t");
			}
		}
	}

}
