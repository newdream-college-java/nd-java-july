/*用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果*/
import java.util.*;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num=input.nextInt();
		int count1=0,count2=0,count3=0;
		while(num!=999){
			if(num>0){
				count1++;
			}else if(num<0){
				count2++;
			}else{
				count3++;
			}
			
			System.out.print("请输入一个整数：");
			num=input.nextInt();
		}
		System.out.println("输入结束");
		System.out.println("正数的个数为："+count1);
		System.out.println("负数的个数为："+count2);
		System.out.println("0的个数为："+count3);
	}
}