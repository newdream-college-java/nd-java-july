/*1.5、输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)
和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分*/
import java.util.*;
public class Demo05{
	public static void main(String [] args){
		Scanner input =new Scanner(System.in);
		double [] score=new double[10];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<10;i++){
			System.out.print("请输入第"+(i+1)+"位学生的成绩：");
			score[i]=input.nextDouble();
			if(score[i]<60){
				sum1++;
			}else if(score[i]>=80){
				sum2++;
			}
		}
		System.out.println("成绩在 60 分以下(不含)的有："+sum1+"个");
		System.out.println("成绩在 60~80 分(含 60 不含 80)的有："+(10-sum1-sum2)+"个");
		System.out.println("成绩在 80 分以上的有："+sum2+"个");
	}	
}