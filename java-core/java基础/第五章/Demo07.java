/*
1.7�� �Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ����Ϣ������ 1~7 ֮��
��ֵʱ����ʾ�����������룬ֱ������ 0 �˳�ѭ����
1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN 
*/
import java.util.Scanner;
public class Demo07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num ;
		do{
			System.out.print("������1-7�е�һ�������䡰n���˳�����");
			num = sc.nextInt();
			while(num!=1&&num!=2&&num!=3&&num!=4&&num!=5&&num!=6&&num!=7&&num!=0){
				System.out.print("���������������������룺");
				num = sc.nextInt();
			}
			switch(num){
				case 1:
					System.out.println("MON");
					break;
				case 2:
					System.out.println("TUE");
					break;
				case 3:
					System.out.println("WED");
					break;
				case 4:
					System.out.println("THU");
					break;
				case 5:
					System.out.println("FRI");
					break;
				case 6:
					System.out.println("SAT");
					break;				
				default :
					System.out.println("SUN");
					break;
			}
		}while(num != 0);
	}
}