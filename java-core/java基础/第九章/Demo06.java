/*
1.6���Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡�
���ͳ��ÿ�� �����ͷǷ����ֵĸ���
*/
import java.util.*;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"������");
			arr[i] = input.nextInt();
			if(arr[i] == 1||arr[i] == 2||arr[i] == 3){
				a++;
			}else{
				b++;
			}
		}
		System.out.println("������"+a+"����"+"�Ƿ�������"+b+"����");
	}
}