import java.util.*;
public class G{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������(1~7)");
		int a;
		do{
			a = input.nextInt();
		switch(a){
		
			
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("1��MON \t2��TUE \t3��WED \t4��THU \t5��FRI \t6��SAT \t7��SUN");
			break;
		
		
			case 0:
			System.out.println("�˳�ѭ����");
			break;
			default:
			System.out.println("�������������룺");
			
		}
		}while(a>7 || a<0);
		
	}
}