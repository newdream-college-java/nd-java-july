package chapter_13_1;
/*1.6��дһ����ѧ�ҵ��࣬�����д������ķ�������:	*/
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
		 System.out.println("���������������Ƚϴ�С�õ���ģ���");
		 int az=sc.nextInt();
		 int bz=sc.nextInt();
		 System.out.println(az+"\t"+bz+"\t��"+a.max(az, bz)+"�Ǵ���");
		 System.out.println("������һ�������õ���λ������");
		 int cz=sc.nextInt();
		 System.out.println(cz+"�ĸ�λ�ǣ�"+a.gewei(cz));
		 System.out.println("������һ�������õ�������������");
		 int dz=sc.nextInt();
		 System.out.println(dz+"�������ǣ�"+a.lifang(dz));
		 System.out.println("������һ������1+��������ĺͣ���");
		 int ez=sc.nextInt();
		 System.out.println((1+"�ӵ���"+ez)+a.leijia(ez));
		 
	}
}
