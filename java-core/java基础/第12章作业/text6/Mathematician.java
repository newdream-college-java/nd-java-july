package job01.text6;

public class Mathematician {
	public int twoInt(int a,int b) {
	return a>b?a:b;
	}
	
	public int geWei(int a) {
		return a%10;
	}
	
	public int liFang(int a) {
		return a*a*a;
	}
	
	public int Sum(int a) {
		if(a>0) {
		a+=Sum(a-1);
		}
		return a;
	}
}
