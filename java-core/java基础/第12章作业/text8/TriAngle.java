package job01.text8;

public class TriAngle {
	public void panDuan(int a,int b,int c) {
		if(a+b>c&&a+c>b&&b+c>a) {
			triType(a,b,c);
		}else {
			System.out.println("这三条边不能构成一个三角形！");
		}
	}
	
	public void triType(int a,int b,int c) {
		if(a*a==(b*b+c*c)||b*b==(a*a+c*c)||c*c==a*a+b*b) {
			System.out.println("这三条边构成了一个直角三角形！");
		}else if (a*a>(b*b+c*c)||b*b>(a*a+c*c)||c*c>a*a+b*b) {
			System.out.println("这三条边构成了一个钝角三角形！");
		}else if (a==b&&b==c) {
			System.out.println("这三条边构成了一个等边三角形！");
		}else {
			System.out.println("这三条边构成了一个锐角三角形！");
		}
	}
}
