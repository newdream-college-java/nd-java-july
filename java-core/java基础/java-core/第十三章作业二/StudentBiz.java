package chapter_13_2;
/*1.3.2����ѧ����ĩѧԱ���μ��� 3 �ſεĿ��ԣ��� Java��C��SQL����д��������ÿλѧԱ 3 �ſε�ƽ����
��ʾ:���� Student �࣬��� 3 �ſεĳɼ�����;���� StudentBiz �࣬���� getAvg() 
public Students getAvg(Student stu){ }*/
public class StudentBiz {
	public void getAvg(Student stu){
		double sum=stu.JavaScore+stu.CScore+stu.SQLScore;
		double avg=sum/3;
		System.out.println("���ſε�ƽ����Ϊ��"+avg);
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
