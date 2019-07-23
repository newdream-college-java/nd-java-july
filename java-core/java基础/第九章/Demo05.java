/*
1.5、输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)
和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分 
*/
import java.util.*;
public class Demo05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sum = 0;
		double[] score = new double[10];
		double max = score[0];
		double min = 100s.0;
		int a = 0;
		int b = 0;
		int c = 0;
		for(int i= 0;i<score.length;i++){
			System.out.print("请输入第"+(i+1)+"个学生的成绩：");
			score[i] = input.nextDouble();
			sum+=score[i];
			if(score[i]>max){
				max = score[i];
			}
			if(score[i]<min){
				min = score[i];
			}
			if(score[i]<60){
				a++;
			}else if(score[i]>=60&&score[i]<80){
				b++;
			}else{
				c++;
			}
		}
		System.out.println("成绩在60分以下的有："+a+"人");
		System.out.println("成绩在60~80分的有："+b+"人");
		System.out.println("成绩在80分以上的有："+c+"人");
		System.out.println("最高分："+max+"最低分："+min+"平均分："+sum/10.0);
	}
}