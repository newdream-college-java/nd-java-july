/*ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����*/
import java.util.*;
public class Demo07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������ֵ����enter�������룬��0�������룩��");
		int sum=0;
		int i;
		do{
			i=input.nextInt();
			sum+=i;
		}while(i!=0);
		System.out.println("����������ĺ�Ϊ��"+sum);
	}
}