/*
1.2、 循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用
continue 语句完成
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i = 1;i<=5;i++){
			System.out.print("请输入第"+i+"名学生成绩：");
			int score = input.nextInt();
			if(score>80){
				sum++;
				continue ;
			}
		}
		System.out.println("有"+sum+"名学生成绩大于80分。");
	}
}