import java.util.Scanner;
/*
 �Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡�
���ͳ��ÿ�� �����ͷǷ����ֵĸ�����
 */

public class Demo06 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���������鳤�ȣ�");
		int n=input.nextInt();
		int arr[]=new int[n];
		int count1=0,count2=0,count3=0,count4=0;
		for(int i=0;i<arr.length;i++){
			System.out.print("�������"+(i+1)+"��������");
			arr[i]=input.nextInt();
			if(arr[i]==1){
				count1++;
			}else if(arr[i]==2){
				count2++;
			}else if(arr[i]==3){
				count3++;
			}else{
				count4++;
			}
		}
		System.out.println("����Ϊ1�ĸ���Ϊ��"+count1);
		System.out.println("����Ϊ2�ĸ���Ϊ��"+count2);
		System.out.println("����Ϊ3�ĸ���Ϊ��"+count3);
		System.out.println("�Ƿ����ֵĸ���Ϊ��"+count4);
	}
}
