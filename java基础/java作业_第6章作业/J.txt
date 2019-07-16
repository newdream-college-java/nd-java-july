import java.util.*;
public class J{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int i = 1;
		String num;
		String b;
		int c;
		System.out.println("请输入第1位会员号（<4位整数>）：");
		while(i<=3){
		
		if(input.hasNextInt()){
		
		num = input.next();
	
		}else {
		num = input.next();
		System.out.println("录入失败，请重新输入：");
		num = input.next();
		}
		System.out.println("请输入会员生日(月/日<用两位整数表示>)：");
		b = input.next();
		
		
		System.out.println("请输入会员积分：");
		c = input.nextInt();
		
		System.out.println("您录入的会员信息是："+num+"\t"+b+"\t"+c);
		i++;
		System.out.println("请输入第"+i+"位会员号（<4位整数>）：");
		}
		System.out.println("程序结束！");
	}
}