import java.util.Scanner;
import java.util.Random;
//import java.lang.Integer;
public class GoodLuck{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//创建类 GoodLuck 实现幸运抽奖，抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员
		System.out.print("超级大鸡霸购物管理系统 > 幸运抽奖\n");
		System.out.print("请输入4位会员号：");
		int data=input.nextInt();
		String code="";
		Random random=new Random();//申明随机类
		for(int i=1;i<=6;i++){
			code+=random.nextInt(10);
		}
		System.out.println("产生的随机数是"+code);
		code=code.substring(2,6);
		System.out.println("产生的随机数后四位是"+code);
		int a=Integer.parseInt(code);//转换为整数类型
		if(a==data){
			System.out.println(data+"号客户是幸运客户，获得奖金");
		}else{
			System.out.println(data+"号客户,谢谢您的支持！");
		}
	}
}