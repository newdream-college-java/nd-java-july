import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		/*1.1�� ʹ�� for ѭ���� break ���ʵ�֣��� 1 һֱ�ӵ� 100,������ۼӵĺʹ��� 500
ҲҪ����ѭ�����������ʱ�Ѿ��ӵ�������ʲô��*/
		int i=1;
		int sum=0;
		for(;i<=100;i++){
			sum+=i;
			if(sum>500){
				break;
			}
		}
		System.out.println("�Ѿ��ӵ���"+i);
		/*1.2�� ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ��
		continue �����ɡ�*/
		Scanner input=new Scanner(System.in);
		double results;
		int cn=0;
		for(int j=1;j<=5;j++){
			System.out.print("�������"+i+"��ѧʿ�ɼ�");
			results=input.nextDouble();
			if(results>80){
				cn++;
				continue;
			}
		}
		System.out.println("����80�ֵ���"+cn+"��");
	}
}