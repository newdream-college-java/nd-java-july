import java.util.Scanner;
public class Demo04{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//������� 1 �� 1 �յ������������
		int yem=input.nextInt();
		int day=input.nextInt();
		int sum=0;
		switch(yem){
			case 7:
			
				sum+=day;
			case 6:
			
				sum+=30;
			case 5:
				sum+=31;
			case 4:
				sum+=30;
			case 3:
				sum+=31;
			case 2:
				sum+=28;
			case 1:
				sum=sum+31;
				System.out.println(sum);
				break;
			default:
			System.out.println("�������������");
			break;
		}
	}
}