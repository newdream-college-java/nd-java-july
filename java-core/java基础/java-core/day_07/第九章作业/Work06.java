/*1.6���Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡����ͳ��ÿ�� �����ͷǷ����ֵĸ�����*/
import java.util.*;
public class Work06{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] a=new int[10];
		int h=0,f=0;
		for(int i=0;i<a.length;i++){
			System.out.print("�������"+(i+1)+"��������");
			a[i]=in.nextInt();
			if(a[i]==1||a[i]==2||a[i]==3){
				h++;
			}else {
				f++;
			}
		}
		System.out.println("�Ϸ������У�"+h+"��\n"+"�Ƿ�������"+f+"��");
	}
}
