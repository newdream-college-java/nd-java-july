/*1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4����
��� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����*/
import java.util.Scanner;
public class Work01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(;;){
			System.out.print("��������������1-10��������-1�������򣩣�");
			int sum=1;
			int a=sc.nextInt();
			if(a==-1){
				break;
			}
			else if (a<1||a>10){
				System.out.println("�����������������");
			}else {
				for(int i=1;i<=a;i++){
					sum*=i;
				}
				System.out.println(a+"�Ľ׳˵���"+sum);
			}
			
		}
	}
}