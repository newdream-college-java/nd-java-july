/*
1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数 
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果
*/
import java.util.*;
public class Demo04{
	public static void main (String [] args){
		int count1=0,count2=0,count3=0;
		while(true){
			Scanner input = new Scanner (System.in);
			System.out.print("请输入一个整数：");
			if(input.hasNextInt()){
				int a = input.nextInt();
				if(a==999){
					System.out.println("正数有"+count1+"个");
					System.out.println("负数有"+count2+"个");
					System.out.print("零有"+count3+"个");
					break;
				}else if(a<0){
					count2++;
				}else if(a>0){
					count1++;
				}else{
					count3++;
				}
			}else{
				System.out.println("请输入整数！！");		
			}
		}
	}
}