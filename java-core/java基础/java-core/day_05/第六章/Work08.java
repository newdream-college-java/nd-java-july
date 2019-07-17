/*1.8、循环接收 5 名学生的成绩,统计有多少人的成绩大于 80 分,要求使用 continue 语句完成。*/
import java.util.Scanner;
public class Work08{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int i=5;
		int j=5;
		for(;i>=1;i--){
			System.out.print("请输入第"+(6-i)+"名同学的成绩：");
			double score=sc.nextDouble();
			if(score>80){
				continue;
			}
			j--;
		}
		System.out.println("成绩大于 80 分人有"+j+"人！");
	}
}