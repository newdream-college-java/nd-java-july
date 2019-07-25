package chapter12_1;

public class Triangle {
	boolean flag = false;
	public void judge(double a,double b,double c){
		if(a+b>c&&a+c>b&&b+c>a){
			flag =true;
			if(a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a){
				System.out.println("这是直角三角形呢！");
			}else if(a*a+b*b<c*c||a*a+c*c<b*b||b*b+c*c<a*a){
				System.out.println("这是钝角三角形呢！");
			}else{
				System.out.println("这是锐角三角形呢！");
			}
		}
		if(!flag){
			System.out.println("不构成三角形！！！");
		}
	}
	
}
