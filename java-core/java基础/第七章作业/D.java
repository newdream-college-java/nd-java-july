/*1.4、用户可以无限次的输入数字，请统计用户输入的数字中正数的个数，负数
的个数，0 的个数。直到用户输入 999 就结束，输出统计结果*/
import java.util.*;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int count1=0,count2=0,count3=0;
		while(true){
			System.out.print("请输入数字：");
			int a=input.nextInt();
			if(a>0&&a!=999){
				count1++;
			}else if(a<0){
				count2++;
			}else if(a==0){
				count3++;
			}else{
				break;
			}
		}
		System.out.println("正数有"+count1+"个\n"+"负数有"+count2+"个\n"+"0有"+count3+"个");
	}
}
