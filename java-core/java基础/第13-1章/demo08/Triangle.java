/*1. 根据三角形的三条边长，判断其是直角、钝角，还是锐角三角形。主要
功能如下:1)先输入三角形三条边的边长 2)判断是否构成三角形，是否构成条件是“任意 两
边之和大于第三边“，若不能则提示错误 3)若能构成，判断三角形的任意一边的平方等 于
其它两边的平方的和，则为直角三角形;若任意一边的平方大于其它两边平方的和，则为 钝
角三角形;否则，为锐角三角形。
*/
package demo08;

public class Triangle {
	public void triangle(int a,int b,int c){
		if(a+b>c&&a+c>b&&b+c>a){
			if(a*a+b*b==c*c||a*a+c*c==b*b||c*c+b*b==a*a){
				System.out.println("该三角形为直角三角形");
			}else if(a*a+b*b<c*c||a*a+c*c<b*b||c*c+b*b<a*a){
				System.out.println("该三角形为钝角三角形");
			}else {
				System.out.println("该三角形为锐角三角形");
			}
		}else{
			System.out.println("不是三角形");
		}
	}
}
