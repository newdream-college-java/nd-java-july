
public class Math {
	public int max(int a,int b){
		return a>b?a:b;
	}
	public int ge(int a){
		return a%10;
	}
	public int li(int a){
		return a*a*a;
	}
	public int sum(int a){
		int b=0;
		for(int i=1;i<=a;i++){
			b+=i;
		}
		return b;
	}

}
