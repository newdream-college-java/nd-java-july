/*1.8、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue
语句完成。*/
import java.util.*;
public class Demo08{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int count=0;
		for(int i=1;i<=5;i++){
			System.out.print("请输入学生的成绩（0-100）：");
			int score=input.nextInt();
			if(score<0||score>100){
				System.out.print("输入错误，");
				i--;
				continue;
			}
			if(score>80){
				count++;
			}
		}
		System.out.println("成绩大于 80 分的学生个数为："+count);
	}
}