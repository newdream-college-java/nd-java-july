/*
2、输入一个年份，判是闰年还是平年
*/
import java.util.*;
public class Demo02{
	public static void main(String [] args){
		System.out.print("请输入年份：");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if(x%4!=0||x%100==0&&x%400!=0)
		System.out.print("其是平年");
		else
		System.out.print("其是闰年");
	}
}