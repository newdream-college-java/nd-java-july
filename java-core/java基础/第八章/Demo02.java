/*
1.2�� ѭ������ 5 ��ѧ���ĳɼ�,ͳ���ж����˵ĳɼ����� 80 ��,Ҫ��ʹ��
continue ������
*/
import java.util.*;
public class Demo02{
	public static void main(String[] args){
		int count = 0;
		for(int i=1;i<=5;i++){
			Scanner input= new Scanner(System.in);
			System.out.print("������ɼ�:");
			if(input.hasNextInt()){
				int score = input.nextInt();
				if(score<80){
					continue;
				}
				count++;
			}else{	
				i--;
				System.out.println("���벻�Ϸ�");
			}
		}
		System.out.print("��"+count+"�˳ɼ�����80");
	}
}