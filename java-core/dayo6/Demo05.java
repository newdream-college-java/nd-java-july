import java.util.Scanner;
public class Demo05{
	public static void main(String[] args){
		//ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
		Scanner input=new Scanner(System.in);
		System.out.println("�����󼦰Թ���ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ\n\n");
		int userName=0;
		String birthday;
		int integral;
		for(int i=1 ;i<=3;i++){
			System.out.print("�������Ա��(<4λ����>):");
			if(input.hasNextInt()){
				userName = input.nextInt();
				if(userName<1000&&userName>=10000){
					System.out.println("��ʾ¼��ʧ��");
				}
			}else{
				System.out.println("��ʾ¼��ʧ��");
				input=new Scanner(System.in);
			}
			System.out.print("�������Ա����(��/��<����������ʾ>):");
			birthday=input.next();
			System.out.print("�������Ա����:");
			integral=input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��:");
			System.out.println(userName+"\t"+birthday+"\t"+integral);
		}
		System.out.print("���������");
	}
}