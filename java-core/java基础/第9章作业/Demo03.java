import java.util.Arrays;
import java.util.Scanner;


/*��һ��������ַ������������� ��������洢ԭ�ַ�����
���� Array ��� sort( )����������������򣬲�ѭ����� �����һ��Ԫ�ؿ�ʼ��
�������е�Ԫ���������*/
public class Demo03 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������鳤�ȣ�");
		int n=input.nextInt();
		char zf[]=new char[n];
		for(int i=0;i<zf.length;i++){
			System.out.print("�������"+(i+1)+"�����ַ���");
			zf[i]=input.next().charAt(0);
		}
		System.out.print("ԭ�ַ����У�");
		for(int i=0;i<zf.length;i++){
			System.out.print(zf[i]+"\t");
		}
		System.out.println();
		Arrays.sort(zf);
		System.out.print("���������");
		for(int i=0;i<zf.length;i++){
			System.out.print(zf[i]+"\t");
		}
		System.out.println();
		System.out.print("�������Ϊ��");
		for(int i=0;i<zf.length/2;i++){
			char temp=zf[i];
			zf[i]=zf[zf.length-i-1];
			zf[zf.length-i-1]=temp;
		}
		for(int i=0;i<zf.length;i++){
			System.out.print(zf[i]+"\t");
		}
	}
}
