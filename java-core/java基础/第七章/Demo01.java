/*
1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4����
��� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����
*/
import java.util.*;
public class Demo01{
	public static void main (String [] args){
		
		int n=1;
		while(true){
			Scanner input = new Scanner (System.in);
			System.out.print("������һ��������(0-10)��");
			if(input.hasNextInt()){
				int a = input.nextInt();
				if(a<=10&&a>0){
					for(int i =1;i<=a;i++){
						n=n*i;
					}
					System.out.print(a+"�Ľ׳�Ϊ��"+n);
					System.exit(-1);
				}
				else{
					System.out.println("���볬����Χ��");
				}
			}else{
				System.out.println("����������������");
				//input.reset();
				
			}
		}

	}
}