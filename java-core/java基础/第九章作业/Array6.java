import java.util.Scanner;

/*1.6���Ӽ��������� 10 ���������Ϸ�ֵΪ 1��2��3�������� 3 ������Ϊ�Ƿ����֡�
���ͳ��ÿ�� �����ͷǷ����ֵĸ�����*/

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int count1=0,count2=0;
		for (int i = 0; i < 10; i++) {
			System.out.print("�������"+(i+1)+"�����֣�");
			int a=input.nextInt();
			if (a==1||a==2||a==3) {
				count1++;
			}else{
				count2++;
			}
		}
		System.out.println("�Ϸ����ָ�����"+count1+"\n"+"�Ƿ����ָ�����"+count2+"\n");
	}

}
