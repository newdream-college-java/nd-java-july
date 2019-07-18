/*1.5、输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分*/
import java.util.*;
public class Work05{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[] score=new double[10];
		double a=0,b=0,c=0,sum=0;
		for(int i=0;i<score.length;i++){
			System.out.print("请输入第"+(i+1)+"名学生的成绩：");
			score[i]=in.nextDouble();
			if(score[i]<60){
				a++;
			}else if(score[i]>=60&&score[i]<80){
				b++;
			}else {
				c++;
			}
			sum+=score[i];
		}
		double max=score[0],min=score[0];
		for(int i=1;i<score.length;i++){
			if(max<score[i]){
				max=score[i];
			}
			if(min>score[i]){
				min=score[i];
			}
		}
		System.out.println("60 分以下(不含)的有："+a+"个");
		System.out.println("60~80 分(含 60 不含 80)的有："+b+"个");
		System.out.println("80 分以上的有："+c+"个");
		System.out.println("最高分是："+max);
		System.out.println("最低分是："+min);
		System.out.println("平均分是："+sum/score.length);
		
	}
}