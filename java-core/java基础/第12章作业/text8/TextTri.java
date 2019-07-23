package job01.text8;

/*1. 根据三角形的三条边长，判断其是直角、钝角，还是锐角三角形。主要
功能如下:1)先输入三角形三条边的边长 2)判断是否构成三角形，是否构成条件是“任意 两
边之和大于第三边“，若不能则提示错误 3)若能构成，判断三角形的任意一边的平方等 于
其它两边的平方的和，则为直角三角形;若任意一边的平方大于其它两边平方的和，则为 钝
角三角形;否则，为锐角三角形。*/
import java.util.Scanner;

public class TextTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		TriAngle tri=new TriAngle();
		for(int i=1;;i++) {
			System.out.print("请输入第一条边：");
			int a=scanner.nextInt();
			System.out.print("请输入第二条边：");
			int b=scanner.nextInt();
			System.out.print("请输入第三条边：");
			int c=scanner.nextInt();
			tri.panDuan(a, b, c);
			System.out.print("继续吗？（y/n）");
			char ans=scanner.next().charAt(0);
			if(ans=='y') {
				continue;
			}else {
				System.out.println("谢谢使用！");
				return;
			}
		}
		
	}

}
