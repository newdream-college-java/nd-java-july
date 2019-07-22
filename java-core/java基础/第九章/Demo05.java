
/*
 输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)
 和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分 
 */
import java.util.*;
public class Demo05{
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		double min = 100, max = 0, sum = 0;
		Scanner input = new Scanner(System.in);
		double[] score = new double[10];
		for (int i = 0; i < score.length; i++) {
			System.out.print("第" + (i + 1) + "名学生的成绩：");
			score[i] = input.nextDouble();
			if (score[i] > 100 || score[i] < 0) {
				System.out.println("输入有误！！！");
				break;
			}
			max = max > score[i] ? max : score[i];
			min = min < score[i] ? min : score[i];
			if (score[i] >= 80) {
				a++;
			} else if (score[i] >= 60 && score[i] < 80) {
				b++;
			} else {
				c++;
			}
			sum += score[i];
		}
		System.out.println("成绩在 60 分以下(不含)有：" + c + "个");
		System.out.println("成绩在60~80 分(含 60 不含 80)有：" + b + "个");
		System.out.println("成绩在80 分以上有：" + a + "个");
		System.out.println("最低分为：" + min);
		System.out.println("最高分为：" + max);
		System.out.println("平均分为：" + sum / 10);

	}
}