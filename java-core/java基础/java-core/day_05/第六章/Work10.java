/*2.2��ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��*/
import java.util.Scanner;
public class Work10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int num=sc.nextInt();
			System.out.print("�������Ա���գ���/��<��2λ������ʾ>����");
			int birthdayMonth=sc.nextInt();
			System.out.print("/");
			int birthday=sc.nextInt();
			System.out.print("�������Ա����(<һ������>)��");
			int score=sc.nextInt();
			if(num>=1000&&num<=9999){
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�\n"+num+"\t"+birthdayMonth+"/"+birthday+"\t"+score);
				
			}else {
				System.out.println("��Ϣ����,¼��ʧ��");
			}
		}
	}
}