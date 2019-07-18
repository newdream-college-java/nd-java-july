/*
循环输入5个同学的成绩，求出平均分分和最高分和最低分
*/
import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		//提示
		System.out.println("请输入学生的人数：");
		int count = input.nextInt();
		double sum = 0;
		double[] scores = new double[count];
		//假设法 假设最高分为 数组的第1个元素
		double max = scores[0];
		double min = scores[0];


		for(int i=0;i<scores.length;i++){//i代表数组的下标
			//提示：
			System.out.print("请输入第"+(i+1)+"个同学的成绩：");
			scores[i] = input.nextDouble();
			//求和
			sum+=scores[i];

			if(scores[i]>max){
				max = scores[i];
			}
			if(scores[i]<min){
				min = scores[i];
			}

		}
		//平均分
		System.out.println("平均分为:"+sum/scores.length+"，最高分为："+max+",最低分为："+min);

	}
}