package work;
/**
 * 1.3�� ��д���������������ָ��λ�ò���Ԫ�أ��������ǰ�������ֵ ��ʾ:���� insertArray()��������: public void
 * insertArray(int [] arr,int index,int value){ } 
 * 1.3.2����ѧ����ĩѧԱ���μ��� 3�ſεĿ��ԣ��� Java��C��SQL����д�������� ÿλѧԱ 3 �ſε�ƽ���� ��ʾ:���� Student �࣬��� 3 �ſεĳɼ�����;����
 * StudentBiz �࣬���� getAvg() public Students getAvg(Student stu){ }
 */

public class Work3 {
	public void intsertArray(int[] arr, int index,int value) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < index; i++) {
			arr[i] = arr[i+1];
		}
		arr[index] = value;
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	public static void main(String[] args) {
		//int [] arr = {0,1,2,3,4,7,9};
		//Work3 work3 = new Work3();
		//work3.intsertArray(arr, 3, 5);
		Student stu = new Student();
		stu.C = 89.0;
		stu.Java = 66.5;
		stu.SQL = 59.9;
		
		Student stu2 = new Student();
		stu2.C = 99.0;
		stu2.Java = 98.0;
		stu2.SQL = 70.5;
		
		StudentBiz sBiz = new StudentBiz();
		System.out.println(sBiz.getAvg(stu));
		System.out.println(sBiz.getAvg(stu2));
	}

}
