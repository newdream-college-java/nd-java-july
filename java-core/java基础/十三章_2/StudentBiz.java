package 十三章_2;

import java.util.Scanner;

public class StudentBiz {
	int number;
	Student[] stu;

	public void add() {
		Student[] stu = new Student[number];
		Scanner input = new Scanner(System.in);
		for (int j = 0; j < number; j++) {
			stu[j] = new Student();
			System.out.print("请输入第" + (j + 1) + "位学生的sql成绩：");
			int a = input.nextInt();
			stu[j].sqlscore = a;
			System.out.print("请输入第" + (j + 1) + "位学生的c成绩：");
			int b = input.nextInt();
			stu[j].cscore = b;
			System.out.print("请输入第" + (j + 1) + "位学生的java成绩：");
			int c = input.nextInt();
			stu[j].javascore = c;
			System.out.println("该学生平均分为："+stu[j].getAvg());
		}
	}
}
