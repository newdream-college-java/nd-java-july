import java.util.Scanner;
public class A7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������1~7֮�������");
		int i = input.nextInt();
		switch(i){
			case 1:
				System.out.print("MON");
				break;
			case 2:
				System.out.print("TUE");
				break;
			case 3:
				System.out.print("WED");
				break;
			case 4:
				System.out.print("THU");
				break;
			case 5:
				System.out.print("FRI");
				break;
			case 6:
				System.out.print("SAT");
				break;
			case 7:
				System.out.print("SUN");
				break;
			default:
				while(i!=0){
					System.out.print("����������0�˳�");
				        i = input.nextInt();
				}
				break;
		}
	}
}