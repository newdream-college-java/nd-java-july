/*2.2��ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��*/
import java.util.Scanner;
public class Work10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<3;i++){
			System.out.print("�������Ա�ţ�<4λ����>����");
			int vip = sc.nextInt();
			if(vip>=9999||vip<=1000){
				System.out.println("¼��ʧ��");
				continue;
			}
			System.out.print("�������Ա���գ���/��<��2λ������ʾ>����");
			String bd = sc.next();
			System.out.print("�������Ա���֣�");
			int jf = sc.nextInt();			
			System.out.println("��¼��Ļ�Ա��Ϣ���ǣ�");
			System.out.println(vip+" "+bd+" "+jf);
			System.out.println();
		} 
		System.out.println("���������");
	}
}