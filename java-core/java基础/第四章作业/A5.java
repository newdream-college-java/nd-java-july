/*������� 1 �� 1 �յ������������*/
import java.util.Scanner;
public class A5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�����뵱ǰ�·ݣ�");
		int month = input.nextInt();
		System.out.print("�����뵱ǰ���ڣ�");
		int day = input.nextInt();
		int sum;
		switch(month){
			case 1:
				sum = day - 1;
				if(sum == 0){
					System.out.print("������һ��һ��");
				}else {
					System.out.println("�����һ��һ�գ�"+sum+"��");
				}
				break;
			case 2:	
				sum = 31 + day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 3:	
				sum = 31 +28+ day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 4:	
				sum = 31 + 28+31+day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 5:	
				sum = 31 + 28+31+30+day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 6:	
				sum = 31 +28+31+30+31+ day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 7:	
				sum = 31 + 31 +28+31+30+31+day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 8:	
				sum = 31 + 31 +28+31+30+31+30+ day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 9:	
				sum = 31 +  31 +28+31+30+31+30+31+day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 10:	
				sum = 31 +  31 +28+31+30+31+30+31+ 31+ day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 11:	
				sum = 31 +   31 +28+31+30+31+30+31+ 31+30+day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
			case 12:	
				sum = 31 + 31 +28+31+30+31+30+31+ 31+30+31+day -1;
				System.out.println("�����һ��һ�գ�"+sum+"��");
				break;
		}

	}
} 