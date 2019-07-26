import java.util.Scanner;


public class G {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		G p = new G();
		System.out.println("请输入贷款金额：");
		double a = input.nextDouble();
		System.out.println("请输入利率：");
		double v = input.nextDouble();
		System.out.println("请输入贷款年限：");
		int c = input.nextInt();
		p.show(a, v, c);
		
	}		

	public void show(double je,double ll,int nx){
		double zlx;
		double yhk;
		zlx=je*ll;
		yhk=(zlx+je)/nx;
		System.out.println("总利息为："+zlx+"月还款金额为："+yhk);

	}
}

