/*1.7�� �Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ����Ϣ������ 1~7 ֮���ֵʱ����ʾ�����������룬ֱ������ 0 �˳�ѭ����
1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN*/
import java.util.*;
public class Work07{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("���������֣�1-7����");
			int a =sc.nextInt();
			switch(a){
				case 1:
					System.out.println("1:MON");
					break;
				case 2:
					System.out.println("2:TUE");
					break;
				case 3:
					System.out.println("3:WED");
					break;
				case 4:
					System.out.println("4:THU");
					break;
				case 5:
					System.out.println("5:FRI");
					break;
				case 6:
					System.out.println("6:SAT");
					break;
				case 7:
					System.out.println("7:SUN");
					break;
				case 0:
					System.out.println("ϵͳ�˳�����");
					System.exit(-1);
					break;
				default:
					System.out.println("����������������룡��");
					break;

			}
		}
	}
}