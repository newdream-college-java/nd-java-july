/*7�������� GoodLuck ʵ�����˳齱���齱���򣺻�Ա�ŵİ�λ���ֵ��ڲ�����������ּ�Ϊ
���˻�Ա*/
import java.util.Random;
public class Work7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("�������ع������ϵͳ>���˳齱");
			System.out.println();
			System.out.println("������4λ��Ա�ţ�");
			int a = input.nextInt();
			int i = (int)(Math.random()*9+1);
			System.out.println(i);
			if(a/100%10==i){
				System.out.println(a+"�Ź˿������˹˿ͣ���ô�������һ����");
			}else System.out.println(a+"�Ź˿�,лл����֧�֣�");
		}
	}
}