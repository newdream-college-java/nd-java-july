import java.util.Scanner;
public class Demo03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double results=0;
		int statistical=0;
		//1.8��ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ�� continue�����ɡ�
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"λͬѧ�ĳɼ�\n");
			results=input.nextDouble();
			if(results>80){
				statistical++;
				continue;
			}
		}
		System.out.println("����80�ֵ���"+statistical);
	}
}