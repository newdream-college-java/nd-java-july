import java.util.Scanner;

/**
 * ģ�������˻�ҵ�񣺱�д Account �࣬��Ӵ��η���ʵ�ִ���ȡ��ҵ�񣬴���
 *	ʼ 0 Ԫ��ȡ��ʱ��Ҫ�ж�����Ƿ���㣬��ͼ:
 * @author 54975
 *
 */
public class Account {
	double sum=0;
	public void addmonth(double month){
		sum+=month;
		System.out.println("���ɹ�");
		System.out.println("***��ǰ���Ϊ��"+sum+"Ԫ***");
	}
	public void getMonth(double month){
		if(sum>month){
			sum-=month;
			System.out.println("ȡ��ɹ�");
			System.out.println("***��ǰ���Ϊ��"+sum+"Ԫ***");
		}else{
			System.out.println("ȡ��ʧ��");
			System.out.println("***��ǰ���Ϊ��"+sum+"Ԫ***");
		}
	}
	public static void main(String[] args) {
		Account a=new Account();
		Scanner input=new Scanner(System.in);
		for(;;){
			System.out.println("1.���\t2.ȡ��\t0.�˳�");
			System.out.print("��ѡ������Ҫ�����ҵ��:");
			int c=input.nextInt();
			if(c==1){
				System.out.print("����������:");
				double month=input.nextDouble();
				a.addmonth(month);
			}else if(c==2){
				System.out.print("������ȡ����:");
				double month=input.nextDouble();
				a.getMonth(month);
			}else{
				System.out.println("ллʹ��");
			}
		}
	}
}
