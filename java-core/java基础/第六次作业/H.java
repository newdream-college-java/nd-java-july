/*	循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,
	要求使用 continue语句完成
*/

import java.util.Scanner;
public class H{
	public static void main(String[] args){
		int b=0;
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"成绩：");
			int a=input.nextInt();
			if(a<80){
				continue;
			}
			b++;
		}
		System.out.println("有"+b+"人的成绩大于 80 分");
	}
}
	
