/*1.4���û��������޴ε��������֣���ͳ���û�����������������ĸ���������
�ĸ�����0 �ĸ�����ֱ���û����� 999 �ͽ��������ͳ�ƽ��*/
import java.util.Scanner;
public class Work4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int zsCount = 0;
		int fsCount = 0;
		int zCount = 0;
		int a;
		while(true){
			System.out.print("����������������");
			a = sc.nextInt();
			if(a==999){	
				break;
			}else if(a>0){
				zsCount++;
			}else if(a<0){
				fsCount++;
			}else
				zCount++;

		}
		System.out.println("��������"+zsCount+"��");
		System.out.println("��������"+fsCount+"��");						System.out.println("����"+zCount+"��");
	}
}