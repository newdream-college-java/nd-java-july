package 第十三章作业2;

import java.util.Scanner;

/*1.3.2、本学期期末学员共参加了 3 门课的考试，即 Java、C、SQL，编写方法计算
每位学员 3 门课的平均分
提示:定义 Student 类，添加 3 门课的成绩属性;定义 StudentBiz 类，定义 getAvg() 
public Students getAvg(Student stu){ }*/
public class StudentBiz {
	public Students getAvg(Students stu){ 
		stu.avg=(stu.Java+stu.C+stu.SQL)/3;
		return stu;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Students student=new Students();
		System.out.print("请输入学生的java成绩：");
		student.Java=input.nextDouble();
		System.out.print("请输入学生的C语言成绩：");
		student.C=input.nextDouble();
		System.out.print("请输入学生的SQL成绩：");
		student.SQL=input.nextDouble();
		StudentBiz sBiz=new StudentBiz();
		System.out.println("学生成绩平均分为："+sBiz.getAvg(student).avg);
	}

}
