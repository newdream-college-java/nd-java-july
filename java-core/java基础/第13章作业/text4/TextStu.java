package job02.text4;

/*ѧ����ĩѧԱ���μ��� 3 �ſεĿ��ԣ��� Java��C��SQL����д��������
ÿλѧԱ 3 �ſε�ƽ����*/
import java.util.Scanner;

public class TextStu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		StudentBiz stud=new StudentBiz();
		Student stu=new Student();
		System.out.print("������ѧ��������");
		stu.name=scanner.next();
		stud.getAvg(stu);
		System.out.print("�Ƿ������(y/n):");
		char ans=scanner.next().charAt(0);
		while(ans=='y') {
			System.out.print("������ѧ��������");
			stu.name=scanner.next();
			stud.getAvg(stu);
			System.out.print("�Ƿ������(y/n):");
			ans=scanner.next().charAt(0);
		}
		System.out.println("������");
	}

}
