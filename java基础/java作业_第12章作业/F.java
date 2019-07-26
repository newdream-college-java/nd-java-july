import java.util.Scanner;


public class F {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入两个整数：");
		int q = input.nextInt();
		int w = input.nextInt();
		F p = new F();
		System.out.println("最大值为："+p.show(q, w));
		System.out.println("请输入一个整数：");
		int e = input.nextInt();
		System.out.println("个位数为："+p.show1(e));
		System.out.println("请输入一个整数：");
		int r = input.nextInt();
		System.out.println("它的立方为："+p.show2(r));
		System.out.println("请输入一个正整数：");
		int t = input.nextInt();
		System.out.println("这个数的累加和为："+p.show3(t));
	}
	public int show(int a,int b){
		int c;
		if(a>b){
			c=a;
		}else {
			c=b;
		}
		return c;
	}
	public int show1(int a){
		int c=0;
		c=a%10;
		return c;
	}
	public int show2(int a){
		int c=0;
		c=a*a*a;
		return c;
	}
	public int show3(int a){
		int c=0;
		if(a>0){
			for(int i=1;i<=a;i++){
				c+=a;
			}
		}else {
			System.out.println("输入错误");
			
		}
		return c;
	}
}
