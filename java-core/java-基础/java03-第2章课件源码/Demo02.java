/*已知圆的半径为 5 ，求圆的周长和面积，然后输出
半径		周长		面积
5		xx		xx
*/

public class Demo02{
	public static void main(String[] args){
		int r = 5;
		double z = 2*3.14*r;
		double s =3.14*r*r;
		System.out.println("半径\t周长\t\t\t面积");
		System.out.println(r +"\t"+ z +"\t"+ s);
		boolean f = (20==10+10)||!(3>6)&&(100%3-55/4)%2>99||!(100==20+80);
		System.out.println("结果为："+f);
	}
}