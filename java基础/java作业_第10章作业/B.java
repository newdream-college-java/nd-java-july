import java.util.*;
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
			a.ka();
	}
	public void ka(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入卡的类型（金卡，普卡）：");
		String a = input.next();
		System.out.print("请输入你的积分：");
		int b = input.nextInt();
		if(a.equals("金卡")&&b>1000){
			System.out.println("回馈积分：500分！");
		}else if(a.equals("金卡")&&b<1000){
			System.out.println("抱歉，没有回馈积分！");
		}else if(a.equals("普卡")&&b>5000){
			System.out.println("回馈积分：500分！");
		}else if(a.equals("普卡")&&b<5000){
			System.out.println("抱歉，没有回馈积分！");
		}
	}
}
