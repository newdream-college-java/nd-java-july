import java.util.Scanner;

/*1.5、输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)
和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分*/

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double[] scores=new double[10];
		int count1=0,count2=0,count3=0;
		double sum=0;
		System.out.println("请输入学生的成绩：");
		for (int i = 0; i < scores.length; i++) {
			System.out.print("第"+(i+1)+"个同学的成绩为：");
			scores[i]=input.nextDouble();
			if (scores[i]<60) {
				count1++;
			}else if (scores[i]>=60&&scores[i]<80) {
				count2++;
			}else{
				count3++;
			}
			sum+=scores[i];
		}
		double max=scores[0],min=scores[0];
		for (int i = 1; i < scores.length; i++) {
			max=max<scores[i]?scores[i]:max;
		}
		for (int i = 1; i < scores.length; i++) {
			min=min>scores[i]?scores[i]:min;
		}
		System.out.println("学生成绩60分以下人数："+count1+"\n"+"学生成绩60分以上80分以下人数："+count2+"\n"+"学生成绩80分以上人数："+count3+"\n"+"平均分为："+sum/10.0+"\n"+"最大值为："+max+"\n"+"最小值为:"+min);
	}

}
