/*
 �Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡�
 ���ͳ��ÿ�� �����ͷǷ����ֵĸ�����
 */
import java.util.*;
public class Demo06{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.print("�����룺");
			a[i] = input.nextInt();
			if (a[i] != 1 && a[i] != 2 && a[i] != 3) {
				count1++;
			}else if(a[i]==1){
				count2++;
			}else if(a[i]==2){
				count3++;
			}else if(a[i]==3){
				count4++;
			}else{
				System.out.println("�������");
			}
		}
		System.out.println("�Ƿ������У�" + count1 + "��");
		System.out.println("����1�У�" + count2 + "��");
		System.out.println("����2�У�" + count3 + "��");
		System.out.println("����3�У�" + count4 + "��");
	}
}