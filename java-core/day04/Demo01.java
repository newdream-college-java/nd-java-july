import java.util.Scanner;
import java.util.Random;
public class Demo01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t��ӭʹ�ó����󼸰ѹ������ϵͳ");
		System.out.println("\t\t\t1.��½");
		System.out.println("\t\t\t2.�Ƴ�");
		System.out.println("************************************************************");
		System.out.println("��ѡ������������:");
		int score=input.nextInt();
		switch(score){
			case 1:
			System.out.println("\t\t��ӭʹ�ó����󼸰ѹ������ϵͳ");
			System.out.println("************************************************************");
			System.out.println("\t\t\t1.�ͻ���Ϣ����");
			System.out.println("\t\t\t2.�������");
			System.out.println("\t\t\t3.�������");
			System.out.println("\t\t\t4.ע��");
			System.out.println("************************************************************");
			System.out.println("��ѡ�����������֣�");
			score=input.nextInt();
			switch(score){
				case 1:
				System.out.println("�󼦰Թ������ϵͳ>�ͻ���Ϣ����");
				System.out.println("1.��ʾ���пͻ���Ϣ");
				System.out.println("2.������пͻ���Ϣ");
				System.out.println("3.�޸����пͻ���Ϣ");
				System.out.println("4.��ѯ���пͻ���Ϣ");
				break;
				case 2:
				break;
				case 3:
				System.out.println("�󼦰Թ������ϵͳ>�������");
				System.out.println("1.���˴����");
				System.out.println("2.���˳齱");
				System.out.println("3.�����ʺ�");
				System.out.println("��ѡ�����������֣�");
				score=input.nextInt();
				switch(score){
					case 1:
					break;
					case 2:
					System.out.print("�����󼦰Թ������ϵͳ > ���˳齱\n");
					System.out.print("������4λ��Ա�ţ�");
					int data=input.nextInt();
					String code="";
					Random random=new Random();//���������
					for(int i=1;i<=6;i++){
						code+=random.nextInt(10);
					}
					System.out.println("�������������"+code);
					code=code.substring(2,6);
					System.out.println("���������������λ��"+code);
					int a=Integer.parseInt(code);//ת��Ϊ��������
					if(a==data){
						System.out.println(data+"�ſͻ������˿ͻ�����ý���");
					}else{
						System.out.println(data+"�ſͻ�,лл����֧�֣�");
					}
					break;
					case 3:
					break;
					default:
					System.out.println("�������");
					return;
				}
				break;
				case 4:
				break;
				default:
				System.out.println("�������");
				break;
			}
			return;
			default:
			System.out.println("���˳�");
			break;
		}
	}
}