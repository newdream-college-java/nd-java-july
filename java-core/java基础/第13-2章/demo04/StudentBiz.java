package demo04;


public class StudentBiz {
	public void getAvg(Student stu){
		double avg=stu.javaSocre+stu.cScore+stu.sqlScore;
		System.out.println("平均分为："+avg/3);
	}
}
