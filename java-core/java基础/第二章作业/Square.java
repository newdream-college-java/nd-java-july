/*2、输入一个变量保存正方形的边长，计算此正方形的周长，及面积。*/
import java.util.Scanner;
public class Square{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入正方形边长：");
		double l=input.nextDouble();
		double c,s;
		c=4*l;
		s=l*l;
		System.out.println("边长\t周长\t面积");
		System.out.println(l+"\t"+c+"\t"+s);
	}
}