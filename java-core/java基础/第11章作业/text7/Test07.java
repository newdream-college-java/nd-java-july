package proJob11.text7;
//���һ���ж�ĳ���Ƿ�����ķ�����Ȼ���� main �����е��ã�������
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panDuan();
	}	
	
	public static void panDuan() {
		Scanner input=new Scanner(System.in);
		System.out.print("�����������жϵ���ݣ�");
		int year=input.nextInt();
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"��������");
		}else {
			System.out.println(year+"����ƽ��");
		}
	}

}
