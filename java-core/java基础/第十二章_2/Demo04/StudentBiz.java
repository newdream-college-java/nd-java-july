package chapter12_2;

public class StudentBiz {
	Student[] stus = new Student[5];
	
	public double getAvg(Student stus){
		double avg = 0;
		avg = (stus.C + stus.Java + stus.SQL)/3.0;
		return avg;
	}
	
}
