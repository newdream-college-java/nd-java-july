/*
输入姓名，循环输入5门成绩，计算平局分
input  输入的意思
*/
import java.util.*;
public class Demo01{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//提示
		System.out.print("请输入姓名：");
		String name = input.next();

		int sum = 0;
		for(int i=1;i<6;i++){
			//循环体--输入成绩
			//提示
			System.out.print("请输入5门功课的第"+i+"门功课：");
			double cj = input.nextDouble();
			//累加成绩
			sum+=cj;
		}
		System.out.println("5门功课的平局分为："+sum/5.0);
	}
}