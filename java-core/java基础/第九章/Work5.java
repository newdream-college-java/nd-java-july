package nine;

import java.util.Scanner;

public class Work5 {

	/**
	 * 1.5、输入 10 个学生的单科成绩，求成绩在 60 分以下(不含)、60~80 分(含 60 不含 80)
	 *	和 80 分以上 的学生各有多少个?并求出最高分、最低分和平均分
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] a = new double[10];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("请输入第"+(i+1)+"个学生的成绩：");
			a[i] = sc.nextDouble();
			if(a[i]>=80){
				count1++;
			}else if (a[i]>=60) {
				count2++;
			}else {
				count3++;
			}
			sum+=a[i];
		}
		System.out.print("80分以上的有"+count1+"个\t60~80分的有"+count2+"个\t低于60分的有"+count3+"个\n");
		System.out.println("平均分为："+sum/a.length);
	}

}
