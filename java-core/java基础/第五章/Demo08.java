/*1��ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��
2������ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
�ۼӵ��ܽ��
������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ��������
3������ϵͳ���˵�����ʾ�û��������֣�����ѡ�������Ӧģ��
�û����������Ҫ���ظ����룬ֱ��������ȷ��ִ����Ӧ���ܺ��˳�ѭ��*/
import java.util.Scanner;
public class Demo08{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		String pd="y";
		int sb;
		int sr;
		int sum=0;
		//����1
		System.out.println("");
		System.out.println("");
		System.out.println("****************************����1*************************");
		System.out.println("MyShopping����ϵͳ > �������");
		System.out.println("");
		System.out.println("");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��    2.����Ь   3.������");
		System.out.println("***********************************************************");
		System.out.println("");
		while(pd.equals("y")){
			System.out.print("��������Ʒ��ţ�");
			sb=input.nextInt();	
			switch(sb){
				case 1:
					System.out.println("T��        ��245.0");
					break;
				case 2:
					System.out.println("����Ь    ��570.0");
					break;
				case 3:
					System.out.println("������    ��320.0");
					break;
				default:
						System.out.println("�����������������");

			}
			System.out.println("");
			System.out.println("");
			System.out.print("�Ƿ����(y/n)");
			pd=input.next();
		}
		System.out.println("���������");


		//����2
		pd="y";
		System.out.println("");
		System.out.println("");
		System.out.println("****************************����2*************************");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��    2.����Ь   3.������");
		System.out.println("***********************************************************");
		System.out.println("");
		while(pd.equals("y")){
			System.out.print("��������Ʒ��ţ�");
			sb=input.nextInt();
			System.out.print("�����빺��������");
			int sl=input.nextInt();	
			switch(sb){
				case 1:
					System.out.println("T��  ��245.0          ����"+sl+"          �ϼƣ�"+245.0*sl);
					sum+=245.0*sl;
					break;
				case 2:
					System.out.println("����Ь  ��570.0          ����"+sl+"          �ϼƣ�"+570.0*sl);
					sum+=245.0*sl;
					break;
				case 3:
					System.out.println("������  ��320.0          ����"+sl+"          �ϼƣ�"+320.0*sl);
					sum+=245.0*sl;
					break;
				default:
						System.out.println("����������������룺");
					break;
				}
			System.out.println("");
			System.out.println("");
			System.out.print("�Ƿ����(y/n)");
			pd=input.next();
		}
		System.out.println("������ʵ����");
		int sf=input.nextInt();
		System.out.println("");
		System.out.println("");
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����"+0.8*sum);
		System.out.println("ʵ����"+sf);
		System.out.println("��Ǯ��"+(sf-0.8*sum));
		


		//����3
		System.out.println("");
		System.out.println("");
		System.out.println("****************************����3*************************");
		System.out.println("��ӭʹ��MyShopping����ϵͳ ");
		System.out.println("");
		System.out.println("");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("1���ͻ���Ϣ����");
		System.out.println("2���������");
		System.out.println("3���������");
		System.out.println("4��ע��");
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.print("��ѡ���������֣�");
		sr=input.nextInt();
		switch(sr){
			case 1:
				System.out.println("ִ�пͻ���Ϣ����");
				break;
			case 2:
				System.out.println("ִ�й������");
				break;
			case 3:
				System.out.println("ִ���������");
				break;
			case 4:
				System.out.println("�����˳�");
				break;
			default:
				while(sr>4||sr<1){
					System.out.println("���������������");
					sr=input.nextInt();
				}
				break;
			}
		
	}	
}