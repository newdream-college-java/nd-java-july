import java.util.Scanner;
public class Demo01{
	public static void main(String[] args){
		//1.1�� ���ʵ�ֽ����û����������������������Ľ׳ˡ����磺�������� 4����
			//��� 4!=4*3*2*1=24��Ҫ���������� 1~10��������ʾ����
		Scanner input=new Scanner(System.in);
		System.out.println("������1-10������������ô�ǽ��������Ľ׳�");
		int data;
		if(input.hasNextInt()){
		data=input.nextInt();
		if(data<1||data>10){
		System.out.println("�������");
		System.exit(-1);
		}
		}else{
			System.out.print("������1-10��������");
			return;
		}
		int sum=1;
		System.out.print(data+"!=");
		for(int i=1;i<=data;i++){
			sum*=i;
		if(i==data){
			System.out.print(i);
		}else{
		System.out.print(i+"*");	}
		}
		System.out.println("="+sum);
	}
}