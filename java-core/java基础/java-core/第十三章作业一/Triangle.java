package chapter_13_1;
import java.util.Scanner;
import java.util.Arrays;

/*】 1. 根据三角形的三条边长，判断其是直角、钝角，还是锐角三角形。主要
功能如下:1)先输入三角形三条边的边长 2)判断是否构成三角形，是否构成条件是“任意 两
边之和大于第三边“，若不能则提示错误 3)若能构成，判断三角形的任意一边的平方等 于
其它两边的平方的和，则为直角三角形;若任意一边的平方大于其它两边平方的和，则为 钝
角三角形;否则，为锐角三角形。*/
public class Triangle {
	public void panduan(double []bianchang){
		if(bianchang[0]+bianchang[1]>bianchang[2]){
			if(bianchang[0]*bianchang[0]+bianchang[1]*bianchang[1]==bianchang[2]*bianchang[2]){
				System.out.println("直角三角形");
			}else if(bianchang[0]*bianchang[0]+bianchang[1]*bianchang[1]<bianchang[2]*bianchang[2]){
				System.out.println("钝角三角形");
			}else{
				System.out.println("锐角三角形");
			}
		}else{
			System.out.println("你输入的边长不能构成三角形！");
		}
		
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入三条边长：");
		double []bianchangz=new double[3];
		for (int i = 0; i < bianchangz.length; i++) {
			System.out.print("请输入第"+(i+1)+"条边长：");
			bianchangz[i]=sc.nextDouble();
		}
		Arrays.sort(bianchangz);
		t.panduan(bianchangz);
	}
	

}
