/**
 * 1.3.2����ѧ����ĩѧԱ���μ��� 3 �ſεĿ��ԣ��� Java��C��SQL����д��������
ÿλѧԱ 3 �ſε�ƽ����
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
			System.out.println("��"+i+"��ѧ����ƽ���ɼ���:"+avg);
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
