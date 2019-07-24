package job02.text4;

public class StudentBiz {
	
	public void  getAvg(Student stu) {
		double sum=0;
		double avg=0;
		stu.inPut();
		for (int i = 0; i < stu.cj.length; i++) {
			sum+=stu.cj[i];
		}
		avg=sum/stu.cj.length;
		System.out.println(stu.name+"的平均成绩为："+avg);
	}
}
