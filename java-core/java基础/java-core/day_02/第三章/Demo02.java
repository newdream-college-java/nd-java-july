/*2、输入一个年份，判是闰年还是平年*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个年份：");
		int n=in.nextInt();
		if(n%400==0){
			System.out.println("该年为闰年！！！");
		}
		if(n%4==0&&n%100!=0){
			System.out.println("该年为闰年！！！");
		}else
		System.out.println("该年不是闰年！！！");	
	}
}