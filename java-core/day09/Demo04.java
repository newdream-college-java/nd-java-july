import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {

	/**
	 * 1.5、输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分 (含 60 不含 80)和 80 分以上
	 * 的学生各有多少个?并求出最高分、最低分和平均分
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * int sum1=0;//60分以下 int sum2=0;//60<= x <80 int sum3=0;//80分以上 double
		 * sum=0;//总分数 double min=0;//最小值 double max=0;//最大值 for(int
		 * i=1;i<=10;i++){ System.out.print("请输入第"+i+"个同学的单科成绩:"); double
		 * data=input.nextDouble(); if(data<60){ if(max>data){ max=data; }
		 * sum1++; }else if(data>80){ sum2++; }else{ if(data>min){ min=data; }
		 * sum3++; } sum++; }
		 * System.out.println("60 分以下(不含):"+sum1+"\n60~80 分(含 60 不含 80):"
		 * +sum3+"\n80 分以上"+sum2);
		 * System.out.println("最高分:"+min+"最低分:"+max+"平均分"+sum/10.0);
		 */
		double[] arr = new double[10];
		int sum1 = 0;// 60分以下
		int sum2 = 0;// 60<= x <80
		int sum3 = 0;// 80分以上
		double sum = 0;
		for (int i = 0; i < 10; i++) {
			System.out.print("请输入第" + i + "个同学的单科成绩:");
			double data = input.nextDouble();
			arr[i] = data;
		}
		Arrays.sort(arr);
		for (int j = 0; j < 10; j++) {
			if (arr[j] < 60) {
				sum1++;
			} else if (arr[j] >= 80) {
				sum3++;
			} else {
				sum2++;
			}
			sum += arr[j];
		}
		System.out.println("60 分以下(不含):" + sum1 + "\n60~80 分(含 60 不含 80):"
				+ sum3 + "\n80 分以上" + sum2);
		System.out.println("最高分:" + arr[arr.length - 1] + "最低分:" + arr[0]
				+ "平均分" + sum / 10.0);
	}

}
