/*
1.8、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue
语句完成
*/
import java.util.Scanner;
public class Demo08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for(int i = 1;i<=5;){
			System.out.print("请输入你的分数：");
			double score = input.nextDouble();
			if(score<0||score>100){
				System.out.println("您的输入有误，请重新输入。");
				continue ;
			}
			 if(score>80){
				sum++;	
				i++;
			}
			else{
				i++;
			}
		}
		System.out.println("有"+sum+"人的成绩大于80分。");
	}
}