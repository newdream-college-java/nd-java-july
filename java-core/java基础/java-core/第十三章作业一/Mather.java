package chapter_13_1;
/*1.6、写一个数学家的类，类中有带参数的方法如下:	*/
import java.util.Scanner;

public class Mather {
	public int max(int a,int b){
		int max=a>b?a:b;
		return max;
	}
	 public int gewei(int c){
		 int gewei=c%10;
		 return gewei;
	 }
	 public int lifang(int d){
		 int lifang=d*d*d;
		 return lifang;
	 }
	 public int leijia(int e){
		 int sum=0;
		 for(int i=1;i<=e;i++){
			 sum+=i;
		 }
		 return sum;
	 }
	 public static void main(String[] args) {
		 Mather a= new Mather();
		 Scanner sc=new Scanner(System.in);
		 System.out.println("请输入两个数（比较大小得到大的）：");
		 int az=sc.nextInt();
		 int bz=sc.nextInt();
		 System.out.println(az+"\t"+bz+"\t中"+a.max(az, bz)+"是大者");
		 System.out.println("请输入一个数（得到个位数）：");
		 int cz=sc.nextInt();
		 System.out.println(cz+"的个位是："+a.gewei(cz));
		 System.out.println("请输入一个数（得到它的立方）：");
		 int dz=sc.nextInt();
		 System.out.println(dz+"的立方是："+a.lifang(dz));
		 System.out.println("请输入一个数（1+到这个数的和）：");
		 int ez=sc.nextInt();
		 System.out.println((1+"加到："+ez)+a.leijia(ez));
		 
	}
}
