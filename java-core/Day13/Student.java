/**
 * 1.3.2、本学期期末学员共参加了 3 门课的考试，即 Java、C、SQL，编写方法计算
每位学员 3 门课的平均分
 * @author 54975
 *
 */
public class Student {
	int java;
	int c;
	int sql;
	Student[] array=new Student[5];
	public void getavg(){
		double avg;
		for (int i = 0; i < array.length; i++) {
			avg=array[i].java+array[i].c+array[i].sql;
			System.out.println("第"+i+"个学生的平均成绩是:"+avg);
		}
	}
	public void getStudent(Student a){
		boolean flas=false;
		for (int i = 0; i < array.length; i++) {
			if(array[i]!=null){
				flas=true;
				array[i]=a;
				break;
			}
		}
		if(!flas){
			return;
		}
	}
	
}
