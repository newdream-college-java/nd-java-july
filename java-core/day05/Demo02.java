import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		/*
		1.7�� �Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ����Ϣ������ 1~7 ֮��
		��ֵʱ����ʾ�����������룬ֱ������ 0 �˳�ѭ����
		1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
		*/
		Scanner input=new Scanner(System.in);
		int data;
		String value="";
		do{
			System.out.println("���� 1~7 ֮���ֵ,���� 0 �˳�ѭ����");
			data=input.nextInt();
			switch(data){
				case 0:
				System.exit(-1);
				case 1:
					value="MON";
					break;
				case 2:
					value="TUE";
					break;
				case 3:
					value="WED";
					break;
				case 4:
					value="THU";
					break;
				case 5:
					value="FRI";
					break;
				case 6:
					value="SAT";
					break;
				case 7:
					value="SUN";
					break;
				default:
					System.out.println("������������������");
			}
		}while(data<0||data>7);
		System.out.print(value);
	}
}