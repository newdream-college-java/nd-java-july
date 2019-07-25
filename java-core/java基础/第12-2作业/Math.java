
public class Math {
	public int sum(int[] a){
		int b=0;
		for (int i = 0; i < a.length; i++) {
			b+=a[i];
		}
		return b;
	}
	
	public int max(int[] a){
		int b=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<a[i+1]){
				b=a[i+1];
			}
		}
		return b;
	}

}
