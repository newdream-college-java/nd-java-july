import java.util.Scanner;
public class Demo02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		//1.7��ѭ��������� 0 �����ֽ����ۼӣ�ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����
		int sum=0;
		int data=1;
		System.out.print("���������ֽ����ۼӣ�ֱ�����������Ϊ 0");
		for(;data!=0;){
			
			data=input.nextInt();
			sum+=data;
			if(data==0){
				break;
			}
		}
		System.out.println("�ۼ�ֵΪ"+sum);
	}
}