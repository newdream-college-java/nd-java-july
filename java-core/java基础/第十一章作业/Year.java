import java.util.Scanner;


public class Year {
	public void way(int year){
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.print("该年是闰年");
		}else{
			System.out.print("该年不是闰年");
		}
		
	}
	public static void main(String[] args) {
		Year y=new Year();
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入年份");
		int a=sc.nextInt();
		y.way(a);
	}

}
