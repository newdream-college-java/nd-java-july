/*1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果*/
import java.util.Scanner;
public class Work04{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count_z=0;
		int count_f=0;
		int count_0=0;
		for(;;){
			System.out.println("请输入数字：");
			double a=sc.nextDouble();
			if(a==0){
				count_0++;
			}else if(a==999){
				break;
			}else if(a<0){
				count_f++;
			}else {
				count_z++;
			}
		}
		System.out.println("正数的个数："+count_z);
		System.out.println("负数的个数："+count_f);
		System.out.println("0的个数："+count_0);
	}
}