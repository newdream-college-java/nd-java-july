/*1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue �����ɡ�*/
import java.util.Scanner;
public class Work8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int i = 1;i<= 5;i++){
			System.out.print("�������"+i+"���ɼ���");
			int a = sc.nextInt();
			if(a>80){
				count++;
			}else
				continue;
		}
		System.out.println("����80�ֵ���   "+count+"   ��");
	}
}