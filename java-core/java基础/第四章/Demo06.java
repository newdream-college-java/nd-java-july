/*
2.5�� ������� 1 �� 1 �յ��������������
*/
import java.util.Scanner;
public class Demo06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		System.out.print("���������ڣ�");
		int day = input.nextInt();
		int sum;
		switch(month){
			case 1:
				if(day == 1){
					System.out.println("�������һ��һ�գ�����");
				}
				else{
				sum = day - 1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				}
				break;
			case 2:	
				sum = 31 + day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 3:	
				sum = 31 +28+ day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 4:	
				sum = 31 + 28+31+day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 5:	
				sum = 31 + 28+31+30+day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 6:	
				sum = 31 +28+31+30+31+ day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 7:	
				sum = 31 + 31 +28+31+30+31+30+day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 8:	
				sum = 31 + 31 +28+31+30+31+30+31+ day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 9:	
				sum = 31 +  31 +28+31+30+31+30+31+ 31+day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 10:	
				sum = 31 +  31 +28+31+30+31+30+31+ 31+30+ day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 11:	
				sum = 31 +   31 +28+31+30+31+30+31+ 31+30+31+day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
			case 12:	
				sum = 31 +   31 +28+31+30+31+30+31+ 31+30+31+30+day -1;
				System.out.println("��һ��һ�գ�"+sum+"�죡����");
				break;
				
			
		}

	}
}