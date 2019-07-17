/*	用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
	的个数，0 的个数。直到用户输入 999 就结束，输出统计结果
 */
import java.util.Scanner;

public class D{
	public static void main (String[] args){
		Scanner input=new Scanner(System.in);
		int count1=0,count0=0,count=0;
		while(true){
			int a=input.nextInt();
			//判断是否退出
			if(a==999){
				break;
			}
			//判断a的范围，并给相应的计数器加一
			if(a<0){
				count++;
			}else if(a==0){
				count0++;
			}else{
				count1++;
			}
		}
		System.out.println("正数的个数:"+count1);
		System.out.println("负数的个数:"+count);
		System.out.println("0的个数:"+count0);
	}
}