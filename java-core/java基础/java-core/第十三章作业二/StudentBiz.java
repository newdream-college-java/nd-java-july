package chapter_13_2;
/*1.3.2、本学期期末学员共参加了 3 门课的考试，即 Java、C、SQL，编写方法计算每位学员 3 门课的平均分
提示:定义 Student 类，添加 3 门课的成绩属性;定义 StudentBiz 类，定义 getAvg() 
public Students getAvg(Student stu){ }*/
public class StudentBiz {
	public void getAvg(Student stu){
		double sum=stu.JavaScore+stu.CScore+stu.SQLScore;
		double avg=sum/3;
		System.out.println("三门课的平均分为："+avg);
	}
	public static void main(String[] args) {
		StudentBiz s=new StudentBiz();
		Student stu1=new Student();
		stu1.JavaScore=99;
		stu1.CScore=98;
		stu1.SQLScore=96;
		s.getAvg(stu1);
	
	}
}
