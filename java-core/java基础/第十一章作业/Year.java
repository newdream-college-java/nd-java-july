import java.util.Scanner;


public class Year {
	public void way(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.print("����������");
		}else{
			System.out.print("���겻������");
		}
		
	}
	public static void main(String[] args) {
		Year y=new Year();
		Scanner sc=new Scanner(System.in);
		System.out.print("���������");
		int a=sc.nextInt();
		y.way(a);
	}

}
