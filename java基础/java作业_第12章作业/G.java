import java.util.Scanner;


public class G {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		G p = new G();
		System.out.println("����������");
		double a = input.nextDouble();
		System.out.println("���������ʣ�");
		double v = input.nextDouble();
		System.out.println("������������ޣ�");
		int c = input.nextInt();
		p.show(a, v, c);
		
	}		

	public void show(double je,double ll,int nx){
		double zlx;
		double yhk;
		zlx=je*ll;
		yhk=(zlx+je)/nx;
		System.out.println("����ϢΪ��"+zlx+"�»�����Ϊ��"+yhk);

	}
}

