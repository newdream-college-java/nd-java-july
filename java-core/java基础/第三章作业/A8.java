import java.util.Scanner;
public class A8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入会员号(<4位整数>):");
		int a = input.nextInt();
		String aa = String.format("%4d",a).replace(" ","0");
		System.out.print("请输入会员生日(月)");
		int m = input.nextInt();
		String mm = String.format("%2d",m).replace(" ","0");
		System.out.print("请输入会员生日(日)");
		int d = input.nextInt();
		String dd = String.format("%2d",d).replace(" ","0");
		System.out.print("请输入会员积分");
		int b = input.nextInt();
		System.out.println("已录入的会员信息是:");
		System.out.println(aa+"\t"+mm+"/"+dd+"\t"+b);
		if(a>9999 || a<1){
			System.out.println("会员信息有误");
			return;
		}else if(m>12 || m<1){
			System.out.println("会员信息有误");
			return;
		}		
	}
}